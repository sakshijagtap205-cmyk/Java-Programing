class ThreadDemo1
{
    public static void main(String A[])
    {
        System.out.println("Inside main method");

        String name = Thread.currentThread().getname();
        System.out.prinln("Name of Current Thread is :"+name);
    }
}