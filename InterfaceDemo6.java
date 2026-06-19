interface A
{
    int no=11;
    void fun();
}

interface B
{
    int no= 21;
    void gun();
}

class Demo implements  A , B  //multiple inheritance
{
    public void fun();
    {
        System.out.println("inside Fun"no); //no generates Error
    }
    
}
class interfaceDemo6
{
    public static void main(String A[])
    {
        Demo dobj =new Demo();
        dobj.fun();

    }
}