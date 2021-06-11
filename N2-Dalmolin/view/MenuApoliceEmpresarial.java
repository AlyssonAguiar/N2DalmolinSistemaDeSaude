package view;

import java.util.Scanner;

import dao.DAOApoliceEmpresarial;
import model.ApoliceDependenteEmpresarial;
import model.Assegurado;

public class MenuApoliceEmpresarial extends ApoliceDependenteEmpresarial {
	ApoliceDependenteEmpresarial apoliceDpndEmp = new ApoliceDependenteEmpresarial();
	Assegurado asseguradoApolice = new Assegurado();

	Scanner leitura = new Scanner(System.in);
	Scanner numero = new Scanner(System.in);

	public void inserir() {

		leitura.nextLine();
		System.out.println("Insira o id");
		apoliceDpndEmp.id = numero.nextInt();

		System.out.println("Insira o CNPJ do Respons�vel");
		apoliceDpndEmp.cnpjResponsavel = leitura.nextLine();

		System.out.println("Insira o Nome do Respons�vel");
		apoliceDpndEmp.nomeResponsavel = leitura.nextLine();

		System.out.println("Insira a data de Assinatura da Ap�lice dia/mes/ano");
		apoliceDpndEmp.dataAssinatura = leitura.nextLine();

		System.out.println("Insira quantos meses esse contrato ser� vigente");
		apoliceDpndEmp.mesesVigencia = numero.nextInt();

		System.out.println("Insira o valor da Mensalidade");
		apoliceDpndEmp.mensalidade = numero.nextDouble();

		System.out.println("Insira o Nome do Assegurado");
		asseguradoApolice.nomeAssegurado = leitura.nextLine();
		
		System.out.println("Insira o Email do Assegurado");
		asseguradoApolice.emailAssegurado = leitura.nextLine();

		System.out.println("Insira o Telefone do Assegurado");
		asseguradoApolice.telefoneAssegurado = leitura.nextLine();

		System.out.println("Insira o CPF do Assegurado");
		apoliceDpndEmp.cpfAssegurado = leitura.nextLine();

		DAOApoliceEmpresarial meudao = new DAOApoliceEmpresarial();
		meudao.adicionaApoliceEmpresarial(apoliceDpndEmp);
		meudao.AdicionaAssegurado(asseguradoApolice);
		meudao.gravaArquivoListaEmpresarial();
		meudao.gravaArquivoListaAssegurado();
	}
}
