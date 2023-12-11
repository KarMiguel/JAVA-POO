
package serviços;

import entities.AluguelCarro;
import entities.Fatura;
import serviços.TaxServBr;
import java.time.Duration;


public class AluguelServ {
        
    private Double precoHora;
    private Double precoDia;
    
    private TaxServ taxserv;

    public AluguelServ(Double precoHora, Double precoDia, TaxServ taxServ) {
        this.precoHora = precoHora;
        this.precoDia = precoDia;
        this.taxserv = taxServ;
    }

    public void processFatura(AluguelCarro cr){
        double minutos = Duration.between(cr.getInicio(),cr.getTermino()).toMinutes();
        double horas = minutos/60;
        double pagBasico;
        if(horas <=12){
            pagBasico = precoHora * Math.ceil(horas);
        }else{
            pagBasico = precoDia * Math.ceil(horas/24);
        }
        double tax = taxserv.tax(pagBasico);
        
        cr.setFatura(new Fatura(pagBasico,tax));

    }

    public void setTaxserv(TaxServBr taxserv) {
        this.taxserv = taxserv;
    }
    public Double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(Double precoHora) {
        this.precoHora = precoHora;
    }

    public Double getPrecoDia() {
        return precoDia;
    }

    public void setPrecoDia(Double precoDia) {
        this.precoDia = precoDia;
    }
        
        
}
