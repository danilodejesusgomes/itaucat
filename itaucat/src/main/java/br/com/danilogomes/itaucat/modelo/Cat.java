package br.com.danilogomes.itaucat.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Classe que representa um Cat(Gato) e sua estrutura é usada como repositório no base de dados
 * 
 * @author Danilo Gomes
 * @version 0.1
 */

@Entity
public class Cat {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String idRaca;
	private String nomeRaca;
	private String origem;
	private String temperamento;
		
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIdRaca() {
		return idRaca;
	}
	public void setIdRaca(String idRaca) {
		this.idRaca = idRaca;
	}
	public String getNomeRaca() {
		return nomeRaca;
	}
	public void setNomeRaca(String nomeRaca) {
		this.nomeRaca = nomeRaca;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getTemperamento() {
		return temperamento;
	}
	public void setTemperamento(String temperamento) {
		this.temperamento = temperamento;
	}
	
	
}
