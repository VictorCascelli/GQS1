import java.util.Scanner;

public class CalculadoraHotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tipo de apartamento (S para Simples, D para Duplo): ");
        char tipoApartamento = scanner.next().charAt(0);

        System.out.print("Informe a quantidade de dias hospedado: ");
        int quantidadeDias = scanner.nextInt();

        scanner.close();

        double totalPagar = 0;

        if (tipoApartamento == 'S' || tipoApartamento == 's') {
            if (quantidadeDias < 10) {
                totalPagar = 100.00 * quantidadeDias;
            } else if (quantidadeDias <= 15) {
                totalPagar = 90.00 * quantidadeDias;
            } else {
                totalPagar = 80.00 * quantidadeDias;
            }
        } else if (tipoApartamento == 'D' || tipoApartamento == 'd') {
            if (quantidadeDias < 10) {
                totalPagar = 140.00 * quantidadeDias;
            } else if (quantidadeDias <= 15) {
                totalPagar = 120.00 * quantidadeDias;
            } else {
                totalPagar = 100.00 * quantidadeDias;
            }
        } else {
            System.out.println("Tipo de apartamento inválido. Informe S para Simples ou D para Duplo.");
            return;
        }

        System.out.println("O total a ser pago é: " + totalPagar);