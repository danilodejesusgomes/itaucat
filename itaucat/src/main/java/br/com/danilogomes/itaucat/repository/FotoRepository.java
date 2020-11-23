package br.com.danilogomes.itaucat.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.danilogomes.itaucat.modelo.Foto;

/**
 * Interface usada para herdar funções da JPA Repository relacionado com
 * a classe Foto com o modelo de dados.
 * 
 * @author Danilo Gomes
 * @version 0.1
 */

@Repository
public interface FotoRepository extends JpaRepository<Foto, Long> {

	/**
	 * Função para listar Foto na base de dados filtrando por Categoria 
	 * 
	 * @param idCategoria
	 * @return
	 */
	List<Foto> findByIdCategoria(String idCategoria);

	/**
	 * Função para listar Foto na base de dados filtrando por IdRaca
	 * 
	 * @param idRaca
	 * @return
	 */
	List<Foto> findByIdRaca(String idRaca);

}
