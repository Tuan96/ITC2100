//1 page code.
public class ArrayException {

public static void main(String args[]) {

int tot=0,i;
int array[] = {6,4,9,24,5,9,-5,30,-20,10};

try 
{     
    System.out.println("The array has 10 elements: 6,4,9,24,5,9,-5,30,-20,10. ");
    for(i=0;i<array.length;++i) 
{
    
System.out.println("The array index value is " + array[i]);

tot=tot+array[i];

}

System.out.println("\n\nThe total of the array values is: " + tot + "\n\n");

}//try block 

catch(ArrayIndexOutOfBoundsException errmsg) {
//System.out.println("\nThe array index number exceeds the number of elements in the array ")
System.out.println("The error recieved is: " + errmsg +"\n\n");
System.out.println("\nThe array index number exceeds the number of elements in the array. The array only has " + array.length + " elements." ); 
}
//catch all, which includes the ArithmeticException, but in this exercise, this exception almost can not be triggered. 
catch(Exception errmsg) {
System.out.println("This is the catch-all if you will " + errmsg);
}

}

}


