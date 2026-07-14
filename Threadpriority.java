class Threadpriority
{
    public static void main(String A[])
    {
        System.out.println("Inside main method");
        Thread tobj = Thread.CurrentThread();
        String name =tobj.getName();
         System.out.prinln("Name of Current Thread is :"+name);
         int Priority =tobj.getPriority();
        System.out.prinln("Priority of current thread is :"+Priority);
        tobj.setPriority(10);
        Priority =tobj.getPriority();
        System.out.prinln("Priority of current thread is :"+Priority);
    }
}