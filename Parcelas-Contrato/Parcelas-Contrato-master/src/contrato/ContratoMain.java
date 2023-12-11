
package contrato;

import Serviços.ContratoServiço;
import Serviços.PayPalServ;
import entities.Contrato;
import entities.Parcela;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class ContratoMain {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        int op=0;
        do{
            System.out.println("Dados do Contrato:");
            System.out.print("Numero:");
            int numContrato = sc.nextInt();
            System.out.print("Data (dd/MM/YYYY): ");
            LocalDate data = LocalDate.parse(sc.next(),fmt);
            System.out.print("Valor contrato: ");
            double totValor = sc.nextDouble();
            Contrato contrato = new Contrato(numContrato,data,totValor);
            System.out.print("Numero de Parcelas do Contrato:");
            int numParcela = sc.nextInt();

            ContratoServiço contratoServiço = new ContratoServiço(new PayPalServ());

            contratoServiço.processContrato(contrato, numParcela);

            System.out.println("Parcelas: ");
            for(Parcela p:contrato.getParcelas()){
                System.out.println(p);
            }
            System.out.println("Deseja parcelar outro contrato?");
            System.out.println("1 - Sim ou 2 - Nao");
            op=sc.nextInt();
                if(op!=2){
                    break;
                }
                    
        }while(op!= 1);
    }
    
}
