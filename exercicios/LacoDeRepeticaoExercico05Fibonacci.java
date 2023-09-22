package academy.devdojo.exercicios;

public class LacoDeRepeticaoExercico05Fibonacci {
    public static void main(String[] args) {

        int contador = 0;
        int i = 0, j = 1, t = ( i+ j);

        while (contador <= 15){
            System.out.println("Fibonacci: " + t);
            t = i + j;
            i = j;
            j = t;
            contador++;
        }

    }
}
