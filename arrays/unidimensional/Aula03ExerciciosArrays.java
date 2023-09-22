package academy.devdojo.arrays.unidimensional;

import java.util.Scanner;

public class Aula03ExerciciosArrays {
    public static void main(String[] args) {
        double[] vetor1 = new double[3];
        double[] vetor2 = new double[3];
        double[] resul = new double[3];


        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < vetor1.length; i++) {
            System.out.println((i + 1) + "º valor do 1º Vetor: ");
            vetor1[i] = scanner.nextDouble();
            System.out.println((i + 1) + "º valor do 2º Vetor: ");
            vetor2[i] = scanner.nextDouble();

            resul[i] = vetor1[i] * vetor2[i];
        }
        System.out.println("Resultado vetores v1 * v2 ");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.println(vetor1[i] + " X " + vetor2[i] + " = " + resul[i]);

        }

    }

}
