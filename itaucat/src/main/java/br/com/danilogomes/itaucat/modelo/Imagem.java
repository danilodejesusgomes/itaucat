package br.com.danilogomes.itaucat.modelo;

/**
 * Classe que representa uma Foto(de um Gato) e sua estrutura é usada para recepcionar
 * o consumo da API externa da (https://thecatapi.com/): 
 * 
 * Consulta de Foto por IdRaca
 * @see https://api.thecatapi.com/v1/images/search?breed_ids=abys
 * 
 * Consulta de Foto por IdCategoria
 * @see https://api.thecatapi.com/v1/images/search?category_ids=1
 * 
 * @author Danilo Gomes
 * @version 0.1
 */

public class Imagem {
	
	private String url;

	public String getUrl() { 
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	

}
