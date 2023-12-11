
package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcela {
        
    private LocalDate date;
    private double quantia;

    public Parcela(LocalDate date, double quantia) {
        this.date = date;
        this.quantia = quantia;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getQuantia() {
        return quantia;
    }

    public void setQuantia(double quantia) {
        this.quantia = quantia;
    }
    
    public static  DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/YYYY");
    
    @Override
    public String toString() {
        return fmt.format(date)+" - "+ String.format("%.2f",quantia);
    }
    
    
}
