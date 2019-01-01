import java.awt.Color;
import java.nio.file.*;
import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Tony
 */

public class ReadEmployeeFile
{
public static void main(String[] args)
{
Path file = Paths.get("C:\\users\\Tony\\Desktop\\Documents\\Summer 2018\\Java materials\\My work\\Employees.txt");

String[] array = new String[3];
String s = "";
String delimiter = ",";
int id;
String name ;
double payRate;
double gross;
final double HRS_IN_WEEK = 40;
double total = 0;
try
{
InputStream input = new BufferedInputStream(Files.newInputStream(file));
BufferedReader reader = new BufferedReader(new InputStreamReader(input));
System.out.println(); 
s = reader.readLine();

while(s != null)
{
array = s.split(delimiter);
id = Integer.parseInt(array[0]);
name = array[1];
payRate = Double.parseDouble(array[2]);
gross = payRate * HRS_IN_WEEK;
JOptionPane.showMessageDialog(null, "ID#" + id + " " + name + " $" + payRate + ". Gross = $" + gross);
total += gross;
s = reader.readLine(); 
}
reader.close();
}

catch(Exception e)
{
System.out.println("Message: " + e);
}

UIManager UI=new UIManager();
Color color1=Color.decode("0x0000FF");
 UI.put("OptionPane.background", color1);
 UI.put("Panel.background", Color.white);

 JOptionPane.showMessageDialog(null," Total gross payroll is $" + total,"SetColor",JOptionPane.INFORMATION_MESSAGE);


System.exit(0);
}
}
