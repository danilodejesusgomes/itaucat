package br.com.danilogomes.itaucat.repository;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.danilogomes.itaucat.modelo.Foto;

/**
 * Classe para realização de testes automaticos da classe FotoRepository
 * 
 * @author Danilo Gomes
 * @version 0.1
 */

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ActiveProfiles("dev")
public class FotoRepositoryTest {
	
	@Autowired
	private FotoRepository fotoRepository;
	
	/**
	 * Testando função findByIdRaca da classe FotoRepository
	 */
	@Test
	public void deveCarregarFotoPorRaca() {
		String idRaca = "Aaaa";
		List<Foto> fotos = fotoRepository.findByIdRaca(idRaca);
		Assert.assertNotNull(fotos);
	}
	
	/**
	 * Testando função findByIdRaca da classe FotoRepository
	 * Cenário lista vazia
	 */
	@Test
	public void deveNaoEncontrarFotoPorRaca() {
		String idRaca = "Wwww";
		List<Foto> fotos = fotoRepository.findByIdRaca(idRaca);
		Assert.assertTrue(fotos.isEmpty());
	}
	

	/**
	 * Testando função findByIdCategoria da classe FotoRepository
	 */
	@Test
	public void deveCarregarFotoPorCategoria() {
		String idCategoria = "Aaaa";
		List<Foto> fotos = fotoRepository.findByIdCategoria(idCategoria);
		Assert.assertNotNull(fotos);
	}
	
	/**
	 * Testando função findByIdCategoria da classe FotoRepository
	 * Cenário lista vazia
	 */
	@Test
	public void deveNaoEncontrarFotoPorCategoria() {
		String idCategoria = "W";
		List<Foto> fotos = fotoRepository.findByIdCategoria(idCategoria);
		Assert.assertTrue(fotos.isEmpty());
	}

}
