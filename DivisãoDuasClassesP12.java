import java.util.Scanner;

public class DivisãoDuasClassesP12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numerador (dividendo): ");
        int numerador = scanner.nextInt();

        System.out.print("Digite o denominador (divisor): ");
        int denominador = scanner.nextInt();

        Divisao div = new Divisao();
        try {
            int resultado = div.dividir(numerador, denominador);
            System.out.println("O resultado da divisão é: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }
}
public class Divisao {
    public int dividir(int numerador, int denominador) throws ArithmeticException {
        if (denominador == 0) {
            throw new ArithmeticException("Divisão por zero não permitida!");
        }
        if (denominador < 10) {
            throw new ArithmeticException("Divisor menor que 10 não permitido!");
        }
        return numerador / denominador;
    }
}