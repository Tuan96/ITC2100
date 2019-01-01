
/**
 * Exercise #2 p.530.
 * @author Tony
 */

public class ScentedCandle extends Candle{
    
   public int scent;
   public int getScent()
           
    {
        return scent;
    }
   
    public void setScent(int s)
    {
        scent = s;
    }
    
    public void setColor(String sc)
    {
        color = sc;
    }
    
    public void setHeight(int h)
    {
        super.height = h;
        super.price = super.height*3;
    }
    
}