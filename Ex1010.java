package uri;

/*
    PROBLEMA - Cálculo Simples
    Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
    o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
    Após, calcule e mostre o valor a ser pago.

    ENTRADA
    O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores,
    respectivamente dois inteiros e um valor com 2 casas decimais.

    SAÍDA
    A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após
    os dois pontos e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.

 */

import java.util.Scanner;

public class Ex1010 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int quantidade1, quantidade2, codigo1, codigo2;
        double valorUnitario1, valorUnitario2, totalPagar;

        codigo1 = input.nextInt();
        quantidade1 = input.nextInt();
        valorUnitario1 = input.nextDouble();

        codigo2 = input.nextInt();
        quantidade2 = input.nextInt();
        valorUnitario2 = input.nextDouble();

        input.close();

        totalPagar = (quantidade1 * valorUnitario1) + (quantidade2 * valorUnitario2);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", totalPagar);

    }
}
