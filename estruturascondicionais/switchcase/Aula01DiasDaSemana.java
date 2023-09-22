package academy.devdojo.estruturascondicionais.switchcase;

import java.util.Scanner;

public class Aula01DiasDaSemana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o dia da semana: ");
        int day = input.nextInt();

        switch (day) {
            case 1:
                System.out.println(day + " referente a Segunda-Feira");
                break;
            case 2:
                System.out.println(day + " referente a Terça-Feira");
                break;
            case 3:
                System.out.println(day + " referente a Quarta-Feira");
                break;
            case 4:
                System.out.println(day + " referente a Quinta-Feira");
                break;
            case 5:
                System.out.println(day + " referente a Sexta-Feira");
                break;
            case 6:
                System.out.println(day + " referente a Sábado");
                break;
            case 7:
                System.out.println(day + " referente a Domingo");
                break;
            default:
                System.out.println("Dia inválido.");
                break;
        }
        System.out.println("Fim do programa.");
    }
}
