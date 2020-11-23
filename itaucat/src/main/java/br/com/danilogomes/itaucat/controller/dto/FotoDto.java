package br.com.danilogomes.itaucat.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.danilogomes.itaucat.modelo.Foto;

/**
 * Classe que representa um Foto(Imagem de Gato) e sua estrutura é usada para disponibilização de atributos externamente.
 * Usada como interface de exibicao externa de um objeto Foto. 
 * Hoje não esta restringindo nenhum atributo do modelo de dados para exibição externa, mas deixo criado para
 * futuras restrições de atribudos
 * 
 * @author Danilo Gomes
 * @version 0.1
 */

public class FotoDto {
	
	private Long id;
	private String endImagem;
	private String IdRaca;
	private String idCategoria;
	
	/**
	 * Construtor para inicializar objeto FotoDto
	 * 
	 * @param foto
	 */
	public FotoDto(Foto foto) {
		this.id = foto.getId();
		this.endImagem = foto.getEndImagem();
		this.IdRaca = foto.getIdRaca();
		this.idCategoria = foto.getIdCategoria();
	}
	
	public Long getId() {
		return id;
	}
	public String getEndImagem() {
		return endImagem;
	}
	public String getIdRaca() {
		return IdRaca;
	}
	public String getIdCategoria() {
		return idCategoria;
	}

	public static List<FotoDto> converter(List<Foto> fotos) {
		return fotos.stream().map(FotoDto::new).collect(Collectors.toList());
	}
	
	

}
