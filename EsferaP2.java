import java.util.Scanner;

public class EsferaP2 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        double raioEsfera = 0.0;

        System.out.print("Raio: ");
        raioEsfera = console.nextDouble();

        double comprimentoEsfera = 2 * Math.PI * raioEsfera;
        System.out.println("Comprimento: " + comprimentoEsfera);

        double areaEsfera = Math.PI * Math.pow(raioEsfera, 2);
        System.out.println("area: " + areaEsfera);

        double volumeEsfera = 4/3 * Math.PI * Math.pow(raioEsfera, 3);
        System.out.println("Volume:" + volumeEsfera);
    }
}