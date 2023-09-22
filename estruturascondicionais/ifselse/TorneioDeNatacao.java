package academy.devdojo.estruturascondicionais.ifselse;/* Eu como usuário gostaria de ter o nome e a idade de participantes
de um torneio de natação  e que o sistema imprimisse da seguinte forma
Menor que 10 anos: <Nome> participará da catergoria Infantil
Entre 11 e 15 anos: <Nome> Participar[a da categoria Juvenil
Entre 16 e 19 anos: <Nome> Participar[a da categoria Pré-adulto
Acima de 20 anos: <Nome> Participar[a da categoria Adulto
Para que eu possa rapidamente calssificar todos os participantes */

import java.util.Scanner;

public class TorneioDeNatacao {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Nome do(a) Participante: ");
        String name = teclado.nextLine();
        System.out.println("Idade do(a) Partipante: ");
        int age = teclado.nextInt();

        if (age < 10) {
            System.out.println(name + ", idade " + age + " ano(s),  participará da catergoria infatíl.");
        } else if (age >= 10 && age <= 15) {
            System.out.println(name + ", idade " + age + " ano(s),  participará da catergoria Juvenil.");
        }else if (age >= 16 && age <= 19) {
            System.out.println(name + ", idade " + age + " ano(s),  participará da catergoria Pré-Adulto.");
        }else {
            System.out.println(name + ", idade " + age + " ano(s),  participará da catergoria Adulto.");
        }


    }
}
