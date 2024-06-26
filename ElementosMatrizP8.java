import java.util.Scanner;

public class ElementosMatrizP8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];

        System.out.println("Digite os elementos da matriz 5x5:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Elementos nas posições onde o índice da linha é par e o índice da coluna é ímpar:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    System.out.println("Matriz[" + i + "][" + j + "] = " + matriz[i][j]);
                }
            }
        }

        scanner.close();
    }
}