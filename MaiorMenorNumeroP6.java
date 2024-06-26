import java.util.Scanner;

public class MaiorMenorNumeroP6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite os números inteiros (digite 0 para parar):");
        int numero = scanner.nextInt();
        int maior = numero;
        int menor = numero;
        
        while (numero != 0) {
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
            numero = scanner.nextInt();
        }
        
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        
        scanner.close();
    }
}