package br.edu.ufape.poo.banco2.basica;

public class SaldoInsuficienteException extends Exception{
	private IConta conta;
	private float valor;
	
	public SaldoInsuficienteException(IConta conta, float valor) {
		super("Saldo insuficiente para realizar a operação");
		this.conta = conta;
		this.valor = valor;
	}
	public IConta getConta() {
		return conta;
	}
	public float getValor() {
		return valor;
	}
	
	
}
