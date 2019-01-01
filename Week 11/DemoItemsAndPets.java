
/**
 * Exercise #3 pg.530.
 * @author Tony
 */

public class DemoItemsAndPets {
    
public static void main(String[] args) {
    
    ItemSold item1 = new ItemSold(1001,"Plush toy",3.99);
    ItemSold item2 = new ItemSold(1002,"Pillow",12.99);
    PetSold puppy1 = new PetSold(1003,"Chihuahua",700,true,true,true);
    PetSold puppy2 = new PetSold(1004,"Bull",1999.99,true,false,false);

        System.out.println("item1");
        System.out.println("Invoice number: " + item1.getInvoiceNum());
        System.out.println("Description: " + item1.getDescription());
        System.out.println("Price: $" + item1.getPrice());
        System.out.println("\n");

        System.out.println("item2");
        System.out.println("Invoice number: " + item2.getInvoiceNum());
        System.out.println("Description: " + item2.getDescription());
        System.out.println("Price: $" + item2.getPrice());
        System.out.println("\n");

        System.out.println("puppy1");
        System.out.println("Invoice number: " + puppy1.getInvoiceNum());
        System.out.println("Description: " + puppy1.getDescription());
        System.out.println("Price: $" + puppy1.getPrice());
        System.out.println("Vaccinated: " + puppy1.isVaccinated());
        System.out.println("Neutered: " + puppy1.isNeutered());
        System.out.println("Housebroken: " + puppy1.isHousebroken());
        System.out.println("\n");

        System.out.println("puppy2");
        System.out.println("Invoice number: " + puppy2.getInvoiceNum());
        System.out.println("Description: " + puppy2.getDescription());
        System.out.println("Price: $" + puppy2.getPrice());
        System.out.println("Vaccinated: " + puppy2.isVaccinated());
        System.out.println("Neutered: " + puppy2.isNeutered());
        System.out.println("Housebroken: " + puppy2.isHousebroken());
        System.out.println("\n");

    }

}
       

