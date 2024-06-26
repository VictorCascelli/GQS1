import java.util.Scanner;

public class LosangoP2 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        float diagonalMaior = 0;
        float diagonalMenor = 0;

        System.out.print("Digite a diagonal maior: ");
        diagonalMaior = console.nextFloat();

        System.out.print("Digite a diagonal menor: ");
        diagonalMenor = console.nextFloat();

        float areaLosango = (diagonalMaior * diagonalMenor)/2;

        System.out.println("A área do losango é de " + areaLosango);
        
    }
}