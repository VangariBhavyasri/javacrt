class Father{
void surName()
{
System.out.print("V ");
}
void designation()
{
System.out.println("Businessman ");
}
}
class Child extends Father
{
void getName()
{
System.out.println("Bhavyasri");
}
void designation()
{
System.out.println("Student");
}
}
class MethodOverriding{
public static void main(String args[])
{
Child c1=new Child();
c1.surName();
c1.getName();
c1.designation();
}
}
