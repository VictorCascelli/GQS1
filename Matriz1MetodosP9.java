import java.util.Scanner;

public class Matriz1MetodosP9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];

        lerMatriz(scanner, matriz);

        System.out.println("Matriz informada:");
        imprimirMatriz(matriz);

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

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
