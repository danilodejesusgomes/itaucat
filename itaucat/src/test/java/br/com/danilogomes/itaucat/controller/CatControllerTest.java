package br.com.danilogomes.itaucat.controller;

import java.net.URI;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * Classe para realização de testes automaticos da classe CatController
 * 
 * @author Danilo Gomes
 * @version 0.1
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class CatControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	/**
	 * Testando a Rota /cat da classe CatController
	 */
	@Test
	public void testDeveriaDevolver200ListaCarregada() throws Exception {
		URI uri = new URI("/cat");
		
		mockMvc
		.perform(MockMvcRequestBuilders
				.get(uri)
				.contentType(MediaType.APPLICATION_JSON))
		.andExpect(MockMvcResultMatchers
				.status()
				.is(200));		
	}
	
	/**
	 * Testando a Rota /cat/raca/{raca} da classe CatController
	 */
	@Test
	public void testDeveriaDevolver200ListaRacaCarregada() throws Exception {
		
		
		URI uri = new URI("/cat/raca/Aaaa");
		
		mockMvc
		.perform(MockMvcRequestBuilders
				.get(uri)
				.contentType(MediaType.APPLICATION_JSON))
		.andExpect(MockMvcResultMatchers
				.status()
				.is(200));		
	}
	
	/**
	 * Testando a Rota /cat/origem/{origem} da classe CatController
	 */
	@Test
	public void testDeveriaDevolver200ListaOrigemCarregada() throws Exception {
		
		
		URI uri = new URI("/cat/origem/Origem%eee");
		
		mockMvc
		.perform(MockMvcRequestBuilders
				.get(uri)
				.contentType(MediaType.APPLICATION_JSON))
		.andExpect(MockMvcResultMatchers
				.status()
				.is(200));		
	}
	
	/**
	 * Testando a Rota /cat/temperamento/{temperamento} da classe CatController
	 */
	@Test
	public void testDeveriaDevolver200ListaTemperamentoCarregada() throws Exception {
		
		
		URI uri = new URI("/cat/temperamento/ee");
		
		mockMvc
		.perform(MockMvcRequestBuilders
				.get(uri)
				.contentType(MediaType.APPLICATION_JSON))
		.andExpect(MockMvcResultMatchers
				.status()
				.is(200));		
	}
	
}
