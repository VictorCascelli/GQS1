import java.util.Scanner;

public class MediaDasIdadesP6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int quantidade = 0;

        System.out.println("Digite as idades (digite 0 para parar):");

        while (true) {
            int idade = scanner.nextInt();

            if (idade == 0) {
                break;
            }

            soma += idade;
            quantidade++;
        }


        if (quantidade > 0) {
            double media = (double) soma / quantidade;
            System.out.println("A média das idades é: " + media);
        } else {
            System.out.println("Nenhuma idade foi inserida.");
        }

        scanner.close();
    }
}