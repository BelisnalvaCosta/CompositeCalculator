package com.dio.Calculadora;

import java.util.Scanner;
public class VamosCalcular {

    public static void main(String[] args) {
        double n1, n2;
        double soma, subtracao, multiplicacao, divisao;
        double area, hipotenusa;
        int opcao;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        n1 = entrada.nextDouble();
        System.out.println("Digite o segundo valor: ");
        n2 = entrada.nextDouble();

        System.out.println("*****Welcome*****");
        System.out.println("----MENU----");
        System.out.println("[1] - SOMAR");
        System.out.println("[2] - SUBTRAIR");
        System.out.println("[3] - MULTIPLICAR");
        System.out.println("[4] - DIVIDIR");
        System.out.println("----Calcular a ÁREA----");
        System.out.println("[5] - TRIÂNGULO");
        System.out.println("[6] - CATETOS");
        System.out.println("[7[ - HIPOTENUSA");

        Scanner scan = new Scanner(System.in);
        int a,b,c;
        while (true) {
            a = scan.nextInt();
            b = scan.nextInt();
            c = scan.nextInt();
            if(a == 0 && b == 0 && c == 0) break;
            if((a == b) && (b == c)) {
                System.out.println("Area");
            }
        }

        System.out.println(">>>>>Digite a opção: ");
        opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                soma = n1 + n2;
                System.out.println("A soma é: " + soma);
                break;

            case 2:
                subtracao = n1 - n2;
                System.out.println("A subtração é: " + subtracao);
                break;

            case 3:
                multiplicacao = n1 * n2;
                System.out.println("A multiplicação é: " + multiplicacao);
                break;

            case 4:
                divisao = n1 / n2;
                System.out.println("A divisão é: " + divisao);
                break;

            case 5:
                area = (n1) * 2 + (n2) * 2;
                System.out.println("Area ao quadrado = b*2+c*2: " + area);
                break;

            case 6:
                hipotenusa = n1 + n2;
                System.out.println("Hipotenusa é = b+c: " + hipotenusa);
                break;
            default:
                System.out.println("Operação efetuada com sucesso!!!");
        }
    }
}

