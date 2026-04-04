class Demo
{
    public int i;       //instance variable
    static public int j=21;     //class variable
   
    static
    {
        System.out.println("inside Static Block");
        j=21;
    }
    
    public Demo()
    {
        System.out.println("Inside initializer block")
    
    }
    public Demo(int a)
    {
        System.out.println("inside parametrised constructor");
        this.i =a;
         
    }


}
class BlocksX
{
    public static void main(String A[])
    {
        System.out.println("inside main");
        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();
        Demo dobj3 = new Demo();


    }
}