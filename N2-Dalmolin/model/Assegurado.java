package model;
import java.util.*;

public abstract class Assegurado {

	public String id;
	public Date dataAssinatura;
	public int mesesVigencia;
	public double mensalidade;
	public String cpfAssegurado;
	public boolean status;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getDataAssinatura() {
		return dataAssinatura;
	}
	public void setDataAssinatura(Date dataAssinatura) {
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
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public Assegurado(String id, Date dataAssinatura, int mesesVigencia, double mensalidade, String cpfAssegurado,
			boolean status) {
		super();
		this.id = id;
		this.dataAssinatura = dataAssinatura;
		this.mesesVigencia = mesesVigencia;
		this.mensalidade = mensalidade;
		this.cpfAssegurado = cpfAssegurado;
		this.status = status;
	}
	
	
}