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

        //escreva um algoritmo que leia o salário atual de um funcionário e o percentual de ajuste
        //calcule e escreva o valor do novo salário
        Scanner inputD = new Scanner(System.in);
        System.out.println("Informe o seu salário atual: ");
        double salario = inputD.nextDouble();
        System.out.println("Informe o percentual de ajuste em X%: ");
        double percentualAjuste = inputD.nextDouble();
        double novoSalario = salario + (salario * (percentualAjuste/100));
        System.out.println("O seu novo salário ajustado é: " + novoSalario);

        //escreva um algoritmo que leia o custo de fabrica de um carro
        //e calcule o custo final ao consumidor
        Scanner inputE = new Scanner(System.in);
        float custoFabrica;
        System.out.println("Informe o custo de fábrica do carro: ");
        custoFabrica = inputE.nextFloat();
        float percentDistribuidor, percentImpostos;
        System.out.println("Informe o % do Distribuidor e dos Impostos no formato X% Y%: ");
        percentDistribuidor = inputE.nextFloat();
        percentImpostos = inputE.nextFloat();
        float custoFinal = custoFabrica + (custoFabrica*(percentDistribuidor/100)) + (custoFabrica*(percentImpostos/100));
        System.out.println("Custo final ao consumidor é: " + custoFinal);

         */
        //escreva um algoritmo que leia a qtd de carros vendidos e
        //o valor total de vendas, o salário fixo, e valor recebido por carro vendido
        //imprimir salario final do funcionário
        int  qtdVendidos;
        double totValorVendas, valorCarroVend, salarioFixo, salarioFinal;
        Scanner leia = new Scanner(System.in);
        System.out.println("Quantos carros você vendeu no mês? ");
        qtdVendidos = leia.nextInt();
        System.out.println("Qual foi o valor total de suas vendas em R$: ");
        totValorVendas = leia.nextDouble();
        System.out.println("Qual é o seu salário fixo em R$: ");
        salarioFixo = leia.nextDouble();
        System.out.println("Quanto você recebe por carro vendido? ");
        valorCarroVend = leia.nextDouble();
        salarioFinal = salarioFixo + (valorCarroVend*qtdVendidos) + (0.05 * totValorVendas);
        System.out.println("Seu salário final é: R$ " + salarioFinal);





    }
}
