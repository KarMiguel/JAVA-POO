package cadastropessoa;

import static cadastropessoa.CadastroPessoa.p;
import java.util.ArrayList;
import java.util.Scanner;

public class Pessoa {

    public Scanner sc = new Scanner(System.in);
    public static ArrayList<Pessoa> listaPessoas = new ArrayList<>();
    
    private String nome;
    private String cpf;
    private int idade;
    private double altura;

    public void lerDados() {
        System.out.print("Informe seu nome:");
        setNome(sc.nextLine());
        sc.nextLine();
        System.out.print("Informe seu cpf:");
        setCpf(sc.next());
        while (p.validarCpf() == true) {
            System.out.println("CPF já cadastrado. Por favor, digite outro CPF.");
            System.out.print("Digite o CPF da pessoa: ");
            setCpf(sc.next());
        }
        System.out.print("Informe sua idade:");
        setIdade(sc.nextInt());
        System.out.print("Informe sua altura:");
        setAltura(sc.nextDouble());
        System.out.println("");

    }

    public boolean validarCpf() {
        for (int i = 0; i < listaPessoas.size(); i++) {
            if (listaPessoas.get(i).getCpf().equals(cpf)) {
                return true;
            }
        }
        return false;
    }

    public static double mediaALtura() {
        double soma = 0;
        for (int i = 0; i < listaPessoas.size(); i++) {
            soma += listaPessoas.get(i).getAltura();
        }
        double media = soma / listaPessoas.size();
        return media;
    }

    public static double porcMaiorId() {
        int menor = 0;
        for (int i = 0; i < listaPessoas.size(); i++) {
            if (listaPessoas.get(i).getIdade() >= 18) {
                menor++;
            }
        }
        double porc = (menor * 100) / listaPessoas.size();
        return porc;
    }

    public static void mostraMaiorId() {
        System.out.println("\nPessoas cadastrada maiores de Idade:");
        for (int i = 0; i < listaPessoas.size(); i++) {
            if (listaPessoas.get(i).getIdade() >= 18) {
                System.out.println(listaPessoas.get(i).toString());
                System.out.println("");
            }
        }
    }

    public static void pessoasCadastrada() {
        System.out.println("Pessoas Cadastrada:");
        for (Pessoa x : listaPessoas) {
            System.out.println(x);
        }
        System.out.println("");
    }

    public static Pessoa buscarPessoa(String cpf) {
        Pessoa p = null;
        for (int i = 0; i < listaPessoas.size(); i++) {
            if (listaPessoas.get(i).getCpf().equals(cpf)) {
                p = Pessoa.listaPessoas.get(i);
            }
        }
        return p;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " || CPF: " + this.cpf + " "
                + "|| Idade: " + this.idade + " || Altura: " + this.altura;
    }

    public String getCpf() {
        return cpf;
    }
    

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
