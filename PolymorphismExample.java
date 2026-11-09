public class PolymorphismExample {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        PolymorphismExample obj = new PolymorphismExample();

        System.out.println("Sum of 2 numbers: " + obj.add(10, 20));
        System.out.println("Sum of 3 numbers: " + obj.add(10, 20, 30));
        System.out.println("Sum of decimal numbers: " + obj.add(5.5, 4.5));
    }
}