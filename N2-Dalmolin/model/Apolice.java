package model;

import com.google.gson.annotations.Expose;

public abstract class Apolice{
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
	
	public Assegurado assegurado;
	
	public Assegurado getAssegurado() {
		return assegurado;
	}
	public void setAssegurado(Assegurado assegurado) {
		this.assegurado = assegurado;
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
}
