package br.edu.ufape.poo.banco2.basica;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Conta implements IConta{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String numero;
	private float saldo;
	
	@ManyToMany
	private List<Titular> titulares;
	@ManyToOne
	@JoinColumn(name="agencia_id")
	private Agencia agencia;
	
	public List<Titular> getTitulares() {
		return titulares;
	}
	protected void setTitulares(List<Titular> titulares) {
		this.titulares = titulares;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public float getSaldo() {
		return saldo;
	}
	
	void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public Conta(String numero, float saldo) {
		this(numero);
		this.saldo = saldo;
	}
	public Conta(String numero) {
		this.numero = numero;
		this.titulares = new ArrayList<Titular>();
	}
	
	@Override
	public void creditar(float valor) {
		this.saldo += valor;
		
	}
	
	@Override
	public void transferir(IConta destino, float valor) throws SaldoInsuficienteException {
		this.debitar(valor);
		destino.creditar(valor);
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	
	
	
}
