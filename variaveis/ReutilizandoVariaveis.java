package academy.devdojo.variaveis;

public class ReutilizandoVariaveis {
    public static void main(String[] args) {
        double wage = 3000.00;
        int discount = 30; // Valores discount 30%,15% ,5%
        double result = (wage * discount)/100;
        System.out.println("Salário: R$ "+wage + " \n Desconto: " + discount +"%" + "\n Resultado: " + result );
        System.out.println("***************");

         discount = 15;
         result = (wage * discount)/100;
        System.out.println("Salário: R$ "+wage + " \n Desconto: " + discount +"%" + "\n Resultado: " + result );
        System.out.println("***************");



        discount = 5;
         result = (wage *0.05);
        System.out.println("Salário: R$ "+wage + "\n Resultado: " + result );

    }
}
