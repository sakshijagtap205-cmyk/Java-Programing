class Demo
{
    public int ino1;
    public int ino2;

    public Demo()
    {
        System.out.println("Inside Default Constructor");
    }

    public Demo(int i, int j)
    {
        System.out.println("Inside Parameterized Constructor");
    }

    protected void finalize()
    {
        System.out.println("Inside Finalize Method");
    }
}

class Constructor_Destructor
{
    public static void main(String arg[])
    {
        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo(11, 21);

        dobj1 = null;
        dobj2 = null;

        System.gc();

        System.out.println("End of Main");
    }
}
