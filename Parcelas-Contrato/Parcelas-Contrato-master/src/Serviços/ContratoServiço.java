
package Serviços;

import entities.Contrato;
import entities.Parcela;
import java.time.LocalDate;

public class ContratoServiço {
    
    private PagOnline pagOnline;

    public ContratoServiço(PagOnline pagOnline) {
        this.pagOnline = pagOnline;
    }
    public void processContrato( Contrato  contrato,int mes){
        
        double parc = contrato.getTotal()/mes;
        for (int i = 1; i <=mes; i++) {
            LocalDate vencData = contrato.getData().plusMonths(i);
            
            double juro = pagOnline.interesse(parc,i);
            double tx = pagOnline.txPagm(parc + juro);
            double totParc = parc+juro+tx;
            
            contrato.addParcela(new Parcela(vencData,totParc));
        }

    }
}
