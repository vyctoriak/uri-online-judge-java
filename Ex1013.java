package uri;

/*
    PROBLEMA - O maior

    ENTRADA
    Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”.
    Utilize a fórmula: MaiorAB = (a + b + abs (a-b)) / 2
    Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário
    para chegar no resultado esperado.

 */

import java.util.Scanner;

public class Ex1013 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        double maiorAB, maiorABC;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        maiorAB = (a + b + (Math.abs(a - b)))/2;
        maiorABC = (maiorAB + c + (Math.abs(maiorAB - c)))/2;
        if(maiorABC == a)
            System.out.println(a + " eh o maior");
        else if(maiorABC == b)
            System.out.println(b + " eh o maior");
        else if(maiorABC == c)
            System.out.println(c + " eh o maior");
    }

}
