
package entities;

import entities.enums.NivelTrabalho;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalho {
        
    private String nome;
    private Double salarioBase;
    private NivelTrabalho level;
    
    private Departamento departamento;
    private List <HoraContrato> contratos = new ArrayList<>();

    
    public Trabalho(String nome, Double salarioBase, NivelTrabalho level, Departamento departamento) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.level = level;
        this.departamento = departamento;
    }
        public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public NivelTrabalho getLevel() {
        return level;
    }

    public void setLevel(NivelTrabalho level) {
        this.level = level;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<HoraContrato> getContrato() {
        return contratos;
    }

    public void addContrato(HoraContrato contrato){
        contratos.add(contrato);
    }
    public void removeContrato( HoraContrato contrato){
        contratos.remove(contrato);
        
    }
 
    public double renda(int ano,int mes){
        double soma= salarioBase;
        Calendar cal = Calendar.getInstance();
        for(HoraContrato c: contratos){
            cal.setTime(c.getData());
            int c_ano = cal.get(Calendar.YEAR);
            int c_mes = 1+ cal.get(Calendar.MONTH);
            if(ano == c_ano && mes == c_mes){
                soma += c.totalValor();
            }
        }    
        
        return soma;
    }
    
}
    
    
