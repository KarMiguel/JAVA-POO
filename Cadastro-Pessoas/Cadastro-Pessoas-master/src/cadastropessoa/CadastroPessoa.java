package cadastropessoa;

import java.util.Locale;
import java.util.Scanner;

public class CadastroPessoa {
    
    public static Pessoa p;
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int op ;
        do {
            System.out.println("===========Cadastrar Clientes===========");
            System.out.println("========================================");
            System.out.println("1-Cadastrar Clientes!\n2-Pessoas Cadastradas!");
            System.out.println("3-Media de Altura!\n4-Porcentagem de pessoas maiores de idade!");
            System.out.println("5-Mostrar dados dos maiores de idade!\n6-Buscar Pessoa!");
            System.out.println("7-Remover Cadastro!\n8-Sair!");
            System.out.println("========================================");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    p = new Pessoa();
                    p.lerDados();
                    Pessoa.listaPessoas.add(p);
                    break;
                case 2:
                    Pessoa.pessoasCadastrada();
                    break;
                case 3:
                    double media = Pessoa.mediaALtura();
                    System.out.printf("\nA Media das alturas cadastrada= %.2f!!\n", media);
                    break;
                case 4:
                    double porc = Pessoa.porcMaiorId();
                    System.out.printf("\n%.2f das pessoas cadastrada sao maiores de idade!!\n", porc);
                    break;
                case 5:
                    Pessoa.mostraMaiorId();
                    break;
                case 6:
                    {
                        System.out.print("Informe o numero do cpf a ser buscado:"); 
                        String cpf = sc.next();
                        Pessoa pessoa= Pessoa.buscarPessoa(cpf);
                        if(pessoa ==null){
                            System.out.println("\nUsuario Inexistente");
                        }else{
                            System.out.println("Usuario Encontrado:\n");
                            System.out.println(pessoa.toString());
                        }   break;
                    }
                case 7:
                    {
                        System.out.print("Informe o cpf  do cadastro qeu deseja remover:");
                        String cpf = sc.next();
                        Pessoa pessoa= Pessoa.buscarPessoa(cpf);
                        if(pessoa ==null){
                            System.out.println("\nUsuario Inexistente");
                        }else{
                            System.out.println("Cadastro do "+pessoa.getNome()+" removido!\n");
                            Pessoa.listaPessoas.remove(pessoa);
                        }   break;
                    }
                case 8:
                    System.out.println("Obrigado!");
                    break;
                default:
                    System.out.println("Opção Inválida!!\nInforme outro numero:");
                    break;
            }
        } while (op != 8);
    }
}
