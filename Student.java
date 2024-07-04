import java.util.*;
class Student
{
    int admno;
    String name;
    
    void get()
    {
        Scanner s=new Scanner(System.in);
     System.out.println("Enter admno and name ");   
    admno=s.nextInt();
    name=s.next();
        
    }
    void show()
    {
         System.out.println(admno+" "+name); 
    }
    public static void main(String[] args)
    {
        Student s1=new Student();
        s1.get();
     
        Student s2=new Student();
        s2.get();
         s1.show();
        s2.show();
        
    }
}