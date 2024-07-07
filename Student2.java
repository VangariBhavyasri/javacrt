class Student
{
int admno,mat,phy,che;
String name;
void get(int admno,String name,int mat,int phy,int che)
{
this.admno=admno;
this.name=name;
this.mat=mat;
this.phy=phy;
this.che=che;
}
void show()
{
System.out.println(admno+" "+name+" "+mat+" "+phy+" "+che);
}
}
class Student2
{
public static void main(String args[])
{
Student s1=new Student();
s1.get(111,"aaa",90,89,78);
s1.show();
Student s2=new Student();
s2.get(112,"bbb",98,79,78);
s2.show();
}
}