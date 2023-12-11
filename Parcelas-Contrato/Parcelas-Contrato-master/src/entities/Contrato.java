
package entities;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contrato {
        
    private Integer numero;
    private LocalDate data;
    private Double total;
    private ArrayList<Parcela> Parcelas = new ArrayList<>();
    
    public Contrato(Integer numero, LocalDate data, Double total) {
        this.numero = numero;
        this.data = data;
        this.total = total;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public ArrayList<Parcela> getParcelas() {
        return Parcelas;
    }
   
    public void addParcela(Parcela p){
        Parcelas.add(p);
    }    
}
