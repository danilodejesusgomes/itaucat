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
 * Classe para realização de testes automaticos da classe FotoController
 * 
 * @author Danilo Gomes
 * @version 0.1
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class FotoControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	/**
	 * Testando a Rota /foto da classe FotoController
	 */
	@Test
	public void testDeveriaDevolver200ListaCarregada() throws Exception {
		URI uri = new URI("/foto");
		
		mockMvc
		.perform(MockMvcRequestBuilders
				.get(uri)
				.contentType(MediaType.APPLICATION_JSON))
		.andExpect(MockMvcResultMatchers
				.status()
				.is(200));		
	}
	
	/**
	 * Testando a Rota /foto/categoria/{categoria} da classe FotoController
	 */
	@Test
	public void testDeveriaDevolver200ListaCategoriaCarregada() throws Exception {
		
		
		URI uri = new URI("/foto/categoria/1");
		
		mockMvc
		.perform(MockMvcRequestBuilders
				.get(uri)
				.contentType(MediaType.APPLICATION_JSON))
		.andExpect(MockMvcResultMatchers
				.status()
				.is(200));		
	}
	
	/**
	 * Testando a Rota /foto/raca/{raca} da classe FotoController
	 */
	@Test
	public void testDeveriaDevolver200ListaRacaCarregada() throws Exception {
		
		
		URI uri = new URI("/foto/raca/Aaaa");
		
		mockMvc
		.perform(MockMvcRequestBuilders
				.get(uri)
				.contentType(MediaType.APPLICATION_JSON))
		.andExpect(MockMvcResultMatchers
				.status()
				.is(200));		
	}

}
