package br.com.danilogomes.itaucat.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.danilogomes.itaucat.modelo.Cat;

/**
 * Interface usada para herdar funções da JPA Repository relacionado com
 * a classe Cat com o modelo de dados.
 * 
 * @author Danilo Gomes
 * @version 0.1
 */

@Repository
public interface CatRepository extends JpaRepository<Cat, Long> {
	
	/**
	 * Função para listar Cat na base de dados filtrando por IdRaca
	 * 
	 * @param idRaca
	 * @return
	 */
	List<Cat> findByIdRaca(String idRaca);

	/**
	 * Função para listar Cat na base de dados filtrando por temperamento
	 * 
	 * @param temperamento
	 * @return
	 */
	List<Cat> findByTemperamento(String temperamento);
	
	/**
	 * Função para listar Cat na base de dados filtrando por origem
	 * 
	 * @param origem
	 * @return
	 */
	List<Cat> findByOrigem(String origem);

	/**
	 * Função para listar Cat na base de dados filtrando por um texto que contenha 
	 * no campo temperamento
	 * 
	 * @param temperamento
	 * @return
	 */
	List<Cat> findByTemperamentoContaining(String temperamento);

}
