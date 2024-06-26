
import java.util.Scanner;

public class MediaNotasP4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int alunosAcima90 = 0;
        int alunosReprovados = 0;
        double maiorNota = Double.MIN_VALUE;
        double menorNota = Double.MAX_VALUE;
        double somaNotas = 0;
        int quantidadeAlunos = 0;

        while (true) {
            System.out.print("Digite a nota final do aluno (ou um número negativo para encerrar): ");
            double notaFinal = scanner.nextDouble();

            if (notaFinal < 0) {
                break;
            }

            System.out.print("Digite o total de faltas do aluno: ");
            int faltas = scanner.nextInt();

            quantidadeAlunos++;
            somaNotas += notaFinal;

            if (notaFinal >= 90) {
                alunosAcima90++;
            }

            if (notaFinal < 70 || faltas >= 20) {
                alunosReprovados++;
            }

            if (notaFinal > maiorNota) {
                maiorNota = notaFinal;
            }

            if (notaFinal < menorNota) {
                menorNota = notaFinal;
            }
        }

        if (quantidadeAlunos > 0) {
            double mediaNotas = somaNotas / quantidadeAlunos;

            System.out.println("Quantidade de alunos com nota final maior ou igual a 90: " + alunosAcima90);
            System.out.println("Quantidade de alunos reprovados por nota ou falta: " + alunosReprovados);
            System.out.println("Maior nota: " + maiorNota);
            System.out.println("Menor nota: " + menorNota);
            System.out.println("Média de notas da turma: " + mediaNotas);
        } else {
            System.out.println("Nenhum aluno foi inserido.");
        }

        scanner.close();
    }
}
