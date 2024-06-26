import java.util.Scanner;

public class EquaçãoP3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Informe o valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Informe o valor de c: ");
        double c = scanner.nextDouble();

        scanner.close();

        if (a == 0 && b == 0 && c == 0) {
            System.out.println("Igualdade confirmada: 0 = 0");
        } else if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente");
        } else if (a == 0 && b != 0) {
            System.out.println("Esta é uma equação de primeiro grau: x = " + (-c / b));
        } else if (a != 0) {
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("Esta equação não possui raízes reais (delta < 0): delta = " + delta);
            } else if (delta == 0) {
                double raiz = -b / (2 * a);
                System.out.println("Esta equação possui duas raízes reais iguais: x' = x'' = " + raiz);
            } else {
                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Esta equação possui duas raízes reais diferentes: delta = " + delta +
                        ", x' = " + raiz1 + ", x'' = " + raiz2);
            }
        }
    }
}