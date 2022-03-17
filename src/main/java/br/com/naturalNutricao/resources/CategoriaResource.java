package br.com.naturalnutricao.resources;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.naturalnutricao.domain.Categoria;
import ch.qos.logback.classic.Logger;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource implements Serializable{
	private static final long serialVersionUID = 1L;	
	public static final Logger logger = (Logger) LoggerFactory.getLogger(CategoriaResource.class);

	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> listar() {
		
		Categoria cat1 = new Categoria(1, "Nome Teste");
		Categoria cat2 = new Categoria(2, "Nome Teste dois");
		
		List<Categoria> lista = new ArrayList<Categoria>();
		lista.add(cat1);
		lista.add(cat2);
		
		logger.info("Rest OK");
		return lista;
		
	}
	
}
