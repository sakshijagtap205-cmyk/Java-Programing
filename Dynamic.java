import java.util.Scanner;

class Dynamic
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int length = 0;
        int Arr[] = null;

        System.out.println("Enter the no of elements:");

        length = sobj.nextInt();

        Arr = new int[length];

        if (Arr == null)
        {
            System.out.println("Unable to allocate the memory");
            return;
        }
        else
        {
            System.out.println("Memory allocation is successful");
        }

        Arr = null;
        System.gc();
    }
}
