class InstVar
{
    int a;
    double b;
    public static void main(String[] args)
    {
        InstVar s1=new InstVar();
        s1.a=100;
        s1.b=45.76;
        System.out.println(s1.a+" "+s1.b);
        InstVar s2=new InstVar();
        s2.a=222;
        s2.b=98.33;
        System.out.println(s2.a+" "+s2.b);
    }
}