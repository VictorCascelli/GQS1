import java.util.Scanner;

public class MediaSalarialP4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPessoas = 0;
        int numeroFilhos = 0;
        double salario = 0.0;
        int somaFilhos = 0;
        double somaSalarios = 0.0;
        int quantSalarios = 0;

        while (true) {
            System.out.print("Digite o salario: ");
            salario = scanner.nextDouble();

            if (salario < 0) {
                break;
            }

            System.out.print("Digite o número de filhos: ");
            numeroFilhos = scanner.nextInt();

            totalPessoas++;
            somaFilhos += numeroFilhos;
            somaSalarios += salario;

        }

            double mediaFilhos = somaFilhos / totalPessoas;
            double mediaSalarial = somaSalarios / totalPessoas;

            System.out.println("Média de filhos da cidade é: " + mediaFilhos);
        System.out.println("Média salarial cidade é: " + mediaSalarial);

        scanner.close();