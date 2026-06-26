import java.sql.*;

class MarvellousJdbc
{
    public static void main(String A[])
    {
        try
        {
            //step 1: load the database driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //step 2: connect the driver with database 
            Connection cobj =DriverManager.getConnection("jdbc:mysql://localhost:3306/PPA53","root","");

            //step 3: create statement class object
            Statement sobj = cobj.createStatement();

            //step 4: Execute the query 
            ResultSet robj = sobj.executeQuery("select *from student");

            //step 5: Display the result
            while(robj.next())
            {
                System.out.println("Roll no:"+robj.getInt("Rno"));
                System.out.println("Name :"+robj.getString("Name"));
                System.out.println("City:"+robj.getString("City"));
                System.out.println("Marks:"+robj.getInt("Marks"));
                
            }
            robj.close();
            sobj.close();
            cobj.close();
        }
        catch (Exception eobj)
        {
            System.out.println("Exception occured :"+eobj);
        }
    }
}