
package salariotrabalhador;

import entities.Trabalho;
import entities.HoraContrato;
import entities.Departamento;
import entities.enums.NivelTrabalho;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class SalarioTrablhador {

    public static void main(String[] args) throws ParseException{
        
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Trabalho trabalhador = null;
        int op=0;
        
        do{
                     
            System.out.print("Entre com o nome do departamento: ");
            String nomeDepartamento = sc.nextLine();
            System.out.println("Entre com os dados do trabalhador!");
            System.out.print("Nome:");
            String nome = sc.nextLine();
            System.out.print("Nivel de Trabalhador(JUNIOR,PLENO,SENIOR) : ");
            String nivel = sc.nextLine();
            System.out.print("Salario base: ");
            double salarioBase = sc.nextDouble();
            trabalhador = new Trabalho(nome,salarioBase,NivelTrabalho.valueOf(nivel),
                    new Departamento(nomeDepartamento));

                        System.out.println("Quantos contratos o trabalhador terá: ");
            int n = sc.nextInt();
            for (int i = 1 ; i <= n; i++) {
                System.out.println("Informe a data do #" +i+" contrato:");
                System.out.print("Data (DD/MM/YYYY):");
                Date contratoData = sdf.parse(sc.next());
                System.out.print("Valor por hora: ");
                double valorPorHora = sc.nextDouble();
                System.out.print("Duração do contrato (horas): ");
                int horas = sc.nextInt();

                HoraContrato contrato = new HoraContrato(contratoData,valorPorHora,horas);
                trabalhador.addContrato(contrato);
            }


            System.out.print("Informe mes e ano para calcular o salario(MM/YYYY): ");
            String mesAno = sc.next();
            int mes = Integer.parseInt(mesAno.substring(0,2));
            int ano = Integer.parseInt(mesAno.substring(3));
            System.out.println("Nome: "+ trabalhador.getNome());
            System.out.println("Departamento: "+trabalhador.getDepartamento().getNome());
            System.out.println("Renda do "+mesAno+" : "+ String.format("%.2f", trabalhador.renda(ano, mes)));

            System.out.println("Deseja calcular salario de outro funcionario?");
            System.out.println("1 - Sim ou 2 - Nao");
            op=sc.nextInt();
            if(op!=1){
                break;
            }
        }while(op!=2);
    }
}  
 
       
    

