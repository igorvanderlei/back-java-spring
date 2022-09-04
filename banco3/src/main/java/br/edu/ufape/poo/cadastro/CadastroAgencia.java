package br.edu.ufape.poo.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufape.poo.banco2.basica.Agencia;
import br.edu.ufape.poo.repositorio.RepositorioAgencia;

@Service
public class CadastroAgencia {
	@Autowired
	private RepositorioAgencia repositorioAgencia;

	public Agencia save(Agencia entity) {
		
		return repositorioAgencia.save(entity);
	}

	public List<Agencia> findAll() {
		return repositorioAgencia.findAll();
	}

	public void deleteById(Long id) {
		repositorioAgencia.deleteById(id);
	}

	public void delete(Agencia entity) {
		repositorioAgencia.delete(entity);
	}
	
}
