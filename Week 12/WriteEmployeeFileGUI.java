
/**
 *
 * @author Tony
 */

package mytwo;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

public class WriteEmployeeFileGUI extends Frame
implements ActionListener {

private TextField RecNumberField, NameField, RateField;

private Button enter, // send record to file
quit; // quit program

// Application other pieces

private DataOutputStream output;


public WriteEmployeeFileGUI() {

super( "Create Client File on This Computer" ); 

try {

output = new DataOutputStream(new FileOutputStream( "C:\\users\\Tony\\Desktop\\Documents\\Summer 2018\\Java materials\\My work\\Employees.txt" ) );
}
catch ( IOException e ) {
System.err.println( "File not opened properly\n" + e.toString() );

System.exit( 1 );
}

setSize( 400, 150 );
setLayout( new GridLayout( 4, 2 ) );

//Text: white. Background: light grey. Normal method.  
add( new Label("Enter employee ID number:"));
RecNumberField = new TextField(10);
RecNumberField.setForeground(Color.white);
RecNumberField.setBackground(Color.LIGHT_GRAY);
add(RecNumberField);

add( new Label("Enter name for employee #:") );

//Text: white. Background: Blue. Hexadecimal. 
NameField = new TextField(10);
Color color1=Color.decode("0xffffff");
NameField.setForeground(color1);
Color color2=Color.decode("0x0000FF");
NameField.setBackground(color2);
add(NameField);

//Basic color
add( new Label("Enter pay rate:") );
RateField = new TextField(10);
add(RateField);

enter = new Button( "Enter" ); 
enter.setBackground(Color.BLUE);
enter.setForeground(Color.WHITE);
enter.addActionListener( this );
add( enter );

quit = new Button( "Quit" );
quit.addActionListener( this );
quit.setBackground(Color.RED);
quit.setForeground(Color.WHITE);
add( quit );

setVisible( true );
}
 

public void actionPerformed( ActionEvent e )
{
if ( e.getSource() == enter ) CreateEntry();

if ( e.getSource() == quit ) {
try {
output.close();
}
catch ( IOException io ) {
System.err.println( "File not closed properly\n" +
io.toString() );
}

System.exit( 0 );
}
}
 

public void CreateEntry()
{
int RecNumber = 0;
Double r;

if ( ! RecNumberField.getText().equals( "" ) ) {

// output the values to the file
try {
RecNumber = Integer.parseInt( RecNumberField.getText() );
output.writeInt( RecNumber );
output.writeUTF( NameField.getText() );
r = new Double ( RateField.getText() );
output.writeDouble(r.doubleValue());


// clear the TextFields
RecNumberField.setText( "" );
NameField.setText( "" );
RateField.setText("");
}
catch ( NumberFormatException errmsg ) {
System.err.println("Error in data conversion !!!!" );
}
catch ( IOException errmsg ) {
System.err.println("Error Writing to the File !!!!!" +errmsg.toString() );
System.exit( 1 );
}
}
}

public static void main( String args[] )
{
new WriteEmployeeFileGUI();
}
}

