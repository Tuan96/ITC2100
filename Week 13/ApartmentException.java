public class ApartmentException extends RuntimeException {

   private String message;

   @Override

   public String getMessage() 
   {
       return message;
   }

   public ApartmentException(String message) 
   {
       this.message = "Invalid requirement: " + message;
   }

}