package br.com.naturalnutricao.resources;

import java.io.Serializable;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource implements Serializable{
	private static final long serialVersionUID = 1L;	
	public static final Logger logger = (Logger) LoggerFactory.getLogger(CategoriaResource.class);

	@RequestMapping(method = RequestMethod.GET)
	public String listar() {
		logger.info("Rest OK");
		return "Rest funcional";
		
	}
	
}
