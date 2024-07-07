class Sample
{
void m1()
{
System.out.println("Instance method");
}
}
class InstMethod
{
public static void main(String[] args)
{
Sample s1=new Sample();
s1.m1();
}
}