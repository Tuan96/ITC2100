public class ThrowApartmentException {

   public static void main(String[] args) {

       Apartment apartment[] = new Apartment[6];

       System.out.println("Constructing apartment: ");
       
       try

       {

           apartment[0] = new Apartment("Newbury St", 1203, 2, 1400);

           System.out.println("Apartment created succesfully");

       }

       catch(ApartmentException ae)

       {

           System.out.println(ae.getMessage());

       }

       try

       {

           apartment[1] = new Apartment("Gloucester St", 205, 1, 1200);  

           System.out.println("Apartment created succesfully");

       }

       catch(ApartmentException ae)

       {

           System.out.println(ae.getMessage());

       }

       try

       {

           apartment[2] = new Apartment("Huntington Avenue", 145, 5, 3000);

           System.out.println("Apartment created succesfully");

       }

       catch(ApartmentException ae)

       {

           System.out.println(ae.getMessage());

       }

       try

       {

           apartment[3] = new Apartment("Boylston St", 107, 3, 3200);

           System.out.println("Apartment created succesfully");

       }

       catch(ApartmentException ae)

       {

           System.out.println(ae.getMessage());

       }

       try

       {

           apartment[4] = new Apartment("Newton St", 306, 3, 2200);

           System.out.println("Apartment created succesfully");

       }

       catch(ApartmentException ae)

       {

           System.out.println(ae.getMessage());

       }

       try

       {

           System.out.println("Apartment created succesfully");

           apartment[5] = new Apartment("Symphony Road", 324, 4, 2100);

       }

       catch(ApartmentException ae)

       {

           System.out.println(ae.getMessage());

       }

       System.out.println("\nRevealing apartments: ");

       for(int i=0; i<6; i++)

       {

           if(apartment[i] == null)

               System.out.println("Apartment not constructed");

           else

           System.out.println(apartment[i]);

       }

   }

}