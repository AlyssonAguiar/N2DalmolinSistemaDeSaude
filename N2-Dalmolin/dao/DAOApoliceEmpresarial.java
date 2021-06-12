package dao;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileNotFoundException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import model.ApoliceDependenteEmpresarial;
import model.Assegurado;

public class DAOApoliceEmpresarial {

	private ArrayList<ApoliceDependenteEmpresarial> listaEmpresarial;
	private ArrayList<Assegurado> listaAsseguradoEmp;

	public DAOApoliceEmpresarial() {
		listaEmpresarial = new ArrayList<ApoliceDependenteEmpresarial>();
		leApoliceEmpresarial();
		listaAsseguradoEmp = new ArrayList<Assegurado>();
		leAsseguradosEmp();
		
	}

	public void adicionaApoliceEmpresarial(ApoliceDependenteEmpresarial asseguradoEmpresarial) {
		listaEmpresarial.add(asseguradoEmpresarial);
	}
	
	public void AdicionaAsseguradoEmp(Assegurado asseguradoApoliceEmp) {
		listaAsseguradoEmp.add(asseguradoApoliceEmp);
		}

	public void listaEmpresarial() {
		for (ApoliceDependenteEmpresarial a : listaEmpresarial) {
			System.out.println(a.toString());
		}
	}
	
	public void listaAsseguradoEmp() {
		for(Assegurado x : listaAsseguradoEmp) {
			System.out.println(x.toString());
		}
	}

	public void gravaArquivoListaEmpresarial() {
		try {
			Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setPrettyPrinting().create();
			FileWriter filewriter = new FileWriter("ListaEmpresarial.json");
			gson.toJson(listaEmpresarial, filewriter);
			filewriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void gravaArquivoListaAsseguradoEmp() {
		try {
			Gson gson1 = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setPrettyPrinting().create();
			FileWriter filewriter = new FileWriter("ListaAsseguradoEmp.json");
			gson1.toJson(listaAsseguradoEmp, filewriter);
			filewriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void leApoliceEmpresarial() {

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		FileReader filereader;

		try {
			filereader = new FileReader("ListaEmpresarial.json");

			TypeToken<ArrayList<ApoliceDependenteEmpresarial>> token = new TypeToken<ArrayList<ApoliceDependenteEmpresarial>>() {
			};

			ArrayList<ApoliceDependenteEmpresarial> minhaLista = new ArrayList<ApoliceDependenteEmpresarial>();
			minhaLista = gson.fromJson(filereader, token.getType());

			if (minhaLista != null) {
				listaEmpresarial = minhaLista;
			}

			filereader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void leAsseguradosEmp() {
		Gson gson1 = new GsonBuilder().setPrettyPrinting().create();
		FileReader filereader;

		try {
			filereader = new FileReader("ListaAsseguradoEmp.json");

			TypeToken<ArrayList<Assegurado>> token = new TypeToken<ArrayList<Assegurado>>() {
			};

			ArrayList<Assegurado> minhaLista1 = new ArrayList<Assegurado>();
			minhaLista1 = gson1.fromJson(filereader, token.getType());

			if (minhaLista1 != null) {
				listaAsseguradoEmp = minhaLista1;
			}

			filereader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<ApoliceDependenteEmpresarial> getListaEmpresarial() {
		return listaEmpresarial;
	}
	
	public ArrayList<Assegurado> getListaAssegurado(){
		return listaAsseguradoEmp;
	}
}