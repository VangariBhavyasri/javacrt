class Parent{
int a=100,b=200;
}
class Child extends Parent{
int a=44,b=88;
void show(int a,int b)
{
System.out.println(a+b);
System.out.println(this.a+this.b);
System.out.println(super.a+super.b);
}
}
class SuperKey
{
public static void main(String args[])
{
Child c1=new Child();
c1.show(10,20);
}
}
