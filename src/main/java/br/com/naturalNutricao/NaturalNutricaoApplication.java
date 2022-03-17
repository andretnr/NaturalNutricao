package br.com.naturalnutricao;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.naturalnutricao.domain.Categoria;
import br.com.naturalnutricao.repositories.CategoriaRepository;

@SpringBootApplication
public class NaturalNutricaoApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(NaturalNutricaoApplication.class, args);	
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Produtos");
		Categoria cat2 = new Categoria(null, "Informática");
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
	}

}
