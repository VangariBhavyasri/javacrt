import java.util.*;
class StringSplit{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
String str="Java is simple language";
String res[]=str.split("is");
System.out.println(Arrays.toString(res));
}
}

