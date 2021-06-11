package model;

import com.google.gson.annotations.Expose;

public class ApoliceDependenteParticular extends Apolice {

	@Expose
	public String cpfResponsavel;
	@Expose
	public String nomeResponsavel;
	
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

	

}
