package br.com.danilogomes.itaucat.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.danilogomes.itaucat.modelo.Cat;

/**
 * Classe que representa um Cat(Gato) e sua estrutura é usada para disponibilização de atributos externamente.
 * Usada como interface de exibicao externa de um objeto gato. 
 * Hoje não esta restringindo nenhum atributo do modelo de dados para exibição externa, mas deixo criado para
 * futuras restrições de atribudos
 * 
 * @author Danilo Gomes
 * @version 0.1
 */

public class CatDto {
	
	private Long id;
	private String idRaca;
	private String nomeRaca;
	private String origem;
	private String temperamento;
	
	/**
	 * Construtor para inicializar objeto CatDto
	 * 
	 * @param cat
	 */
	public CatDto(Cat cat) {
		this.id = cat.getId();
		this.idRaca = cat.getIdRaca();
		this.nomeRaca = cat.getNomeRaca();
		this.origem = cat.getOrigem();
		this.temperamento = cat.getTemperamento();
	}
	
	public Long getId() {
		return id;
	}
	public String getIdRaca() {
		return idRaca;
	}
	public String getNomeRaca() {
		return nomeRaca;
	}
	public String getOrigem() {
		return origem;
	}
	public String getTemperamento() {
		return temperamento;
	}

	public static List<CatDto> converter(List<Cat> cats) {
		return cats.stream().map(CatDto::new).collect(Collectors.toList());
	}
	
}
