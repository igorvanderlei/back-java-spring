package br.edu.ufape.poo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ufape.poo.banco2.basica.RegistroOperacao;

@Repository
public interface RepositorioRegistroOperacao extends JpaRepository<RegistroOperacao, Long> {

}