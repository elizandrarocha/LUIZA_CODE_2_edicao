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


        //faça um algoritmo que leia a idade expressa em anos, meses e dias
        //e escreva a idade dessa pessoa escrita apenas em dias
        Scanner inputB = new Scanner(System.in);
        System.out.println("Digite suas idade no formato: ANOS MESES DIAS");
        int anos = inputB.nextInt();
        int meses = inputB.nextInt();
        int dias = inputB.nextInt();
        int idadeEmDias = 365*anos + 30*meses + dias;
        System.out.println("Sua idade em dias é: " + idadeEmDias);
        */
        //escreva um algoritmo para ler o numero total de eleitores de um municipio
        //o numero de votos brancos, nulos e validos
        //calcular o percentual de votos em relacao ao total
        //CONSIDERANDO QUE TODOS VOTARAM
        Scanner inputC = new Scanner(System.in);
        System.out.println("Informe o total de Eleitores no Município: ");
        int totalEleitores = inputC.nextInt();
        System.out.println("Informe os votos no seguinte formato: BRANCOS NULOS VÁLIDOS: ");
        int votosBrancos = inputC.nextInt();
        int votosNulos = inputC.nextInt();
        int votosValidos = inputC.nextInt();
        int calculo;
        calculo = (100*votosBrancos)/totalEleitores;
        System.out.println("Percentual de votos Brancos: " + calculo + "%");
        calculo = (100*votosNulos)/totalEleitores;
        System.out.println("Percentual de votos Nulos: " + calculo + "%");
        calculo = (100*votosValidos)/totalEleitores;
        System.out.println("Percentual de votos Validos: " + calculo + "%");




    }
}
