package dao;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import model.ApoliceDependenteParticular;
import model.Assegurado;

public class DAOApoliceParticular {
	
	private ArrayList<ApoliceDependenteParticular> listaParticular;
	private ArrayList<Assegurado> listaAsseguradoPart;

	public DAOApoliceParticular() {
		listaParticular = new ArrayList<ApoliceDependenteParticular>();
		leApoliceParticular();
		listaAsseguradoPart = new ArrayList<Assegurado>();
		leAsseguradosPart();
		
	}

	public void adicionaApoliceParticular(ApoliceDependenteParticular asseguradoParticular) {
		listaParticular.add(asseguradoParticular);
	}
	
	public void AdicionaAsseguradoPart(Assegurado asseguradoApolicePart) {
		listaAsseguradoPart.add(asseguradoApolicePart);
		}

	public void listaParticular() {
		for (ApoliceDependenteParticular a : listaParticular) {
			System.out.println(a.toString());
		}
	}
	
	public void listaAsseguradoPart() {
		for(Assegurado x : listaAsseguradoPart) {
			System.out.println(x.toString());
		}
	}

	public void gravaArquivoListaParticular() {
		try {
			Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setPrettyPrinting().create();
			FileWriter filewriter = new FileWriter("ListaParticular.json");
			gson.toJson(listaParticular, filewriter);
			filewriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void gravaArquivoListaAsseguradoPart() {
		try {
			Gson gson1 = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setPrettyPrinting().create();
			FileWriter filewriter = new FileWriter("ListaAsseguradoPart.json");
			gson1.toJson(listaAsseguradoPart, filewriter);
			filewriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void leApoliceParticular() {

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		FileReader filereader;

		try {
			filereader = new FileReader("ListaParticular.json");

			TypeToken<ArrayList<ApoliceDependenteParticular>> token = new TypeToken<ArrayList<ApoliceDependenteParticular>>() {
			};

			ArrayList<ApoliceDependenteParticular> minhaLista = new ArrayList<ApoliceDependenteParticular>();
			minhaLista = gson.fromJson(filereader, token.getType());

			if (minhaLista != null) {
				listaParticular = minhaLista;
			}

			filereader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void leAsseguradosPart() {
		Gson gson1 = new GsonBuilder().setPrettyPrinting().create();
		FileReader filereader;

		try {
			filereader = new FileReader("ListaAssegurado.json");

			TypeToken<ArrayList<Assegurado>> token = new TypeToken<ArrayList<Assegurado>>() {
			};

			ArrayList<Assegurado> minhaLista1 = new ArrayList<Assegurado>();
			minhaLista1 = gson1.fromJson(filereader, token.getType());

			if (minhaLista1 != null) {
				listaAsseguradoPart = minhaLista1;
			}

			filereader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<ApoliceDependenteParticular> getListaEmpresarial() {
		return listaParticular;
	}
	
	public ArrayList<Assegurado> getListaAsseguradoPart(){
		return listaAsseguradoPart;
	}
}
