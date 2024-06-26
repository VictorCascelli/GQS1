import java.util.Scanner;

public class Matriz3Metodos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];

        // Ler os elementos da matriz
        lerMatriz(scanner, matriz);

        // Imprimir a matriz informada
        System.out.println("Matriz informada:");
        imprimirMatriz(matriz);

        // Imprimir a matriz transposta
        System.out.println("\nMatriz transposta:");
        int[][] transposta = calcularMatrizTransposta(matriz);
        imprimirMatriz(transposta);

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

    // Método para calcular a matriz transposta
    public static int[][] calcularMatrizTransposta(int[][] matriz) {
        int[][] transposta = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }

        return transposta;
    }
} {
    
}
