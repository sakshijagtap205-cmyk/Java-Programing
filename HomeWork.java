import javax.swing.*;
import java.awt.event.*;

class MarvellousLogin implements ActionListener
{
    // Characteristics
    JFrame fobj;
    JButton bobj_add, bobj_sub, bobj_mul, bobj_div;

    JTextField tobj1;
    JTextField tobj2;
    JLabel Userlable1, Userlable2, Resultlable;

    public MarvellousLogin(String title, int width, int height)
    {
        fobj = new JFrame(title);
        
        Userlable1 = new JLabel("NUMBER 1:");
        Userlable1.setBounds(50, 50, 100, 30);
        
        tobj1 = new JTextField();
        tobj1.setBounds(150, 50, 150, 30);
        
        Userlable2 = new JLabel("NUMBER 2:");
        Userlable2.setBounds(50, 100, 100, 30);
        
        tobj2 = new JTextField();
        tobj2.setBounds(150, 100, 150, 30);
        
        bobj_add = new JButton("+");
        bobj_add.setBounds(50, 150, 50, 30);
        
        bobj_sub = new JButton("-");
        bobj_sub.setBounds(100, 150, 50, 30);
        
        bobj_mul = new JButton("*");
        bobj_mul.setBounds(200, 150, 50, 30);
    
        bobj_div = new JButton("/");
        bobj_div.setBounds(250, 150, 50, 30);
        
        Resultlable = new JLabel("Result: ");
        Resultlable.setBounds(150, 200, 300, 30); 
        fobj.add(Resultlable);

        fobj.add(Userlable1);
        fobj.add(tobj1);
        fobj.add(Userlable2);
        fobj.add(tobj2);
        fobj.add(bobj_add);
        fobj.add(bobj_sub);
        fobj.add(bobj_mul);
        fobj.add(bobj_div);

        bobj_add.addActionListener(this);
        bobj_sub.addActionListener(this);
        bobj_mul.addActionListener(this);
        bobj_div.addActionListener(this);

        fobj.setLayout(null);
        fobj.setSize(width, height);
        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent aobj) 
    {
        
        String sNum1 = tobj1.getText();
        String sNum2 = tobj2.getText();

        
        if (sNum1.isEmpty() || sNum2.isEmpty()) {
            Resultlable.setText("Result: Please enter both numbers.");
            return;
        }

        double num1, num2, result = 0;
        try 
        {
            num1 = Double.parseDouble(sNum1);
            num2 = Double.parseDouble(sNum2);

            JButton source = (JButton)aobj.getSource();
            String operation = source.getText(); 

            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        Resultlable.setText("Result: Cannot divide by zero!");
                        return; 
                    }
                    break;
                default:
                    Resultlable.setText("Result: Unknown Operation");
                    return;
            }

            Resultlable.setText("Result: " + String.valueOf(result));

        } catch (NumberFormatException e) 
        {
            
            Resultlable.setText("Result: Invalid input (Enter numbers only).");
        }
    }
}

class Calculator1 {
    public static void main(String[] args) 
    {
    
        MarvellousLogin mobj = new MarvellousLogin("Calculator", 400, 300); 
    }
}