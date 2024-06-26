import java.util.Scanner;

public class NumerosNegativosP7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] vetor = new double[10];
        
        System.out.println("Digite 10 números reais:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextDouble();
        }

        System.out.println("Vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
      
        System.out.println("\nPosições dos números negativos:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                System.out.println("Posição " + i + ": " + vetor[i]);
            }
        }

        scanner.close();
    }
}