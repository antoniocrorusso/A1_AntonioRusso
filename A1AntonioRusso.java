/*
 * Código Fonte da Prova A1 de Programação de Soluções Computacionais.
 * Nome do Aluno: Antonio Carlos Rodrigo de Oliveira Russo
 * RA: 12523118842
 * Caminho do Repositório: https://github.com/antoniocrorusso/A1_AntonioRusso.git
*/

import java.util.Scanner;

public class A1AntonioRusso{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Definição das Variáveis.
        String placa;

        double valorLitro;
        double kmRodados60, kmRodados80, kmRodados100, kmRodados120, kmRodados140;
        double combustivelTotal;
        double custoTotal;
        double velMediaPonderada;

        //Entradas
        System.out.print("Entre com a placa do veículo: ");
        placa = input.nextLine();
        
        valorLitro = inputNum("Entre com o valor do litro combustível: ", input);

        kmRodados60 = inputNum("Entre com a quantidade de quilômetros rodados a 60 km/h: ", input);
        kmRodados80 = inputNum("Entre com a quantidade de quilômetros rodados a 80 km/h: ", input);
        kmRodados100 = inputNum("Entre com a quantidade de quilômetros rodados a 100 km/h: ", input);
        kmRodados120 = inputNum("Entre com a quantidade de quilômetros rodados a 120 km/h: ", input);
        kmRodados140 = inputNum("Entre com a quantidade de quilômetros rodados a 140 km/h: ", input);

        //Processamento
        combustivelTotal = calculaCombustivel(kmRodados60, kmRodados80, kmRodados100, kmRodados120, kmRodados140);
        custoTotal = calculaCustoTotal(combustivelTotal, valorLitro);
        velMediaPonderada =  calculaMediaPonderada(kmRodados60, kmRodados80, kmRodados100, kmRodados120, kmRodados140);

        //Saída
        mostrarResultados(placa, combustivelTotal, custoTotal, velMediaPonderada);
        input.close();
    }

    public static double inputNum(String question, Scanner iScanner){

        System.out.println(question);
        
        return iScanner.nextDouble();
    }

    public static double calculaCombustivel(double trecho60, double trecho80, double trecho100, double trecho120, double trecho140){

        double combTrecho60, combTrecho80, combTrecho100, combTrecho120, combTrecho140;

        combTrecho60 = trecho60 / 30.7f; // 30.7 Km/l a 60 km/h
        combTrecho80 = trecho80 / 26.8f; //26.8 km/l a 80 km/h
        combTrecho100 = trecho100 / 22.4f; //22.4 km/l a 100 km/h
        combTrecho120 = trecho120 / 18.1f; //18.1 km/l a 120 km/h
        combTrecho140 = trecho140 / 14.5f; //14.5 km/l a 140 km/h

        return combTrecho60 + combTrecho80 + combTrecho100 + combTrecho120 + combTrecho140;
    }

    public static double calculaCustoTotal(double combustivelGasto, double valorPorLitro){

        return combustivelGasto * valorPorLitro;
    }

    public static double calculaMediaPonderada(double trecho60, double trecho80, double trecho100, double trecho120, double trecho140){
        
        double resultado;

        double totalKmRodados = trecho60 + trecho80 + trecho100 + trecho120 + trecho140;

        resultado = ((trecho60 * 60) + (trecho80 * 80) + (trecho100 * 100) + (trecho120 * 120) + (trecho140 * 140)) / totalKmRodados;

        return resultado;
    }

    public static void mostrarResultados(String numeroPlaca, double totalCombustivel, double valorTotal, double mediaPonderada){

        System.out.println("Placa do veículo: " + numeroPlaca);
        System.out.printf("Consumo total: %.4f litros",  totalCombustivel);
        System.out.printf("\nValor Total: R$ %.2f",  valorTotal);
        System.out.printf("\nVelocidade média ponderada: %.4f km/h",  mediaPonderada);
    }

}