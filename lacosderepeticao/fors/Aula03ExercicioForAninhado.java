package academy.devdojo.lacosderepeticao.fors;

public class Aula03ExercicioForAninhado {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(" \n ************************** \nTABUADA - MULTIPLICAÇÃO  "+i);
            for (int bum = 1; bum <= 10; bum++) {
                System.out.println("| " + i +" x "+ bum + ": " + (i * bum)+" |");
            }
        }
    }
}
