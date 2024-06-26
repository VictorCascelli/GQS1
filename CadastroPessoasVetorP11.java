import java.util.Scanner;

public class CadastroPessoasVetorP11 {
    private Pessoa[] cadastro;
    private int numPessoas;
    private Scanner scanner;

    public Cadastro() {
        cadastro = new Pessoa[100];
        numPessoas = 0;
        scanner = new Scanner(System.in);
    }

    public void cadastrarPessoa(Pessoa pessoa) {
        if (numPessoas < 100) {
            cadastro[numPessoas++] = pessoa;
            System.out.println("Pessoa cadastrada com sucesso!");
        } else {
            System.out.println("Limite máximo de pessoas atingido.");
        }
    }

    public void imprimirCadastro() {
        System.out.println("Cadastro de pessoas:");
        for (int i = 0; i < numPessoas; i++) {
            System.out.println(cadastro[i].toString());
        }
    }

    public void imprimirPessoasFisicas() {
        System.out.println("Pessoas físicas cadastradas:");
        for (int i = 0; i < numPessoas; i++) {
            if (cadastro[i] instanceof PessoaFisica) {
                System.out.println(cadastro[i].toString());
            }
        }
    }

    public void imprimirPessoasJuridicas() {
        System.out.println("Pessoas jurídicas cadastradas:");
        for (int i = 0; i < numPessoas; i++) {
            if (cadastro[i] instanceof PessoaJuridica) {
                System.out.println(cadastro[i].toString());
            }
        }
    }

    public Pessoa pesquisarPorDocumento(String documento) {
        for (int i = 0; i < numPessoas; i++) {
            if (cadastro[i] instanceof PessoaFisica) {
                PessoaFisica pessoaFisica = (PessoaFisica) cadastro[i];
                if (pessoaFisica.getCPF().equals(documento)) {
                    return pessoaFisica;
                }
            } else if (cadastro[i] instanceof PessoaJuridica) {
                PessoaJuridica pessoaJuridica = (PessoaJuridica) cadastro[i];
                if (pessoaJuridica.getCNPJ().equals(documento)) {
                    return pessoaJuridica;
                }
            }
        }
        return null;
    }

    public void atualizarPessoa(String documento) {
        Pessoa pessoa = pesquisarPorDocumento(documento);
        if (pessoa != null) {
            System.out.print("Novo nome: ");
            String novoNome = scanner.nextLine();
            pessoa.setNome(novoNome);
            System.out.println("Pessoa atualizada com sucesso!");
        } else {
            System.out.println("Pessoa não encontrada.");
        }
    }

    public void excluirPessoa(String documento) {
        for (int i = 0; i < numPessoas; i++) {
            if (cadastro[i] instanceof PessoaFisica) {
                PessoaFisica pessoaFisica = (PessoaFisica) cadastro[i];
                if (pessoaFisica.getCPF().equals(documento)) {
                    removerElemento(i);
                    System.out.println("Pessoa física excluída com sucesso!");
                    return;
                }
            } else if (cadastro[i] instanceof PessoaJuridica) {
                PessoaJuridica pessoaJuridica = (PessoaJuridica) cadastro[i];
                if (pessoaJuridica.getCNPJ().equals(documento)) {
                    removerElemento(i);
                    System.out.println("Pessoa jurídica excluída com sucesso!");
                    return;
                }
            }
        }
        System.out.println("Pessoa não encontrada.");
    }

    private void removerElemento(int indice) {
        for (int i = indice; i < numPessoas - 1; i++) {
            cadastro[i] = cadastro[i + 1];
        }
        numPessoas--;
    }
}
public class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome;
    }
}
public class PessoaFisica extends Pessoa {
    private String CPF;

    public PessoaFisica(String nome, String CPF) {
        super(nome);
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public String toString() {
        return super.toString() + ", CPF: " + CPF;
    }
}
public class PessoaJuridica extends Pessoa {
    private String CNPJ;

    public PessoaJuridica(String nome, String CNPJ) {
        super(nome);
        this.CNPJ = CNPJ;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    @Override
    public String toString() {
        return super.toString() + ", CNPJ: " + CNPJ;
    }
}