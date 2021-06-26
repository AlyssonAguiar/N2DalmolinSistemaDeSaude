package model;

import java.util.ArrayList;

import com.google.gson.annotations.Expose;

public class Apolice{
	@Expose
	public int id;
	@Expose
	public String dataAssinatura;
	@Expose
	public int mesesVigencia;
	@Expose
	public double mensalidade;
	@Expose
	public String cpfAssegurado;
	@Expose
	public String cpfResponsavel;
	@Expose
	public String status;
	@Expose
	public ArrayList<Dependente> listaDependente;
	@Expose
	public ArrayList<Titular> listaTitular;
	
	public Apolice() {
		super();
		listaDependente = new ArrayList<Dependente>();
		listaTitular = new ArrayList<Titular>();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDataAssinatura() {
		return dataAssinatura;
	}
	public void setDataAssinatura(String dataAssinatura) {
		this.dataAssinatura = dataAssinatura;
	}
	public int getMesesVigencia() {
		return mesesVigencia;
	}
	public void setMesesVigencia(int mesesVigencia) {
		this.mesesVigencia = mesesVigencia;
	}
	public double getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}
	public String getCpfAssegurado() {
		return cpfAssegurado;
	}
	public void setCpfAssegurado(String cpfAssegurado) {
		this.cpfAssegurado = cpfAssegurado;
	}
	public String getCpfResponsavel() {
		return cpfResponsavel;
	}
	public void setCpfResponsavel(String cpfResponsavel) {
		this.cpfResponsavel = cpfResponsavel;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public ArrayList<Dependente> getListaDependente(){
		return listaDependente;
	}
	public ArrayList<Titular> getListaTitular(){
		return listaTitular;
	}

	@Override
	public String toString() {
		return "Apolice [id=" + id + ", dataAssinatura=" + dataAssinatura + ", mesesVigencia=" + mesesVigencia
				+ ", mensalidade=" + mensalidade + ", cpfAssegurado=" + cpfAssegurado + ", cpfResponsavel="
				+ cpfResponsavel + ", status=" + status + "]";
	}
	
	
}
