package br.com.danilogomes.itaucat.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.danilogomes.itaucat.controller.dto.FotoDto;
import br.com.danilogomes.itaucat.modelo.Foto;
import br.com.danilogomes.itaucat.repository.FotoRepository;

/**
 * Classe que representa os controles de acessos referentes ao objeto Foto
 * Responsavel por controlar as rotas de acesso as APIs de acesso a classe Foto
 * 
 * @author Danilo Gomes
 * @version 0.1
 */

@RestController
public class FotoController {

	@Autowired
	private FotoRepository fotoRepository;
	
	
	/**
	 * Função resposavel por listar todos as fotos da base de dados.
	 * 
	 * @return Lista de Fotos
	 */
	@RequestMapping(value="/foto", method = RequestMethod.GET)
	public List<FotoDto> listaTudo() {
		List<Foto> fotos = fotoRepository.findAll();
		return FotoDto.converter(fotos);
	}
	
	/**
	 * Função resposavel por listar Fotos fitrando por categoria na base de dados.
	 * 
	 * @param idCategoria
	 * @return Lista de Fotos
	 */
	@RequestMapping(value="/foto/categoria/{idCategoria}", method = RequestMethod.GET)
	public List<FotoDto> listaPorCategoria(@PathVariable String idCategoria) {
		List<Foto> fotos = fotoRepository.findByIdCategoria(idCategoria);
		return FotoDto.converter(fotos);
	}
	
	/**
	 * Função resposavel por listar Fotos fitrando por Raça na base de dados.
	 * 
	 * @param idRaca
	 * @return Lista de Fotos
	 */
	@RequestMapping(value="/foto/raca/{idRaca}", method = RequestMethod.GET)
	public List<FotoDto> listaPorRaca(@PathVariable String idRaca) {
		List<Foto> fotos = fotoRepository.findByIdRaca(idRaca);
		return FotoDto.converter(fotos);
	}

}
