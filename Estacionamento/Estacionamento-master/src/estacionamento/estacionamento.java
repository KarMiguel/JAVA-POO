
package estacionamento;

import entities.AluguelCarro;
import entities.Fatura;
import entities.Veiculo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import serviços.AluguelServ;
import serviços.TaxServBr;


public class estacionamento {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        int op=0;
       
        do{
            
            System.out.print("Modelo do carro: ");
            String nome = sc.nextLine();
            System.out.print("Placa do "+nome+" :");
            String placa = sc.nextLine();
            System.out.print("Entrada(dd/MM/YYYY HH:mm): ");
            LocalDateTime inicio = LocalDateTime.parse(sc.nextLine(),fmt);
            System.out.print("Saida(dd/MM/YYYY HH:mm) : ");
            
            LocalDateTime termino = LocalDateTime.parse(sc.nextLine(),fmt);
            AluguelCarro cr = new AluguelCarro(inicio,termino,new Veiculo(nome));
            TaxServBr tx = new TaxServBr();
            
            System.out.println("");
            System.out.print("Preço por hora: ");
            double precoHora = sc.nextDouble();
            System.out.print("Preço por Dia: ");
            double precoDia= sc.nextDouble();

            AluguelServ servAlug = new AluguelServ(precoHora,precoDia,new TaxServBr());
            servAlug.processFatura(cr);
            System.out.println("");
            
            System.out.println("FATURA: ");
            System.out.println("Placa:"+placa);
            System.out.println("Pagamento Basico: "+cr.getFatura().getPagamentoBasico());
            System.out.println("Imposto: "+cr.getFatura().getTax());
            System.out.println("Pagamento Total: "+cr.getFatura().getTotalPagamento());

            System.out.println("");
            System.out.println("Deseja calcular aluguel de outro carro?");
            System.out.println("1 - Sim ou 2 - Nao");
            op=sc.nextInt();
                if(op!=2){
                    break;
                }
        }while(op!=1);
    }
}
