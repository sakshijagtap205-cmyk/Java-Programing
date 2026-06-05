import java.util.*;

class Exception10

{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[]={10,20,30,40,50};
        int iIndex = 0,  iData = 0;

        System.out.println("Enter the index  number:");
        iIndex = sobj.nextInt();


        try
        {
            System.out.println("Inside try");
           iData = Arr[iIndex];        //Exception crone code
        }

        catch(Exception eobj)
        {
                System.out.println("Imside catch");
                System.out.println(eobj);
        }

        finally
        {
            System.out.println("Inside Finally");
        }
        
        System.out.println("Element at that index is:" +(iData));
    }
}