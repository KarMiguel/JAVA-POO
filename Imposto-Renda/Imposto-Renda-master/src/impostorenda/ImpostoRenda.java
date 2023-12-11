
package impostorenda;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;


public class ImpostoRenda {

    
    public static void main(String[] args) {
       
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe a qtd de contribuintes: ");
        int n = sc.nextInt();
        
        ArrayList<Contribuente> list = new ArrayList<>();
        
        for(int i=1;i<=n;i++){
            System.out.println("Dados do #"+i+" Contribuente: ");
            System.out.print("Informe (f/j) para PF ou PJ: ");
            char tipo= sc.next().charAt(0);
            System.out.print("Nome: ");
            String nome=sc.next();
            System.out.print("Renda Anual: ");
            double renda= sc.nextDouble();
            if(tipo=='f'){
                System.out.print("Gastos com saúde: ");
                double gs =sc.nextDouble();
                PF pf = new PF(gs,nome,renda);
                list.add(pf);
            }else{
                System.out.print("Numeros funcionarios: ");
                Integer nFunc =sc.nextInt();
                PJ pj =  new PJ( nFunc,nome,renda);
                list.add(pj);
            }
        }
        System.out.println("");
        System.out.println("Taxas Pagas: ");
        for(Contribuente c:list){
            System.out.println(c.getNome()+" : R$ "+ String.format("%.2f",c.taxa()));
        }
        
        double soma=0;
        for(Contribuente c:list){
            soma+=c.taxa();
        }
        System.out.printf("Soma total das taxas são: R$ %.2f\n",soma);        
    }
    
}
