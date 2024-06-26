import java.util.Scanner;

public class MatrizTranspostaP8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];

        System.out.println("Digite os elementos da matriz 5x5:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matriz informada:");
        imprimirMatriz(matriz);

        int[][] transposta = calcularMatrizTransposta(matriz);
        System.out.println("\nMatriz transposta:");
        imprimirMatriz(transposta);

        scanner.close();
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] calcularMatrizTransposta(int[][] matriz) {
        int[][] transposta = new int[matriz[0].length][matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }

        return transposta;
    }
}