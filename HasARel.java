class Student
{
int admno=111;
String name="aaa";
void display()
{
System.out.println("------------");
System.out.println("Student Report");
System.out.println("------------");
}
}
class Marks{
int mat=87,phy=56,che=74;
void show()
{
Student s1=new Student();
s1.display();
System.out.println("Admno="+s1.admno);
System.out.println("Name="+s1.name);
System.out.println("Maths="+mat);
System.out.println("Physics="+phy);
System.out.println("Chemistry="+che);
}
}
class HasARel
{
public static void main(String args[])
{
Marks m1=new Marks();
m1.show();
}
}
