
package entities;

import java.util.Date;


public class HoraContrato {
        
        private Date data;
        private double valor;
        private  Integer horas;

    public HoraContrato(Date data, double valor, Integer horas) {
        this.data = data;
        this.valor = valor;
        this.horas = horas;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }
        
    public  double totalValor(){
        return valor * horas;
    }
}
