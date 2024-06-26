import java.util.Scanner;

public class SomaDosNumerosImparesP6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro positivo: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro positivo: ");
        int num2 = scanner.nextInt();

        int soma = 0;
        for (int i = num1; i <= num2; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        System.out.println("A soma dos números ímpares entre " + num1 + " e " + num2 + " é: " + soma);

        scanner.close();
    }
}