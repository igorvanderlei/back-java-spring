package br.edu.ufape.poo.banco2.basica;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class RegistroOperacao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private Date data;
	private String operacao;
	private float valor;
	@ManyToOne
	@JoinColumn(name="conta_id")
	private Conta conta;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getOperacao() {
		return operacao;
	}
	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	public RegistroOperacao(Date data, String operacao, float valor, Conta conta) {
		this.data = data;
		this.operacao = operacao;
		this.valor = valor;
		this.conta = conta;
	}
	public RegistroOperacao() {
	}
	
	
	
	
	
	
	

}
