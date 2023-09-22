package academy.devdojo.estruturascondicionais.ifselse;

import java.util.Scanner;

public class AlistamentoMilitar {
    public static void main(String[] args) {
        Scanner informa = new Scanner(System.in);

        System.out.println("Alistamento Militar \n Informe seu sexo:");
        System.out.println("(M) - para masculino. (F) - para Feminino. ");
        String sexo = informa.next();
        System.out.println("Qual sua idade ?");
        int idade = informa.nextInt();

        if (sexo.equalsIgnoreCase("M") && idade >= 18) {
            System.out.println("Alistamento Obrigatório !");
        } else if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F") && idade < 18) {
            System.out.println("Alistamento não permitdo. ");
        } else {
            System.out.println("Deseja se alistar ?");
        }
    }
}
