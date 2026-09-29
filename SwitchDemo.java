import java.util.Scanner;

class Switch_Demo
{
    public static void main(String A[])
    {
        Scanner Sobj =  new Scanner(System.in);
        int istd =0;

        System.out.println("Enter your Standard :");
        istd = Sobj.nextInt();

        switch(istd)
        {
            case 1:
                System.out.println("Exam at 9 am");
                break;

            case 2:
                System.out.println("Exam at 10 am");
                break;

            case 3:
                System.out.println("Exam at 11 am");
                break;

            case 4:
                System.out.println("Exam at 12 NOON");
                break;

            default:
                System.out.println("Invalid Standard");
        }
    }
}
