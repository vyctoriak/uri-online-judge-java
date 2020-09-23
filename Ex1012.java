package uri;

/*
    PROBLEMA - Área
    Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
    a) a área do triângulo retângulo que tem A por base e C por altura.
    b) a área do círculo de raio C. (pi = 3.14159)
    c) a área do trapézio que tem A e B por bases e C por altura.
    d) a área do quadrado que tem lado B.
    e) a área do retângulo que tem lados A e B.

    ENTRADA
    O arquivo de entrada contém três valores com um dígito após o ponto decimal.

    SAÍDA
    O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas acima,
    sempre com mensagem correspondente e um espaço entre os dois pontos e o valor. O valor calculado deve ser
    apresentado com 3 dígitos após o ponto decimal.

 */

import java.util.Scanner;

public class Ex1012 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        input.close();

        double areaDoTringuloRetangulo = (a * c) / 2;
        double areaDoCirculo = 3.14159 * (c * c);
        double areaDoTrapezio = ((a + b) / 2) * c ;
        double areaDoQuadrado = b * b;
        double areaDoRetangulo = a * b;

        System.out.println(String.format("TRIANGULO: %.3f", areaDoTringuloRetangulo));
        System.out.println(String.format("CIRCULO: %.3f", areaDoCirculo));
        System.out.println(String.format("TRAPEZIO: %.3f", areaDoTrapezio));
        System.out.println(String.format("QUADRADO: %.3f", areaDoQuadrado));
        System.out.println(String.format("RETANGULO: %.3f", areaDoRetangulo));
    }

}
