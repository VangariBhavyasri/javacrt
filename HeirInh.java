class Sample{
int a,b;
void get(int a,int b)
{
this.a=a;
this.b=b;
}
void show()
{
System.out.println("a="+a+" b="+b);
}
}
class Addition extends Sample{
void total()
{
System.out.println("Addition="+(a+b));
}
}
class Product extends Sample{
void multiply()
{
System.out.println("Product="+(a*b));
}
}
class HeirInh{
public static void main(String args[])
{
Addition a1=new Addition();
a1.get(124,546);
a1.show();
a1.total();
Product p1=new Product();
p1.get(23,68);
p1.show();
p1.multiply();
}
}
