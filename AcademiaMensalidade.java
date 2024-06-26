import java.util.Scanner;

public class AcademiaMensalidade {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Informe a idade do cliente: ");
        int idade = scanner.nextInt();

      
        System.out.print("Informe o sexo do cliente (M/F): ");
        char sexo = scanner.next().charAt(0);

   
        scanner.close();

        
        double mensalidade = calcularMensalidade(idade, sexo);

      
        System.out.println("O valor da mensalidade a ser paga é: " + mensalidade);
    }

   
    public static double calcularMensalidade(int idade, char sexo) {
        double mensalidade = 0;

        if (sexo == 'M' || sexo == 'm') {
            if (idade <= 15) {
                mensalidade = 60.00;
            } else if (idade >= 16 && idade <= 18) {
                mensalidade = 75.00;
            } else if (idade >= 19 && idade <= 30) {
                mensalidade = 90.00;
            } else if (idade >= 31 && idade <= 40) {
                mensalidade = 85.00;
            } else {
                mensalidade = 80.00;
            }
        } else if (sexo == 'F' || sexo == 'f') {
            if (idade <= 18) {
                mensalidade = 60.00;
            } else if (idade >= 19 && idade <= 25) {
                mensalidade = 90.00;
            } else if (idade >= 26 && idade <= 40) {
                mensalidade = 85.00;
            } else {
                mensalidade = 80.00;
            }
        }

        return mensalidade;
    }
}