package br.com.danilogomes.itaucat.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import br.com.danilogomes.itaucat.controller.dto.CatDto;
import br.com.danilogomes.itaucat.modelo.Cat;
import br.com.danilogomes.itaucat.repository.CatRepository;

/**
 * Classe que representa os controles de acessos referentes ao objeto Cat
 * Responsavel por controlar as rotas de acesso as APIs de acesso a classe Cat
 * 
 * @author Danilo Gomes
 * @version 0.1
 */

@RestController
public class CatController {
	
	@Autowired
	private CatRepository catRepository;
	
	
	/**
	 * Função resposavel por listar todos os gatos da base de dados.
	 * 
	 * @return Lista de Cat(Gatos)
	 */
	@RequestMapping(value="/cat", method = RequestMethod.GET)
	public List<CatDto> listaTudo() {
		List<Cat> cats = catRepository.findAll();
		return CatDto.converter(cats);
	}
	
	/**
	 * Função resposavel por listar os gatos fitrando por raca da base de dados.
	 * 
	 * @param raca
	 * @return Lista de Cat(Gatos)
	 */
	@RequestMapping(value="/cat/raca/{raca}", method = RequestMethod.GET)
	public List<CatDto> listaRaca(@PathVariable String raca) {
		List<Cat> cats = catRepository.findByIdRaca(raca);
		return CatDto.converter(cats);
	}
	
	/**
	 * Função resposavel por listar os gatos fitrando por origem da base de dados.
	 * 
	 * @param origem
	 * @return Lista de Cat(Gatos)
	 */
	@RequestMapping(value="/cat/origem/{origem}", method = RequestMethod.GET)
	public List<CatDto> listaOrigem(@PathVariable String origem) {
		List<Cat> cats = catRepository.findByOrigem(origem);
		return CatDto.converter(cats);
	}
	
	/**
	 * Função resposavel por listar os gatos filtrando por temperamento da base de dados.
	 * 
	 * @param temperamento
	 * @return Lista de Cat(Gatos)
	 */
	@RequestMapping(value="/cat/temperamento/{temperamento}", method = RequestMethod.GET)
	public List<CatDto> listaTemperamento(@PathVariable String temperamento) {
		List<Cat> cats = catRepository.findByTemperamentoContaining(temperamento);
		return CatDto.converter(cats);
	}
	
}
