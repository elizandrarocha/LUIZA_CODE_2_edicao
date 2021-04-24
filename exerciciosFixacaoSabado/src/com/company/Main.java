package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
	    // escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor
        //caso: valores INTEIROS
        Scanner entrada = new Scanner(System.in);
        int valor = entrada.nextInt();
        System.out.println("Antecessor: " + (valor-1));

        // escreva um algoritmo para calcular a área do retângulo
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a base do retângulo: ");
        float base = input.nextFloat();
        System.out.println("Informe a altura do retângulo: ");
        float altura = input.nextFloat();
        float area = base*altura;
        System.out.println("A área do retângulo é: " + area);
         */

        //faça um algoritmo que leia a idade expressa em anos, meses e dias
        //e escreva a idade dessa pessoa escrita apenas em dias
        Scanner inputB = new Scanner(System.in);
        System.out.println("Digite suas idade no formato: ANOS MESES DIAS");
        int anos = inputB.nextInt();
        int meses = inputB.nextInt();
        int dias = inputB.nextInt();
        int idadeEmDias = 365*anos + 30*meses + dias;
        System.out.println("Sua idade em dias é: " + idadeEmDias);




    }
}
