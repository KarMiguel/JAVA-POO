package controle_remoto;

import java.util.Scanner;

public class Controle_Remoto {

    public static void main(String[] args) {
        Controle c = new  Controle();
        int op = 0;

        do {
            Scanner entr = new Scanner(System.in);
            System.out.println("\n=====CONTROLE TV=======");
            System.out.println("1 - Ligar\n2 - Play\n3 - Pause");
            System.out.println("4 - Abrir Menu\n5 - Fechar Menu");
            System.out.println("6 - Mais Volume\n7 - Menos Volume");
            System.out.println("8 - Desligar");
            System.out.println("-----------------------");
            op = entr.nextInt();
            
            if(op == 1){
                c.ligar();
            }else if(op == 2){
                c.play();             
            }else if (op == 3) {
                c.pause();
            } else if(op == 4){
                c.abrirMenu();
            }else if(op == 5){
                c.fecharMenu();
            }else if(op == 6){
                c.maisVolume();
            }else if(op == 7){
                c.menosVolume();
            }else if(op == 8){
                c.desligar();
            }    
        }while (op != 8);             
    }

}

    
    

