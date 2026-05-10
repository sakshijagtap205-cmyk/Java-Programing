import javax.swing.*;
import java.awt.event.*;
class EventHandling
{
    public static void main(String A[])
    {
        JFrame fobj = new JFrame ("Ppa");
        JButton bobj =new JButton("OK");
        bobj.setBounds(100 , 100, 150,50);
        bobj.addActionListner(new addActionListner(){
            public void ActionPerformed(ActionEvent aobj)
            {
                system.out.println("Button Clicked...");
            }
        });


         fobj.add(bobj);
        {

        fobj.setSize(500 , 400);
        fobj.setLayout(null);
        fobj.setVisible(true);

        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }   
} 