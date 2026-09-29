class Demo
{
    public int a = 10;
    private int b = 20;
    protected int c = 30;
    int d = 40;

    public void display()
    {
        System.out.println("Public    : " + a);
        System.out.println("Private   : " + b);
        System.out.println("Protected : " + c);
        System.out.println("Default   : " + d);
    }
}

class AccessSpecifier
{
    public static void main(String A[])
    {
        Demo obj = new Demo();

        System.out.println("Public    : " + obj.a);
        System.out.println("Protected : " + obj.c);
        System.out.println("Default   : " + obj.d);

        obj.display();
    }
}
