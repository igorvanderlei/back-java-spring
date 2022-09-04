package br.edu.ufape.poo.banco2.basica;

import java.util.Objects;

import javax.persistence.*;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Agencia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String codigo;
	private String nome;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Endereco endereco;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	private Agencia() {
	}
	public Agencia(String codigo, String nome, Endereco endereco) {
		this.codigo = codigo;
		this.nome = nome;
		this.endereco = endereco;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agencia other = (Agencia) obj;
		return id == other.id;
	}
	@Override
	public String toString() {
		return "Agencia [id=" + id + ", codigo=" + codigo + ", nome=" + nome + ", endereco=" + endereco + "]";
	}
	
	
}
