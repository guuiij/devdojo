package academy.devdojo.estruturascondicionais.ifselse;
// Receba um número inteiro do usuário e
// imprima um número inteiro da semana correspondente
// Sendo 1 domingo...

import java.util.Scanner;

public class DiasDaSemana  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite numero: ");
        int day = input.nextInt();

        if (day == 1) {
            System.out.println( day + " referente a Segunda-Feira");
        } else if (day == 2) {
            System.out.println( day + " referente a Terça-Feira");
        }else if (day == 3) {
            System.out.println( day + " referente a Quarta-Feira");
        }else if (day == 4) {
            System.out.println( day + " referente a Quinta-Feira");
        }else if (day == 5) {
            System.out.println( day + " referente a Sexta-Feira");
        }else if (day == 6) {
            System.out.println( day + " referente a Sábado");
        }else if (day == 7) {
            System.out.println( day + " referente a Domingo");
        } else {
            System.out.println(day + " - Não tem nenhum dia da semana correspondente a esse número.");
        }
    }

}
