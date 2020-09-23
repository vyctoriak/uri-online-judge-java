package uri;

/*
	PROBLEMA - Produto Simples

	ENTRADA
	Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores
	e atribua esta operação à variável PROD.
	A seguir mostre a variável PROD com mensagem correspondente.

	SAÍDA
	Imprima a mensagem "PROD" e a variável PROD conforme exemplo abaixo,
	com um espaço em branco antes e depois da igualdade. Não esqueça de imprimir o fim de linha após o produto,
	caso contrário seu programa apresentará a mensagem: “Presentation Error”.

 */

import java.util.Scanner;

public class Ex1004 {
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int a = leitor.nextInt();
		int b = leitor.nextInt();
		leitor.close();
		int prod = a * b;
		System.out.println("PROD = " + prod);
	}
}
