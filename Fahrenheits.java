import java.util.Scanner;

public class Fahrenheits {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        float celsius = 0;

        System.out.print("Digite a temperatura em Celsius: ");
        celsius = console.nextFloat();

        double fahrenheit = (celsius * 1.8) + 32;

        System.out.println(celsius + " graus Celsius são " + fahrenheit + " Fahrenheits");

    }
}