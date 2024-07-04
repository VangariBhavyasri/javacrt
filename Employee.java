import java.util.*;
class Employee
{
 int eno;
 String ename;
 double salary;
void get()
{
Scanner s=new Scanner(System.in);
eno=s.nextInt();
ename=s.next();
salary=s.nextDouble();
}
void show()
{
System.out.println(eno+" "+ename+" "+salary);
}
public static void main(String[] args)
{
Employee e1=new Employee();
e1.get();
Employee e2=new Employee();
e2.get();
e1.show();
e2.show();
}
}

