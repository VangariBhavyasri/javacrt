class Sample{
int a=56;
static int b=30;
Sample()
{
System.out.println(a);
System.out.println(b);
}
void show()
{
System.out.println(a);
System.out.println(b);
}
static void display()
{
Sample t=new Sample();
System.out.println(t.a);
System.out.println(b);
}
}
class StatMethod
{
public static void  main(String[] args)
{
Sample.display();
Sample s1=new Sample();
s1.show();
s1.display();
}
}



