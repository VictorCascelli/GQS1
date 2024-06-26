
public class PessoaFisica {
    private String nome;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
java
Copy code
public class PessoaJuridica {
    private String nome;
    private String cnpj;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}

import java.util.Scanner;

public class Cadastro {
    private PessoaFisica[] pessoasFisicas;
    private PessoaJuridica[] pessoasJuridicas;
    private int numPessoasFisicas;
    private int numPessoasJuridicas;
    private Scanner scanner;

    public Cadastro() {
        pessoasFisicas = new PessoaFisica[100];
        pessoasJuridicas = new PessoaJuridica[100];
        numPessoasFisicas = 0;
        numPessoasJuridicas = 0;
        scanner = new Scanner(System.in);
    }

    public void cadastrarPessoaFisica() {
        if (numPessoasFisicas < 100) {
            PessoaFisica pessoaFisica = new PessoaFisica();
            System.out.print("Nome: ");
            pessoaFisica.setNome(scanner.nextLine());
            System.out.print("CPF: ");
            pessoaFisica.setCpf(scanner.nextLine());
            pessoasFisicas[numPessoasFisicas++] = pessoaFisica;
            System.out.println("Pessoa física cadastrada com sucesso!");
        } else {
            System.out.println("Limite máximo de pessoas físicas atingido.");
        }
    }

    public void cadastrarPessoaJuridica() {
        if (numPessoasJuridicas < 100) {
            PessoaJuridica pessoaJuridica = new PessoaJuridica();
            System.out.print("Nome: ");
            pessoaJuridica.setNome(scanner.nextLine());
            System.out.print("CNPJ: ");
            pessoaJuridica.setCnpj(scanner.nextLine());
            pessoasJuridicas[numPessoasJuridicas++] = pessoaJuridica;
            System.out.println("Pessoa jurídica cadastrada com sucesso!");
        } else {
            System.out.println("Limite máximo de pessoas jurídicas atingido.");
        }
    }

    public void imprimirPessoasFisicas() {
        System.out.println("Pessoas físicas cadastradas:");
        for (int i = 0; i < numPessoasFisicas; i++) {
            System.out.println("Nome: " + pessoasFisicas[i].getNome());
            System.out.println("CPF: " + pessoasFisicas[i].getCpf());
            System.out.println();
        }
    }

    public void imprimirPessoasJuridicas() {
        System.out.println("Pessoas jurídicas cadastradas:");
        for (int i = 0; i < numPessoasJuridicas; i++) {
            System.out.println("Nome: " + pessoasJuridicas[i].getNome());
            System.out.println("CNPJ: " + pessoasJuridicas[i].getCnpj());
            System.out.println();
        }
    }

    public void imprimirTodasPessoas() {
        imprimirPessoasFisicas();
        imprimirPessoas
public void pesquisarPorCPF(String cpf) {
        boolean encontrou = false;
        for (int i = 0; i < numPessoasFisicas; i++) {
            if (pessoasFisicas[i].getCpf().equals(cpf)) {
                System.out.println("Pessoa física encontrada:");
                System.out.println("Nome: " + pessoasFisicas[i].getNome());
                System.out.println("CPF: " + pessoasFisicas[i].getCpf());
                encontrou = true;
                break;
            }
        }
         if (!encontrou) {
            System.out.println("Nenhuma pessoa física encontrada com o CPF informado.");
 }
    }

    public void pesquisarPorCNPJ(String cnpj) {
        boolean encontrou = false;
        for (int i = 0; i < numPessoasJuridicas; i++) {
            if (pessoasJuridicas[i].getCnpj().equals(cnpj)) {
                System.out.println("Pessoa jurídica encontrada:");
                System.out.println("Nome: " + pessoasJuridicas[i].getNome());
                System.out.println("CNPJ: " + pessoasJuridicas[i].getCnpj());
                encontrou = true;
                break;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhuma pessoa jurídica encontrada com o CNPJ informado.");
        }
    }

    public void atualizarPorCPF(String cpf) {
        for (int i = 0; i < numPessoasFisicas; i++) {
            if (pessoasFisicas[i].getCpf().equals(cpf)) {
                System.out.print("Novo nome: ");
                pessoasFisicas[i].setNome(scanner.nextLine());
                System.out.println("Pessoa física atualizada com sucesso!");
                return;
            }
        }
        System.out.println("Nenhuma pessoa física encontrada com o CPF informado.");
    }

    public void atualizarPorCNPJ(String cnpj) {
        for (int i = 0; i < numPessoasJuridicas; i++) {
            if (pessoasJuridicas[i].getCnpj().equals(cnpj)) {
                System.out.print("Novo nome: ");
                pessoasJuridicas[i].setNome(scanner.nextLine());
                System.out.println("Pessoa jurídica atualizada com sucesso!");
                return;
            }
        }
        System.out.println("Nenhuma pessoa jurídica encontrada com o CNPJ informado.");
    }

    public void excluirPorCPF(String cpf) {
        for (int i = 0; i < numPessoasFisicas; i++) {
            if (pessoasFisicas[i].getCpf().equals(cpf)) {
                for (int j = i; j < numPessoasFisicas - 1; j++) {
                    pessoasFisicas[j] = pessoasFisicas[j + 1];
                }
                numPessoasFisicas--;
                System.out.println("Pessoa física excluída com sucesso!");
                return;
            }
        }
        System.out.println("Nenhuma pessoa física encontrada com o CPF informado.");
    }

    public void excluirPorCNPJ(String cnpj) {
        for (int i = 0; i < numPessoasJuridicas; i++) {
            if (pessoasJuridicas[i].getCnpj().equals(cnpj)) {
                for (int j = i; j < numPessoasJuridicas - 1; j++) {
                    pessoasJuridicas[j] = pessoasJuridicas[j + 1];
                }
                numPessoasJuridicas--;
                System.out.println("Pessoa jurídica excluída com sucesso!");
                return;
            }
        }
        System.out.println("Nenhuma pessoa jurídica encontrada com o CNPJ informado.");
    }
}
