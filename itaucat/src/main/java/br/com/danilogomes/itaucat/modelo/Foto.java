package br.com.danilogomes.itaucat.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Classe que representa uma Foto(Imagem de um gato) e sua estrutura é usada como repositório no base de dados
 * 
 * @author Danilo Gomes
 * @version 0.1
 */

@Entity
public class Foto {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String endImagem;
	private String idRaca;
	private String idCategoria;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEndImagem() {
		return endImagem;
	}
	public void setEndImagem(String endImagem) {
		this.endImagem = endImagem;
	}
	public String getIdRaca() {
		return idRaca;
	}
	public void setIdRaca(String idRaca) {
		this.idRaca = idRaca;
	}
	public String getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(String idCategoria) {
		this.idCategoria = idCategoria;
	}

}
