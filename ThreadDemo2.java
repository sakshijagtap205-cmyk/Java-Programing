class ThreadDemo2
{
    public static void main(String A[])
    {
        System.out.println("Inside main method");
        Thread tobj = Thread.CurrentThread();
        String name =tobj.getName();

        
        System.out.prinln("Name of Current Thread is :"+name);
    }
}