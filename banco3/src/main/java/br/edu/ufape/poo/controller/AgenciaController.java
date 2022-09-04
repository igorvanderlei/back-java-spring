package br.edu.ufape.poo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ufape.poo.banco2.basica.Agencia;
import br.edu.ufape.poo.fachada.Banco;

@CrossOrigin (origins = "http://localhost:8081/" )
@RestController
@RequestMapping( "/banco/api/v1/")
public class AgenciaController {
	@Autowired
	private Banco banco;
	
	@PostMapping("agencia")
	public Agencia createAgencia(@RequestBody Agencia agencia) {
		return banco.save(agencia);
	}

}
