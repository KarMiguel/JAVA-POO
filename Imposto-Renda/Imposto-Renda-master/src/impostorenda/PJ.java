
package impostorenda;

public class PJ  extends Contribuente{

    private Integer numerosFuncionarios;

    public PJ(Integer numerosFuncionarios, String nome, Double rendaAnul) {
        super(nome, rendaAnul);
        this.numerosFuncionarios = numerosFuncionarios;
    }

    public PJ(Integer numerosFuncionarios) {
        this.numerosFuncionarios = numerosFuncionarios;
    }

    public Integer getNumerosFuncionarios() {
        return numerosFuncionarios;
    }

    public void setNumerosFuncionarios(Integer numerosFuncionarios) {
        this.numerosFuncionarios = numerosFuncionarios;
    }
    
    @Override
    public double taxa() {
        if(numerosFuncionarios>10){
            return getRendaAnul() * 0.14;
        }else{
            return getRendaAnul() * 0.16;
        }
    }
    
}
