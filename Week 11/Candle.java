
/**
 * Exercise #2 p.530.
 * @author Tony
 */

public class Candle {
   
    public String color;
    public int height;
    public double price;
  
    public int getHeight()
    {
       return height;
    }
    
    public double getPrice()
    {
       return price;
    }
    
    public String getColor()
    {
       return color;
    }
    
    public void setColor(String c)
    {
       color = c;
    }
    
    public void setHeight(int h)
    {
       height = h;
       price = height*2;
    }
  
}

