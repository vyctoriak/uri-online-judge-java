package uri;

/*
	PROBLEMA - Salário com bônus
	Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas
	por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
	efetuadas, informar o total a receber no final do mês, com duas casas decimais.

	ENTRADA
	O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de dupla precisão (double)
	com duas casas decimais, representando o salário fixo do vendedor e montante total das vendas efetuadas
	por este vendedor, respectivamente.

	SAÍDA
	Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.

 */

import java.util.Scanner;

public class Ex1009 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nome = input.next();
		double salarioFixo = input.nextDouble();
		double totalDeVendas = input.nextDouble();
		input.close();
		double comissao = (totalDeVendas * 15) / 100;
		double totalMes = comissao + salarioFixo;
		
		System.out.println(String.format("TOTAL = R$ %.2f", totalMes));
	}
}