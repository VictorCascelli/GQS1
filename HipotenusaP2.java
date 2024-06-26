import java.util.Scanner;

public class HipotenusaP2 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        double cateto1 = 0.0;
        double cateto2 = 0.0;

        System.out.print("Cateto 1: ");
        cateto1 = console.nextDouble();

        System.out.print("Cateto 2: ");
        cateto2 = console.nextDouble();

        double hipotenusa = Math.pow(cateto1, 2) + Math.pow(cateto2, 2);

        System.out.println("Hipotenusa: " + hipotenusa);

    }
}