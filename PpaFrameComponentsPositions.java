import javax.swing.*;

class PpaFrameComponentsPositions
{
    public static void main(String A[])
    {
        JFrame fobj = new JFrame ("Ppa");

        JButton bobj =new JButton("OK");
        bobj.setBounds(100 , 100, 150 , 50);

        fobj.add(bobj);

        fobj.setSize(500 , 400);
        fobj.setLayout(null);
        fobj.setVisible(true);

        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}