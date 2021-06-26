package model;

import com.google.gson.annotations.Expose;

public class N2_ApoliceDependenteEmpresarial extends Apolice {

	@Expose
	public String cnpjResponsavel;
	@Expose
	public String nomeResponsavel;
	@Expose
	public String status = "Inativo";

	public String getCnpjResponsavel() {
		return cnpjResponsavel;
	}

	public void setCnpjResponsavel(String cnpjResponsavel) {
		this.cnpjResponsavel = cnpjResponsavel;
	}

	public String getNomeResponsavel() {
		return nomeResponsavel;
	}

	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ApoliceDependenteEmpresarial [cnpjResponsavel=" + cnpjResponsavel + ", nomeResponsavel="
				+ nomeResponsavel + ", status=" + status + ", id=" + id + ", dataAssinatura=" + dataAssinatura
				+ ", mesesVigencia=" + mesesVigencia + ", mensalidade=" + mensalidade + ", cpfAssegurado="
				+ cpfAssegurado + "]";
	}

}
