package model;

import com.google.gson.annotations.Expose;

public class Assegurado {
	@Expose
	public String nomeAssegurado;
	@Expose
	public String emailAssegurado;
	@Expose
	public String telefoneAssegurado;

//	private static ArrayList<Assegurado> listaDeClientes = new ArrayList<Assegurado>();
	
//	public ArrayList<Assegurado> getListaDeClientes(){
//		return listaDeClientes;
//	}

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

	@Override
	public String toString() {
		return "Assegurado [nomeAssegurado=" + nomeAssegurado + ", emailAssegurado=" + emailAssegurado
				+ ", telefoneAssegurado=" + telefoneAssegurado + "]";
	}


	
}
