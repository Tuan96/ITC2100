public class Apartment {

   private String streetAddress;

   private int apartmentNumber;

   private int bedrooms;

   private double rent;

   //constructor

   public Apartment(String addr, int number, int numbeds, double rentValue) {

       setStreetAddress(addr);

       setApartmentNumber(number);

       setBedrooms(numbeds);

       setRent(rentValue);

   }

   public String getStreetAddress() 
   {
       return streetAddress;
   }

   public void setStreetAddress(String streetAddress) 
   {
       this.streetAddress = streetAddress;
   }

   public int getApartmentNumber() 
   {
       return apartmentNumber;
   }

   public void setApartmentNumber(int apartmentNumber) {
       
       if(apartmentNumber>=100 && apartmentNumber<=999) 
       {
           this.apartmentNumber = apartmentNumber;
       }

       else 
       {
           throw new ApartmentException(String.valueOf(apartmentNumber));
       }
       
   }

   public int getBedrooms() 
   {
       return bedrooms;
   }

   public void setBedrooms(int bedrooms) {

       if(bedrooms<1 || bedrooms>4)
       {
           throw new ApartmentException(String.valueOf(bedrooms));
       }

       else
       {
           this.bedrooms = bedrooms;
       }

   }

   public double getRent() 
   {
       return rent;
   }

   public void setRent(double rent) {

       if(rent<500 || rent >2500)
       {
           throw new ApartmentException(String.valueOf(rent));
       }

       else 
       {
            this.rent = rent;
       }

   }

   @Override

   public String toString() 
   {
       return "Apartment: " + streetAddress + ", ApartmentNumber = " +apartmentNumber + ", Bedrooms = " + bedrooms + ", Rent = $" + rent;
   }

}