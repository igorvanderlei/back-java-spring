package br.edu.ufape.poo.fachada;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import br.edu.ufape.poo.banco2.basica.Agencia;
import br.edu.ufape.poo.cadastro.CadastroAgencia;

@Service
public class Banco {
	@Autowired
	private CadastroAgencia cadastroAgencia;

	public Agencia save(Agencia entity) {
		return cadastroAgencia.save(entity);
	}

	public List<Agencia> findAll() {
		return cadastroAgencia.findAll();
	}

	public void deleteById(Long id) {
		cadastroAgencia.deleteById(id);
	}

	public void delete(Agencia entity) {
		cadastroAgencia.delete(entity);
	}
	
	
}
