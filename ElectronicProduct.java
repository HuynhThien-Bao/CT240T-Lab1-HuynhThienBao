
import java.util.*;

/**
 * 
 */
public class ElectronicProduct extends Product implements Discountable {

    /**
     * Default constructor
     */
    public ElectronicProduct() {
    }

    /**
     * 
     */
    public int warrantyMonths;

    /**
     * @return
     */
    @Override public double calculateFinalPrice() {
        // TODO implement here
        return 0.0d;
    }

    /**
     * @param percent 
     * @return
     */
    public void applyDiscount(double percent) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public abstract double calculateFinalPrice();

    /**
     * @param percent  
     * @return
     */
    public void applyDiscount(double percent ) {
        // TODO implement here
        return null;
    }

    /**
     * @param percent  
     * @return
     */
    public void applyDiscount(double percent ) {
        // TODO implement here
        return null;
    }

}