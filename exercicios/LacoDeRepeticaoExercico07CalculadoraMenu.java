package academy.devdojo.exercicios;

import java.util.Scanner;

public class LacoDeRepeticaoExercico07CalculadoraMenu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int decisao = 1;


        while (decisao != 0) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(" \n ************************** \nTABUADA - MULTIPLICAÇÃO  " + i);
                for (int bum = 1; bum <= 10; bum++) {
                    System.out.println("| " + i + " x " + bum + ": " + (i * bum) + " |");
                }
            }
            System.out.println("Deseja sair? \n Aperte ( 0 ) ");
            decisao = input.nextInt();
        }
    }
}