import java.util.*;
class NoOfAlphNumSym{
public static void main(String []args){
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
int alp=0,lc=0,uc=0,dig=0,sym=0;
char ch[]=s1.toCharArray();
for(int i=0;i<s1.length();i++)
{
if(Character.isLetter(ch[i]))
{
alp++;
if(Character.isLowerCase(ch[i]))
{
lc++;
}
else
{
uc++;
}
}
else if(Character.isDigit(ch[i]))
{
dig++;
}
else
{
sym++;
}
}
System.out.println(alp);
System.out.println(lc);
System.out.println(uc);
System.out.println(dig);
System.out.println(sym);



}
}
