
package impostorenda;


public abstract class Contribuente {
        
    private String nome;
    private Double rendaAnul;

    public Contribuente(String nome, Double rendaAnul) {
        this.nome = nome;
        this.rendaAnul = rendaAnul;
    }

    public Contribuente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaAnul() {
        return rendaAnul;
    }

    public void setRendaAnul(Double rendaAnul) {
        this.rendaAnul = rendaAnul;
    }
    
    public abstract double taxa();
    
}
