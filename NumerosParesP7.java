import java.util.Scanner;

public class NumerosParesP7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int somaPares = 0;

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
           
            if (vetor[i] % 2 == 0) {
                somaPares += vetor[i];
            }
        }

        System.out.println("\nSoma dos números pares: " + somaPares);

        scanner.close();
    }
}