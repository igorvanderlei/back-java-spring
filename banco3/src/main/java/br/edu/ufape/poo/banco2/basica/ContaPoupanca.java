package br.edu.ufape.poo.banco2.basica;

import javax.persistence.Entity;

@Entity
public class ContaPoupanca extends Conta implements IContaRentavel {
	public ContaPoupanca(String numero) {
		super(numero);
	}
	public ContaPoupanca(String numero, float saldo) {
		super(numero, saldo);
	}

	@Override
	public void debitar(float valor) throws SaldoInsuficienteException  {
		if(valor > this.getSaldo())
			throw new SaldoInsuficienteException(this, valor);
		this.setSaldo(this.getSaldo() - valor);
	}
	@Override
	public String toString() {
		return "ContaPoupanca [getTitulares()=" + getTitulares() + ", getNumero()=" + getNumero() + ", getSaldo()="
				+ getSaldo() + "]";
	}
	
	

}
