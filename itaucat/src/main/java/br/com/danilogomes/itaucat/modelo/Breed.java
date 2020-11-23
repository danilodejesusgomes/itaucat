package br.com.danilogomes.itaucat.modelo;

/**
 * Classe que representa uma Breed(Raça de Gato) e sua estrutura é usada para recepcionar
 * o consumo da API externa da (https://thecatapi.com/): 
 * 
 * @see https://api.thecatapi.com/v1/breeds
 * 
 * @author Danilo Gomes
 * @version 0.1
 */

public class Breed {
	
	private String id;
	private String name;
	private String temperament;
	private String origin;
	
	
	public String getId() { 
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTemperament() {
		return temperament;
	}
	public void setTemperament(String temperament) {
		this.temperament = temperament;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
}
