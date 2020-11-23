package br.com.danilogomes.itaucat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;
import br.com.danilogomes.itaucat.modelo.Breed;
import br.com.danilogomes.itaucat.modelo.Cat;
import br.com.danilogomes.itaucat.modelo.Foto;
import br.com.danilogomes.itaucat.modelo.Imagem;
import br.com.danilogomes.itaucat.repository.CatRepository;
import br.com.danilogomes.itaucat.repository.FotoRepository;

/**
 * Classe que representa os controles de acessos referentes a carga inicial da base de dados
 * Responsavel por controlar a rota de acesso da API de solicitao de carga inicial da base de dados
 * 
 * @author Danilo Gomes
 * @version 0.1
 */

@RestController
public class CargaInicialController {
	
	@Autowired
	private CatRepository catRepository;
	
	@Autowired
	private FotoRepository fotoRepository;
	
	/**
	 * Fução responsavel por executar uma carga inicial na base de dados respeitando as seguinte regras ne negócios:
	 * 
	 * 1.- Coletar as seguintes informações da API de Gatos (https://thecatapi.com/): 
	 * 1.1 - a)	Para cada uma das raças de gatos disponíveis, armazenar as informações de origem, temperamento e nome da raça em uma base de dados;
	 * 1.2 - b)	Para cada uma das raças acima, salvar o endereço de 3 imagens em uma base de dados;
	 * 1.3 - c)	Salvar o endereço de 3 imagens de gatos com chapéu;
	 * 1.4 - d)	Salvar o endereço de 3 imagens de gatos com óculos;
	 *  
	 */
	@RequestMapping(value="/carga", method = RequestMethod.POST)
	public ResponseEntity<String> efetuarCargaInicialBancoDados() {
		
		long qtdeCats = catRepository.count();
		 
		if (qtdeCats <= 5) {
		
			RestTemplate tamplate = new RestTemplate();
				
			//https://api.thecatapi.com/v1/breeds
			UriComponents uriBreeds = UriComponentsBuilder.newInstance()
					.scheme("https")
					.host("api.thecatapi.com")
					.path("v1/breeds")
					.build();
			
			ResponseEntity<Breed[]> breeds = tamplate.getForEntity(uriBreeds.toUriString(), Breed[].class);
			Breed[] objetos = breeds.getBody().clone();
			
			for (int i = 0; i < objetos.length && i < 80 ; i++) {
				
				System.out.println("GRAVOU CAT: " + i);
				
				Cat cat = new Cat();
				cat.setIdRaca(objetos[i].getId());
				cat.setNomeRaca(objetos[i].getName());
				cat.setOrigem(objetos[i].getOrigin());
				cat.setTemperamento(objetos[i].getTemperament());
				
				catRepository.save(cat);
				
				//https://api.thecatapi.com/v1/images/search?breed_ids=abys
				UriComponents uriImagensPorBreed = UriComponentsBuilder.newInstance()
						.scheme("https")
						.host("api.thecatapi.com")
						.path("v1/images/search")
						.queryParam("breed_ids", objetos[i].getId())
						.build();
				
				
				//********************************************//
				//*** CARREGAR 3 FOTOS DESSA RACA DE GATO     //
				//********************************************//
				for (int x = 0; x < 3; x++) {
					
					ResponseEntity<Imagem[]> imagem = tamplate.getForEntity(uriImagensPorBreed.toUriString(), Imagem[].class);
					Imagem[] imagemCat = imagem.getBody().clone();
					
					Foto foto = new Foto();
					foto.setEndImagem(imagemCat[0].getUrl());
					foto.setIdRaca(objetos[i].getId());
					fotoRepository.save(foto);
					
				}
			}
			
			//********************************************//
			//*** CARREGAR 3 FOTOS DE GATOS COM CHAPEU    //
			//********************************************//
			String idCategoriaHats = "1";
			
			//https://api.thecatapi.com/v1/images/search?category_ids=1
			UriComponents uriImagensPorHats = UriComponentsBuilder.newInstance()
					.scheme("https")
					.host("api.thecatapi.com")
					.path("v1/images/search")
					.queryParam("category_ids", idCategoriaHats)
					.build();
			
			for (int i = 0; i < 3; i++) {
			
				ResponseEntity<Imagem[]> imagemChapeu = tamplate.getForEntity(uriImagensPorHats.toUriString(), Imagem[].class);
				Imagem[] objImagemChapeu = imagemChapeu.getBody().clone();
				
				Foto fotoChapeu = new Foto();
				fotoChapeu.setEndImagem(objImagemChapeu[0].getUrl());
				fotoChapeu.setIdCategoria(idCategoriaHats);
				fotoRepository.save(fotoChapeu);
			
			}
			System.out.println("GRAVOU FOTOS DE CAT COM CHAPEU");
			
			//************************************************//
			//*** CARREGAR 3 FOTOS DE GATOS COM OCULOS DE SOL //
			//************************************************//
			
			String idCategoriaSun = "4";
			
			//https://api.thecatapi.com/v1/images/search?category_ids=1
			UriComponents uriImagensPorSunglasses= UriComponentsBuilder.newInstance()
					.scheme("https")
					.host("api.thecatapi.com")
					.path("v1/images/search")
					.queryParam("category_ids", idCategoriaSun)
					.build();
			
			for (int i = 0; i < 3; i++) {
			
				ResponseEntity<Imagem[]> imagemChapeu = tamplate.getForEntity(uriImagensPorSunglasses.toUriString(), Imagem[].class);
				Imagem[] objImagemChapeu = imagemChapeu.getBody().clone();
				
				Foto fotoChapeu = new Foto();
				fotoChapeu.setEndImagem(objImagemChapeu[0].getUrl());
				fotoChapeu.setIdCategoria(idCategoriaSun);
				fotoRepository.save(fotoChapeu);
			
			}
			System.out.println("GRAVOU FOTOS DE CAT COM OCULOS DE SOL");

			return ResponseEntity.ok(new String("Carga Inicial realizado com sucesso"));
		} else {
			return ResponseEntity.badRequest().body(new String("Carga inicial já foi realizada"));
		}
	}

}
