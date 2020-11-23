package br.com.danilogomes.itaucat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Aplicação de disponibilização de APIs externas para consultas de reças de gatos e suas
 * respectivas fotos representativas
 * 
 * @author Danilo Gomes
 * @version 0.1
 */

@SpringBootApplication
public class ItaucatApplication  {
	
	public static void main(String[] args) {
		SpringApplication.run(ItaucatApplication.class, args);
		
		System.out.println("APLICACAO NO AR AGUARDANDO CHAMADAS DAS ROTAS");
	}

}
