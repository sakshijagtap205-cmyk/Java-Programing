import java.util.Scanner;

public class Test_MenuDriven_Array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many elements?");
        int size = sc.nextInt();

        int[] Arr = new int[size];

        System.out.println("Array created : Size = " + Arr.length);

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < Arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            Arr[i] = sc.nextInt();
        }

        int ch;

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Display Elements");
            System.out.println("2. Display Odd Elements");
            System.out.println("3. Display Even Elements");
            System.out.println("4. Sum of Elements");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");

            ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.println("Array Elements:");
                    for (int i = 0; i < Arr.length; i++) {
                        System.out.print(Arr[i] + " ");
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Odd Elements:");
                    for (int i = 0; i < Arr.length; i++) {
                        if (Arr[i] % 2 != 0) {
                            System.out.print(Arr[i] + " ");
                        }
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Even Elements:");
                    for (int i = 0; i < Arr.length; i++) {
                        if (Arr[i] % 2 == 0) {
                            System.out.print(Arr[i] + " ");
                        }
                    }
                    System.out.println();
                    break;

                case 4:
                    int sum = 0;
                    for (int i = 0; i < Arr.length; i++) {
                        sum += Arr[i];
                    }
                    System.out.println("Sum = " + sum);
                    break;

                case 5:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (ch != 5);

        System.out.println("Thank you for using the program.");
        sc.close();
    }
}
