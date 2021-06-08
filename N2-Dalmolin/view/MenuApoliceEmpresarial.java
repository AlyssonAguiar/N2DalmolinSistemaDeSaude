package view;

import java.util.Scanner;

import dao.DAOApoliceEmpresarial;
import model.ApoliceDependenteEmpresarial;
import model.Apolice;

public class MenuApoliceEmpresarial extends ApoliceDependenteEmpresarial {
	DAOApoliceEmpresarial meudao = new DAOApoliceEmpresarial();
	ApoliceDependenteEmpresarial apoliceDpndEmp = new ApoliceDependenteEmpresarial();
	
	Scanner leitura = new Scanner(System.in);
	
	public void inserir() {
		do {
			System.out.println("Insira o id");
			apoliceDpndEmp.id = leitura.nextInt(); 
		} while (apoliceDpndEmp.id !=0);
		
		do {
			System.out.println("Insira o id");
			apoliceDpndEmp.id = leitura.nextInt(); 
		} while (apoliceDpndEmp.id !=0);
	
	

}


public static void main(String[] args) {
	// TODO Auto-generated method stub
	DAODepartamento meudao = new DAODepartamento();
	Departamento meuDepto= new Departamento();
	meuDepto.setCodigoDepartamento(3);
	meuDepto.setNome("Departamento de Segurança");
	meudao.adicionaDepartamento(meuDepto);
	meudao.gravaArquivoDepartamentos();
	
}
