package academy.devdojo.arrays.multidimensionais;

public class Aula01IntroducaoArraysMultDimensionais {
    public static void main(String[] args) {
        int[][] arrayMulti = new int[2][2];
        arrayMulti[0][0] = 22;
        arrayMulti[0][1] = 11;
        arrayMulti[1][1] = 44;
        arrayMulti[1][0] = 55;
        System.out.println(arrayMulti[0][0]);
        System.out.println(arrayMulti[0][1]);
        System.out.println(arrayMulti[1][1]);
        System.out.println(arrayMulti[1][0]);


    }
}
