package br.edu.ufape.poo.repositorio;

import java.util.List;

import br.edu.ufape.poo.banco2.basica.Cliente;

import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioCliente extends JpaRepository<Cliente, Long>{



}