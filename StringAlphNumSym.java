import java.util.*;
class StringAlphNumSym{
public static void main(String []args){
Scanner s=new Scanner(System.in);
char ch=s.next().charAt(0);
if(Character.isLetterOrDigit(ch))
{
System.out.println("Alphanumeric");
if(Character.isLetter(ch))
{
System.out.println("Alphabet");
if(Character.isLowerCase(ch))
{
System.out.println("lower case");
}
else
{
System.out.println("upper case");
}
}
else
{
System.out.println("digit");
}
}
}
}
