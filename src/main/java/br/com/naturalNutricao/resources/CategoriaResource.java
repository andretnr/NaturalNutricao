package br.com.naturalnutricao.resources;

import java.io.Serializable;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.naturalnutricao.domain.Categoria;
import br.com.naturalnutricao.services.CategoriaService;
import ch.qos.logback.classic.Logger;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource implements Serializable{
	private static final long serialVersionUID = 1L;	
	public static final Logger logger = (Logger) LoggerFactory.getLogger(CategoriaResource.class);

	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Categoria obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
		
	}
	
}
