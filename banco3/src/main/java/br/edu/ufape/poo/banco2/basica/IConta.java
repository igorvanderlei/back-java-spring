package br.edu.ufape.poo.banco2.basica;

public interface IConta {
	public void creditar(float valor);
	public void debitar(float valor) throws SaldoInsuficienteException;
	public void transferir(IConta destino, float valor) throws SaldoInsuficienteException;
	public float getSaldo();
}
