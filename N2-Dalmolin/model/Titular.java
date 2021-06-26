package model;

import com.google.gson.annotations.Expose;

public class Titular {
	@Expose
	public int id;
	@Expose
	public String cpf;
	@Expose
	public String nome;
	
	public Apolice apolice;
	public Dependente dependente;
	
	public Titular(Apolice apolice) {
		super();
		this.apolice=apolice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Apolice getApolice() {
		return apolice;
	}

	public void setApolice(Apolice apolice) {
		this.apolice = apolice;
	}

	public Dependente getDependente() {
		return dependente;
	}

	public void setDependente(Dependente dependente) {
		this.dependente = dependente;
	}

	@Override
	public String toString() {
		return "Titular [id=" + id + ", cpf=" + cpf + ", nome=" + nome + ", apolice=" + apolice + ", dependente="
				+ dependente + "]";
	}
	
}
