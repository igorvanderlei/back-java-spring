package br.edu.ufape.poo.banco2.basica;

import javax.persistence.Entity;

@Entity
public class Cliente extends Pessoa{

	private Cliente() {
		super();
	}

	public Cliente(String nome, String cpf, Endereco endereco) {
		super(nome, cpf, endereco);
	}

	@Override
	public String toString() {
		return "Cliente [getId()=" + getId() + ", getNome()=" + getNome() + ", getCpf()=" + getCpf() + "]";
	}


	
}
