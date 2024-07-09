class MethodOverloading
{
void show(int a,int b)
{
System.out.println("2 arg int method");
}
void show(int a,int b,int c)
{
System.out.println("3 arg int method");
}
void show(double a,double b)
{
System.out.println("2 arg double method");
}
public static void main(String args[])
{
MethodOverloading m1=new MethodOverloading();
m1.show(49.77,67.22);
m1.show(11,22);
m1.show(11,22,77);
m1.show(11.67,22.88);
m1.show('A','B','C');   //automatic promotion of lower dt to higher or next level datatyp
}
}



