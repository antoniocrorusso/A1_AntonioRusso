/*
 * Código Fonte da Prova A1 de Programação de Soluções Computacionais.
 * Nome do Aluno: Antonio Carlos Rodrigo de Oliveira Russo
 * RA: 12523118842
 * Caminho do Repositório: https://github.com/antoniocrorusso/A1_AntonioRusso.git
*/

import java.util.Scanner;

public class A1AntonioRusso{
    public static void main(String[] args) {

        //Definição das Variáveis.
        String placa;

        double valorLitro;

        double totalKmRodados, kmRodados60, kmRodados80, kmRodados100, kmRodados120, kmRodados140;

        double combTrecho60, combTrecho80, combTrecho100, combTrecho120, combTrecho140;
        
        double combustivelTotal;

        double custoTotal;

        double velMediaPonderada;

        Scanner input = new Scanner(System.in);

        //Entradas
        System.out.print("Entre com a placa do veículo: ");
        placa = input.nextLine();

        System.out.println("Entre com o valor do litro combustível: ");
        valorLitro = input.nextDouble();

        System.out.println("Entre com a quantidade de quilômetros rodados a 60 km/h: ");
        kmRodados60 = input.nextDouble();

        System.out.println("Entre com a quantidade de quilômetros rodados a 80 km/h: ");
        kmRodados80 = input.nextDouble();

        System.out.println("Entre com a quantidade de quilômetros rodados a 100 km/h: ");
        kmRodados100 = input.nextDouble();

        System.out.println("Entre com a quantidade de quilômetros rodados a 120 km/h: ");
        kmRodados120 = input.nextDouble();

        System.out.println("Entre com a quantidade de quilômetros rodados a 140 km/h: ");
        kmRodados140 = input.nextDouble();

        //Processamento

        combTrecho60 = kmRodados60 / 30.7f; // 30.7 Km/l a 60 km/h
        combTrecho80 = kmRodados80 / 26.8f; //26.8 km/l a 80 km/h
        combTrecho100 = kmRodados100 / 22.4f; //22.4 km/l a 100 km/h
        combTrecho120 = kmRodados120 / 18.1f; //18.1 km/l a 120 km/h
        combTrecho140 = kmRodados140 / 14.5f; //14.5 km/l a 140 km/h

        combustivelTotal = combTrecho60 + combTrecho80 + combTrecho100 + combTrecho120 + combTrecho140;

        custoTotal = combustivelTotal * valorLitro;


        totalKmRodados = kmRodados60 + kmRodados80 + kmRodados100 + kmRodados120 + kmRodados140;

        velMediaPonderada =  ((kmRodados60 * 60) + (kmRodados80 * 80) + (kmRodados100 * 100) + (kmRodados120 * 120) + (kmRodados140 * 140)) / totalKmRodados;

        //Saída

        System.out.println(placa);
        System.out.println(combustivelTotal);
        System.out.println(custoTotal);
        System.out.println(velMediaPonderada);

    }

}