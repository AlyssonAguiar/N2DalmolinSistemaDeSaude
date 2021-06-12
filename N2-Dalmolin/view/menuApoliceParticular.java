package view;

import java.util.Scanner;

import dao.DAOApoliceParticular;
import model.ApoliceDependenteParticular;
import model.Assegurado;

public class menuApoliceParticular {
	ApoliceDependenteParticular apoliceDpndPart = new ApoliceDependenteParticular();
	Assegurado asseguradoApolicePar = new Assegurado();
	
	Scanner leitura = new Scanner(System.in);
	Scanner numero = new Scanner(System.in);
	
	public void inserirParticular() {

		leitura.nextLine();
		System.out.println("Insira o id");
		apoliceDpndPart.id = numero.nextInt();

		System.out.println("Insira o CPF do Respons�vel");
		apoliceDpndPart.cpfResponsavel = leitura.nextLine();

		System.out.println("Insira o Nome do Respons�vel");
		apoliceDpndPart.nomeResponsavel = leitura.nextLine();

		System.out.println("Insira a data de Assinatura da Ap�lice dia/mes/ano");
		apoliceDpndPart.dataAssinatura = leitura.nextLine();

		System.out.println("Insira quantos meses esse contrato ser� vigente");
		apoliceDpndPart.mesesVigencia = numero.nextInt();

		System.out.println("Insira o valor da Mensalidade");
		apoliceDpndPart.mensalidade = numero.nextDouble();

		System.out.println("Insira o Nome do Assegurado");
		asseguradoApolicePar.nomeAssegurado = leitura.nextLine();
		
		System.out.println("Insira o Email do Assegurado");
		asseguradoApolicePar.emailAssegurado = leitura.nextLine();

		System.out.println("Insira o Telefone do Assegurado");
		asseguradoApolicePar.telefoneAssegurado = leitura.nextLine();

		System.out.println("Insira o CPF do Assegurado");
		apoliceDpndPart.cpfAssegurado = leitura.nextLine();

		DAOApoliceParticular meudao1 = new DAOApoliceParticular();
		meudao1.adicionaApoliceParticular(apoliceDpndPart);
		meudao1.AdicionaAsseguradoPart(asseguradoApolicePar);
		meudao1.gravaArquivoListaParticular();
		meudao1.gravaArquivoListaAsseguradoPart();
	}


	public void listarParticular() {
		DAOApoliceParticular listatagem = new DAOApoliceParticular();
		listatagem.listaParticular();
		listatagem.listaAsseguradoPart();
	}
	
}