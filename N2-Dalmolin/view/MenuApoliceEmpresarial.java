package view;

import java.io.IOException;

import java.util.Scanner;

import javax.swing.JOptionPane;

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
			System.out.println("Insira o CNPJ do Respons�vel");
			apoliceDpndEmp.cnpjResponsavel = leitura.nextLine(); 
		} while (apoliceDpndEmp.cnpjResponsavel.length() == 14);

		do {
			System.out.println("Insira o Nome do Respons�vel");
			apoliceDpndEmp.nomeResponsavel = leitura.nextLine(); 
		} while (apoliceDpndEmp.nomeResponsavel.length() >= 3);
		
		do {
			System.out.println("Insira a data de Assinatura da Ap�lice dia/mes/ano");
			apoliceDpndEmp.dataAssinatura = leitura.nextLine(); 
		} while (apoliceDpndEmp.nomeResponsavel.length() >= 3);
		
		do {
			System.out.println("Insira quantos meses esse contrato ser� vigente");
			apoliceDpndEmp.mesesVigencia = leitura.nextInt(); 
		} while (apoliceDpndEmp.mesesVigencia >= 1);
		
		do {
			System.out.println("Insira o valor da Mensalidade1");
			apoliceDpndEmp.mensalidade = leitura.nextDouble(); 
		} while (apoliceDpndEmp.mensalidade  > 0);
		
		do {
			System.out.println("Insira o Nome do Assegurado");
			apoliceDpndEmp.assegurado.nomeAssegurado = leitura.nextLine(); 
		} while (apoliceDpndEmp.nomeResponsavel.length() >= 3);
		
		do {
			System.out.println("Insira o Email do Assegurado");
			apoliceDpndEmp.assegurado.emailAssegurado = leitura.nextLine(); 
		} while (apoliceDpndEmp.nomeResponsavel.length() >= 3);
		
		do {
			System.out.println("Insira o Telefone do Assegurado");
			apoliceDpndEmp.assegurado.telefoneAssegurado= leitura.nextLine(); 
		} while (apoliceDpndEmp.nomeResponsavel.length() >= 3);
		
		do {
			System.out.println("Insira o CPF do Assegurado");
			apoliceDpndEmp.cpfAssegurado= leitura.nextLine(); 
		} while (apoliceDpndEmp.nomeResponsavel.length() >= 3);
		meudao.adicionaApoliceEmpresarial(apoliceDpndEmp);
		meudao.gravaArquivoListaEmpresarial();
	}
}

