
package impostorenda;


public class PF  extends Contribuente{

    
    private  Double gastoSaude;

    public PF(Double gastoSaude, String nome, Double rendaAnul) {
        super(nome, rendaAnul);
        this.gastoSaude = gastoSaude;
    }

    public PF(Double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }
        
    @Override
    public double taxa() {
        double txBasica;
        if(getRendaAnul()<20000.0){
            txBasica=  getRendaAnul()*0.15;
        }else{
            txBasica= getRendaAnul() * 0.25;
        }
        txBasica -=getGastoSaude()*0.5;
        if(txBasica<0){
           txBasica = 0;
        }
        return txBasica;
    }

    public Double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(Double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }
    
}
