package br.edu.ufape.poo.banco2.basica;

public interface IContaRentavel extends IConta {
	default public float renderJuros(float taxa) {
		float saldo = this.getSaldo();
		float juros =saldo * taxa / 100;
		this.creditar(juros);
		return juros;
	}

}
