package model;

import com.google.gson.annotations.Expose;

public class ApoliceDependenteParticular extends Apolice {

	@Expose
	public String cpfResponsavel;
	@Expose
	public String nomeResponsavel;
	@Expose
	public String status = "Ativo";

	public String getCpfResponsavel() {
		return cpfResponsavel;
	}

	public void setCpfResponsavel(String cpfResponsavel) {
		this.cpfResponsavel = cpfResponsavel;
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
		return "ApoliceDependenteParticular [cpfResponsavel=" + cpfResponsavel + ", nomeResponsavel=" + nomeResponsavel
				+ ", status=" + status + ", id=" + id + ", dataAssinatura=" + dataAssinatura + ", mesesVigencia="
				+ mesesVigencia + ", mensalidade=" + mensalidade + ", cpfAssegurado=" + cpfAssegurado + "]";
	}

}
