import java.util.Scanner;

public class MatrizMetodos4P9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];

        // Ler os elementos da matriz
        lerMatriz(scanner, matriz);

        // Imprimir a matriz informada
        System.out.println("Matriz informada:");
        imprimirMatriz(matriz);

        // Trocar os elementos da diagonal principal com os elementos da diagonal secundária
        trocarDiagonais(matriz);

        // Imprimir a matriz resultante
        System.out.println("\nMatriz resultante:");
        imprimirMatriz(matriz);

        scanner.close();
    }

    // Método para ler os elementos da matriz
    public static void lerMatriz(Scanner scanner, int[][] matriz) {
        System.out.println("Digite os elementos da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    // Método para imprimir a matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Método para trocar os elementos da diagonal principal com os elementos da diagonal secundária
    public static void trocarDiagonais(int[][] matriz) {
        for (int i = 0; i < 5; i++) {
            int temp = matriz[i][i];
            matriz[i][i] = matriz[i][4 - i];
            matriz[i][4 - i] = temp;
        }
    }
}