import java.util.Scanner;

public class SalarioP2 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        double salarioMinimo = 1300.0;
        double salario = 0.0;

        System.out.print("Digite o seu salário: ");
        salario = console.nextDouble();

        System.out.println("Você recebe " + salario / salarioMinimo + " salários mínimos.");

    }
}