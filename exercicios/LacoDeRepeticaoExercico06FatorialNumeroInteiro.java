package academy.devdojo.exercicios;

import java.util.Scanner;

public class LacoDeRepeticaoExercico06FatorialNumeroInteiro {
    public static void main(String[] args) {

        int fatorial = 1;
        int num = 5;


        for (int i = 1; i <= num; i++) {
           fatorial = fatorial * i;
            System.out.println("Fatorial de " + num + "!" + "=" + (fatorial));
        }


    }
}