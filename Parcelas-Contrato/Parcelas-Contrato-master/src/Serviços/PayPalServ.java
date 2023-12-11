
package Serviços;

public class PayPalServ implements PagOnline {

    @Override
    public double txPagm(double tx) {
        return tx * 0.02 ;
    }

    @Override
    public double interesse(double quantia, int mes) {
        return quantia *0.01 * mes;  
    }
    
}
