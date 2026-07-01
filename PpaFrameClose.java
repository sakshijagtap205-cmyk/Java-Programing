import javax.swing.*;

class PpaFrameClose
{
    public static void main(String A[])
    {
        JFrame fobj = new JFrame ("Ppa");

        fobj.setSize(300 , 300);
        fobj.setVisible(true);

        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}