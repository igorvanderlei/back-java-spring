package br.edu.ufape.poo.banco2.basica;

import javax.persistence.Entity;

@Entity
public class ContaCorrente extends Conta{
	private float limiteCredito;

	public ContaCorrente(String numero, float saldo) {
		super(numero, saldo);
	}

	public ContaCorrente(String numero) {
		super(numero);
	}

	public float getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(float limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	@Override
	public void debitar(float valor) throws SaldoInsuficienteException {
		if(valor > this.getSaldo() + limiteCredito)	
			throw new SaldoInsuficienteException(this, valor);
		this.setSaldo(this.getSaldo() - valor);
		
	}

}
