import java.util.Scanner;

public class CalculoFatorialP6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número natural para calcular o fatorial: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Número inválido. Por favor, insira um número natural.");
        } else {
            long fatorial = calcularFatorial(numero);
            System.out.println(numero + "! = " + fatorial);
        }

        scanner.close();
    }

    // Função para calcular o fatorial de um número
    private static long calcularFatorial(int n) {
        if (n == 0) {
            return 1; // Caso base: 0! = 1
        } else {
            long fatorial = 1;
            for (int i = 1; i <= n; i++) {
                fatorial *= i;
            }
            return fatorial;
        }
    }