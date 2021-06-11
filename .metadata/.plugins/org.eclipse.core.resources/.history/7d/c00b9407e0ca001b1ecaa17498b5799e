package dao;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import model.ApoliceDependenteEmpresarial;

public class DAOApoliceEmpresarial {

	private ArrayList<ApoliceDependenteEmpresarial> listaEmpresarial;

	public DAOApoliceEmpresarial() {
		listaEmpresarial = new ArrayList<ApoliceDependenteEmpresarial>();
		leApoliceEmpresarial();
	}

	public void adicionaApoliceEmpresarial(ApoliceDependenteEmpresarial asseguradoEmpresarial) {
		listaEmpresarial.add(asseguradoEmpresarial);
	}

	public void listaEmpresarial() {
		for (ApoliceDependenteEmpresarial a : listaEmpresarial) {
			System.out.println(a.toString());
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

	public ArrayList<ApoliceDependenteEmpresarial> getListaEmpresarial() {
		return listaEmpresarial;
	}
}