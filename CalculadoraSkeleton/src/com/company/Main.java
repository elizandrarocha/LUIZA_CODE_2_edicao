package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.println("Entre com o primeiro número: ");

        numero1 = input.nextInt();

        System.out.println("Entre com um novo número: ");

        numero2 = input.nextInt();

        int soma, subt;
        float mult, div, resto;
        soma = numero1+numero2;
        subt = numero2-numero1;
        mult = numero1*numero2;
        div = (float) (numero2 / numero1);
        resto = numero2 % numero1;


        System.out.println("A soma dos números digitados é: " + soma);
        System.out.println("A subtração dos números digitados é: " + subt);
        System.out.println("A multiplicação dos números digitados é: " + mult);
        System.out.println("A divisão dos números digitados é: " + div);
        System.out.println("O resto da divisão entre os números digitados é: " + resto);
    }
}
