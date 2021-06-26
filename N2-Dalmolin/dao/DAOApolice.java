package dao;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import model.Apolice;
import model.Dependente;
import model.Titular;


public class DAOApolice {
	
	private ArrayList<Apolice> listaApolice;
	

	public DAOApolice() {
		listaApolice = new ArrayList<Apolice>();
		leApolice();

	}

	public void adicionaApolice(Apolice apolice) {
		listaApolice.add(apolice);
	}
	
	public void listaApolice() {
		for (Apolice a : listaApolice) {
			System.out.println(a.toString());
		}
	}
	
	public void gravaArquivoListaApolice() {
		try {
			Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setPrettyPrinting().create();
			FileWriter filewriter = new FileWriter("listaApolice.json");
			gson.toJson(listaApolice, filewriter);
			filewriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void leApolice() {

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		FileReader filereader;

		try {
			filereader = new FileReader("listaApolice.json");

			TypeToken<ArrayList<Apolice>> token = new TypeToken<ArrayList<Apolice>>() {
			};

			ArrayList<Apolice> minhaLista = new ArrayList<Apolice>();
			minhaLista = gson.fromJson(filereader, token.getType());

			if (minhaLista != null) {
				listaApolice = minhaLista;
			}

			filereader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Apolice> getListaApolice(){
		return listaApolice;
	}
}
