package model;
import java.util.*;

public class Apolice {

	public int id;
	public String nomeAssegurado;
	public String emailAssegurado;
	public String telefoneAssegurado;
	public Date dataAssinatura;
	public int mesesVigencia;
	public double mensalidade;
	public String cpfAssegurado;
	public boolean status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeAssegurado() {
		return nomeAssegurado;
	}
	public void setNomeAssegurado(String nomeAssegurado) {
		this.nomeAssegurado = nomeAssegurado;
	}
	public String getEmailAssegurado() {
		return emailAssegurado;
	}
	public void setEmailAssegurado(String emailAssegurado) {
		this.emailAssegurado = emailAssegurado;
	}
	public String getTelefoneAssegurado() {
		return telefoneAssegurado;
	}
	public void setTelefoneAssegurado(String telefoneAssegurado) {
		this.telefoneAssegurado = telefoneAssegurado;
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
	
	@Override
	public String toString() {
		return "Apolice [id=" + id + ", nomeAssegurado=" + nomeAssegurado + ", emailAssegurado=" + emailAssegurado
				+ ", telefoneAssegurado=" + telefoneAssegurado + ", dataAssinatura=" + dataAssinatura
				+ ", mesesVigencia=" + mesesVigencia + ", mensalidade=" + mensalidade + ", cpfAssegurado="
				+ cpfAssegurado + ", status=" + status + "]";
	}
	

	
}