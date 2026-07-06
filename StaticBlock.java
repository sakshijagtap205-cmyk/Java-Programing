class Demo
{
    public int i;       //instance variable
    static public int j=21;     //class variable


    static
    {
        j=21;
    }
    public Demo()
    {
        this.i=11;
    }
    
    
    public void fun()  //Instance method
    {
        System.out.println("fun i:"+this.i);
        System.out.println("fun i:"+Demo.j);
        
    
    }
    public void gun()  //Instance method
    {
       // System.out.println("gun i:"+this.i);  //not allowed
        System.out.println("gun i:"+Demo.j);
        
    }
}
class staticmethod
{
    public static void main(String A[])
    {
        Demo.gun();
        System.out.println(Demo.j);
        Demo dobj =  new Demo();
        System.out.println(dobj.i);
        dobj.fun();


    }
}