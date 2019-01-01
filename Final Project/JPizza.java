
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 * 1) Exercise #6 pg.786.
 * @author Tony
 */

public class JPizza extends JFrame implements ItemListener {

    int totalPrice = 0;
    int sizePizzaNum, toppingPizzaNum;
    int sPrice, tPrice, sumPrice;
    int[] sizePizzaPrice = {0,7,9,11,14};
    int[] toppingPizzaPrice = {0,0,1,1,2,3,4};

    FlowLayout flow = new FlowLayout();
    JLabel companyName = new JLabel("Pizza Final Price");
    JComboBox sizeBox = new JComboBox();
    JLabel sizeList = new JLabel("Size List");
    JComboBox toppingBox = new JComboBox();
    JLabel toppingList = new JLabel("Topping List");
    JTextField totPrice = new JTextField(10);
   
    String output;

    public JPizza() {
    super("Pizza Final Price");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel pane = new JPanel();
    pane.setLayout(flow);
    sizeBox.addItem("None");
    sizeBox.addItem("Small $7");
    sizeBox.addItem("Medium $9");
    sizeBox.addItem("Large $11");
    sizeBox.addItem("Extra large $14");
    toppingBox.addItem("None");
    toppingBox.addItem("Cheese $0");
    toppingBox.addItem("Sausage $1");
    toppingBox.addItem("Bacon $1");
    toppingBox.addItem("Pepperoni $2");
    toppingBox.addItem("Green pepper $3");
    toppingBox.addItem("Onion $4");
    pane.add(sizeList);
    pane.add(sizeBox);
    sizeBox.addItemListener(this);
    pane.add(toppingList);
	pane.add(toppingBox);
    toppingBox.addItemListener(this);
    pane.add(companyName);
	pane.add(totPrice);
    setContentPane(pane);

    }
    
public static void main(String[] arguments) {
    JPizza pizzaGUI = new JPizza();
  	pizzaGUI.setSize(220,200);
        pizzaGUI.setVisible(true);
    
    }

@Override
public void itemStateChanged(ItemEvent list) {
      
        Object source = list.getSource();
        if (source == sizeBox)
        {
        sizePizzaNum = sizeBox.getSelectedIndex();
        sPrice = sizePizzaPrice[sizePizzaNum];
        sumPrice = sPrice + tPrice;
        output = "Total Price $" + sumPrice;
        totPrice.setText(output);
        }
        
        else if (source == toppingBox)
        {
	toppingPizzaNum = toppingBox.getSelectedIndex();
	tPrice = toppingPizzaPrice[toppingPizzaNum];
	sumPrice = sPrice + tPrice;
	output = "Total Price $" + sumPrice;
	totPrice.setText(output);
        }
      
    }

}
 