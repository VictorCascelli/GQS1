import java.util.Scanner;

public class DivisaoInteirosP12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numerador (dividendo): ");
        int numerador = scanner.nextInt();

        System.out.print("Digite o denominador (divisor): ");
        int denominador = scanner.nextInt();

        try {
            int resultado = dividir(numerador, denominador);
            System.out.println("O resultado da divisão é: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida!");
        }

        scanner.close();
    }

    public static int dividir(int numerador, int denominador) {
        if (denominador == 0) {
            throw new ArithmeticException("Divisão por zero");
        }
        return numerador / denominador;
    }
}