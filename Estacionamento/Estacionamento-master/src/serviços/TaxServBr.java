
package serviços;


public class TaxServBr implements TaxServ {
    
    public double  tax(double tax){
        if(tax<=100){
            return tax*0.2;
        }else{
            return tax*0.15;
        }
    }
}
