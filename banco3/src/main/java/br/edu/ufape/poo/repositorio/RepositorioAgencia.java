package br.edu.ufape.poo.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.edu.ufape.poo.banco2.basica.Agencia;

@Repository
public interface RepositorioAgencia extends JpaRepository<Agencia, Long>{

}