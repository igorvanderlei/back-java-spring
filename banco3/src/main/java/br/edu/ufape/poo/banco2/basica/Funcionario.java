package br.edu.ufape.poo.banco2.basica;

import javax.persistence.Entity;

@Entity
public class Funcionario extends Pessoa{
	private String cargo;
	private float salario;
	
	public Funcionario() {
		super();
	}
	
	public Funcionario(String nome, String cpf, 
			Endereco endereco, String cargo, float salario) {
		super(nome, cpf, endereco);
		this.cargo = cargo;
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
}
