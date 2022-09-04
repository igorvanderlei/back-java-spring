package br.edu.ufape.poo.banco2.basica;

import javax.persistence.Entity;

@Entity
public class ContaEspecial extends ContaCorrente implements IContaRentavel {
	public ContaEspecial(String numero, float saldo) {
		super(numero, saldo);
	}

	public ContaEspecial(String numero) {
		super(numero);
	}

}
