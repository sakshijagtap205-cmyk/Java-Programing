class Demo
{}

class Object1
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();
        System.out.println(dobj.hashCode());
        System.out.println(dobj.getClass());
    }
}