import java.util.*;
class VowCons
{
public static void main(String []args)
{
Scanner s=new Scanner(System.in);
char a;
a=s.next().charAt(0);
if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
{
System.out.println("Vowel");
}
else
{
System.out.println("Consonant");
}
}
}

