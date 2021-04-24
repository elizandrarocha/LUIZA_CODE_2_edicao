package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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
    }
}
