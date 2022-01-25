package com.dio.Calculadora;

import java.util.Scanner;

public class CalculadoraSimples {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;
        int c;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();
        System.out.println("Digite o terceiro valor: ");
        c = scan.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        int dividir = dividir(a, b);
        int area = area(a, b, c);
        System.out.println("somar: " + somar);
        System.out.println("subt: " + subtrair);
        System.out.println("mult: " + multiplicar);
        System.out.println("div: " + dividir);
        System.out.println("area: " + area);
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        return a / b;
    }

    public static int area(int a, int b, int c) {
        return a = b + c;
    }
}
