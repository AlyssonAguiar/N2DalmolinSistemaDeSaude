package view;

import java.util.Scanner;

import dao.DAOApoliceEmpresarial;
import model.ApoliceDependenteEmpresarial;
import model.Assegurado;

public class MenuApoliceEmpresarial extends ApoliceDependenteEmpresarial {
	ApoliceDependenteEmpresarial apoliceDpndEmp = new ApoliceDependenteEmpresarial();
	Assegurado asseguradoApoliceEmp = new Assegurado();

	Scanner leitura = new Scanner(System.in);
	Scanner numero = new Scanner(System.in);

	public void inserirEmpresarial() {

		leitura.nextLine();
		System.out.println("Insira o id");
		apoliceDpndEmp.id = numero.nextInt();

		System.out.println("Insira o CNPJ do Responsável");
		apoliceDpndEmp.cnpjResponsavel = leitura.nextLine();

		System.out.println("Insira o Nome do Responsável");
		apoliceDpndEmp.nomeResponsavel = leitura.nextLine();

		System.out.println("Insira a data de Assinatura da Apólice dia/mes/ano");
		apoliceDpndEmp.dataAssinatura = leitura.nextLine();

		System.out.println("Insira quantos meses esse contrato será vigente");
		apoliceDpndEmp.mesesVigencia = numero.nextInt();

		System.out.println("Insira o valor da Mensalidade");
		apoliceDpndEmp.mensalidade = numero.nextDouble();

		System.out.println("Insira o Nome do Assegurado");
		asseguradoApoliceEmp.nomeAssegurado = leitura.nextLine();
		
		System.out.println("Insira o Email do Assegurado");
		asseguradoApoliceEmp.emailAssegurado = leitura.nextLine();

		System.out.println("Insira o Telefone do Assegurado");
		asseguradoApoliceEmp.telefoneAssegurado = leitura.nextLine();

		System.out.println("Insira o CPF do Assegurado");
		apoliceDpndEmp.cpfAssegurado = leitura.nextLine();

		DAOApoliceEmpresarial meudao = new DAOApoliceEmpresarial();
		meudao.adicionaApoliceEmpresarial(apoliceDpndEmp);
		meudao.AdicionaAsseguradoEmp(asseguradoApoliceEmp);
		meudao.gravaArquivoListaEmpresarial();
		meudao.gravaArquivoListaAsseguradoEmp();
	}


	public void listarEmpresarial() {
		DAOApoliceEmpresarial listas = new DAOApoliceEmpresarial();
		listas.listaEmpresarial();
		listas.listaAsseguradoEmp();
	}
	
}