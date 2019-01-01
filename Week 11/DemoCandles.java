
/**
 * Exercise #2 p.530.
 * @author Tony
 */

public class DemoCandles {

    public static void main(String args[]) {
        
       Candle c = new Candle();
       System.out.println("Candle: ");
       
       c.setColor("Blue");
       c.setHeight(5);
       
       System.out.println("- Color: " + c.getColor()+"\n- Height: " + c.getHeight()+"\n- Price: $" + c.getPrice());
      
       ScentedCandle sc = new ScentedCandle();
       System.out.println("ScentCandle: ");
       
       sc.setColor("Blue");
       sc.setHeight(5);
       
       System.out.println("- Color: " + sc.getColor()+"\n- Height: " + sc.getHeight()+"\n- Price: $" + sc.getPrice());
       
    }
    
}
    
