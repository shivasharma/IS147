package Week8;

class Area
{
    void find(long l,long b)
    {
        System.out.println("Area is "+ (l*b)) ;
    }
    void find(int l, int b,int h)
    {
        System.out.println("Area is "+ (l*b*h));
    }
    public static void main (String[] args)
    {
        Area  ar = new Area();
        ar.find(8,5);     //automatic type conversion from find(int,int) to find(long,long) .
        ar.find(2,4,6)   ; //find(int l, int b,int h) is called.

           }
}