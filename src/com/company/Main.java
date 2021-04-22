package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float nota1 = entrada.nextFloat();
        float nota2 = entrada.nextFloat();
        float nota3 = entrada.nextFloat();
        int faltas = entrada.nextInt();

        float media = (nota1 + nota2 + nota3)/3;

        if(media >= 7.0 && faltas <= 17) System.out.println("Aprovado %.f" + media);
        if(faltas > 17) System.out.println("Reprovado por falta");
        if(media < 7.0) System.out.println("Reprovado por nota %.f" + media);



    }
}
