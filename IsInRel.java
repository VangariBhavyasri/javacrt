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
class Marks extends Student
{
int mat=87,phy=56,che=74;
void show()
{
System.out.println("Admno="+admno);
System.out.println("Name="+name);
System.out.println("Maths="+mat);
System.out.println("Physics="+phy);
System.out.println("Chemistry="+che);
}
}
class IsInRel
{
public static void main(String args[])
{
Student s1=new Student();
s1.display();
Marks m1=new Marks();
m1.show();
}
}
















