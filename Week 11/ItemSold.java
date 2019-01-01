
/**
 * Exercise #3 pg.530.
 * @author Tony
 */

public class ItemSold {
    
private int invoiceNum;
private String description;
private double price;

public ItemSold(int invoiceNum, String description, double price) {
    this.invoiceNum = invoiceNum;
    this.description = description;
    this.price = price;
}

public int getInvoiceNum() {
    return invoiceNum;
}

public void setInvoiceNum(int invoiceNum) {
    this.invoiceNum = invoiceNum;
}

public String getDescription() {
    return description;
}

public void setDescription(String description) {
    this.description = description;
}

public double getPrice() {
    return price;
}

public void setPrice(double price) {
    this.price = price;
}

}