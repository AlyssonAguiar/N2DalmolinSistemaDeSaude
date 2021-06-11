package model;

import com.google.gson.annotations.Expose;

public class ApoliceDependenteEmpresarial extends Apolice {

	@Expose
	public String cnpjResponsavel;
	@Expose
	public String nomeResponsavel;
	
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
	
	@Override
	public String toString() {
		return "ApoliceDependenteEmpresarial [id=" + id + "cnpjResponsavel=" + cnpjResponsavel + ", nomeResponsavel="
				+ nomeResponsavel + ", dataAssinatura=" + dataAssinatura + ", mesesVigencia="
				+ mesesVigencia + ", mensalidade=" + mensalidade + ", assegurado=" + assegurado + ", cpfAssegurado="
				+ cpfAssegurado + ", status=" + status + "]";
	}
	
	
	
}
	
	



