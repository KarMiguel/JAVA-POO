
package entities;

public class Fatura {

    private Double pagamentoBasico;
    private Double tax;

    public Fatura(Double pagamentoBasico, Double tax) {
        this.pagamentoBasico = pagamentoBasico;
        this.tax = tax;
    }

    public Double getPagamentoBasico() {
        return pagamentoBasico;
    }
    public void fatura(){
        
    }
    public void setPagamentoBasico(Double PagamentoBasico) {
        this.pagamentoBasico = PagamentoBasico;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }
    public double getTotalPagamento(){
        return getPagamentoBasico() + getTax();
    }
    
}
