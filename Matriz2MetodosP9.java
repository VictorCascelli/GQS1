
import java.util.Scanner;

public class Matriz2MetodosP9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];

        lerMatriz(scanner, matriz);

        System.out.println("Elementos nas posições onde o índice da linha é par e o índice da coluna é ímpar:");
        imprimirElementosPosicoesParesImpares(matriz);

        scanner.close();
    }

    public static void lerMatriz(Scanner scanner, int[][] matriz) {
        System.out.println("Digite os elementos da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public static void imprimirElementosPosicoesParesImpares(int[][] matriz) {
        for (int i = 0; i < 5; i += 2) {
            for (int j = 1; j < 5; j += 2) {
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println();
    }
}
