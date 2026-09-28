
import java.util.*;

/**
 * 
 */
public abstract class Product {

    /**
     * Default constructor
     */
    public Product() {
    }

    /**
     * 
     */
    private String id;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private double price;

    /**
     * @return
     */
    public abstract double calculateFinalPrice();

    /**
     * @return
     */
    public String getId() {
        // TODO implement here
        return "";
    }

    /**
     * @param value
     */
    public void setId(String value) {
        // TODO implement here
    }

    /**
     * @return
     */
    public String getName() {
        // TODO implement here
        return "";
    }

    /**
     * @param value
     */
    public void setName(String value) {
        // TODO implement here
    }

    /**
     * @return
     */
    public double getPrice() {
        // TODO implement here
        return 0.0d;
    }

    /**
     * @param value
     */
    public void setPrice(double value) {
        // TODO implement here
    }

    /**
     * @param id 
     * @param name 
     * @param price
     */
    public void Product(String id, String name, double price) {
        // TODO implement here
    }

}