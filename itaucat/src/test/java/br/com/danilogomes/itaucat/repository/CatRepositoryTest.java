package br.com.danilogomes.itaucat.repository;

import java.util.List;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.danilogomes.itaucat.modelo.Cat;

/**
 * Classe para realização de testes automaticos da classe CatRepository
 * 
 * @author Danilo Gomes
 * @version 0.1
 */

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ActiveProfiles("dev")
public class CatRepositoryTest {
	
	@Autowired
	private CatRepository catRepository;

	/**
	 * Testando função findByIdRaca da classe CatRepository
	 */
	@Test
	public void deveCarregarCatPorIdRaca() {
		String idRaca = "Aaaa";
		List<Cat> cats = catRepository.findByIdRaca(idRaca);
		Assert.assertNotNull(cats);
	}
	
	/**
	 * Testando função findByIdRaca da classe CatRepository
	 * Cenário lista vazia
	 */
	@Test
	public void deveNaoEncontrarCatPorIdRaca() {
		String idRaca = "Wwww";
		List<Cat> cats = catRepository.findByIdRaca(idRaca);
		Assert.assertTrue(cats.isEmpty());
	}
	
	
	/**
	 * Testando função findByTemperamento da classe CatRepository
	 */
	@Test
	public void deveCarregarCatPorTemperamento() {
		String temperamento = "aa";
		List<Cat> cats = catRepository.findByTemperamento(temperamento);
		Assert.assertNotNull(cats);
	}
	
	/**
	 * Testando função findByTemperamento da classe CatRepository
	 * Cenário lista vazia
	 */
	@Test
	public void deveNaoEncontrarCatPorTemperamento() {
		String temperamento = "ww";
		List<Cat> cats = catRepository.findByTemperamento(temperamento);
		Assert.assertTrue(cats.isEmpty());
	}
	
	
	
	/**
	 * Testando função findByOrigem da classe CatRepository
	 */
	@Test
	public void deveCarregarCatPorOrigem() {
		String origem = "aa";
		List<Cat> cats = catRepository.findByOrigem(origem);
		Assert.assertNotNull(cats);
	}
	
	/**
	 * Testando função findByOrigem da classe CatRepository
	 * Cenário lista vazia
	 */
	@Test
	public void deveNaoEncontrarCatPorOrigem() {
		String origem = "ww";
		List<Cat> cats = catRepository.findByOrigem(origem);
		Assert.assertTrue(cats.isEmpty());
	}
	
	
	/**
	 * Testando função findByTemperamentoContaining da classe CatRepository
	 */
	@Test
	public void deveCarregarCatPorTemperamentoContaining() {
		String temperamento = "aa";
		List<Cat> cats = catRepository.findByTemperamentoContaining(temperamento);
		Assert.assertNotNull(cats);
	}
	
	/**
	 * Testando função findByTemperamentoContaining da classe CatRepository
	 * Cenário lista vazia
	 */
	@Test
	public void deveNaoEncontrarCatPorTemperamentoContaining() {
		String temperamento = "ww";
		List<Cat> cats = catRepository.findByTemperamentoContaining(temperamento);
		Assert.assertTrue(cats.isEmpty());
	}
}
