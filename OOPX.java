class Arithematic
{
    public int ino1;
    public int ino2;

    public Arithematic()
    {
        this.ino1 = 0;
        this.ino2 =0;
    }
    public Arithematic(int i, int j)
    {
        this.ino1 = i;
        this.ino2 = j;
    }

    public int addition()
    {
        int iAns =0;
        iAns = this.ino1 + this.ino2;
        return iAns;
    }

    public int subtraction()
    {
        int iAns =0;
        iAns = this.ino1 - this.ino2;
        return iAns;
    }
}

class OOPX
{
    public static void main(String arg[])
    {
        Arithematic aobj1 = new Arithematic();
        Arithematic aobj2 = new Arithematic(11, 10);

        int iRet = 0;

        iRet = aobj1.addition();
        System.out.println("Addition is : "+iRet);

        iRet = aobj2.addition();
        System.out.println("Addition is : "+iRet);

        iRet = aobj2.subtraction();
        System.out.println("Subtraction is : "+iRet);

         iRet = aobj1.subtraction();
        System.out.println("Subtraction is : "+iRet);


        aobj1=null;
        aobj2=null;
    }
}
