import java.util.*;
class VarArg
{
void show(int ...a)
{
System.out.println("Var-arg method "+Arrays.toString(a));
}
public static void main(String args[])
{
VarArg v1=new VarArg();
v1.show(11,34);
v1.show(11,74,88,34);
v1.show(11,56,90,87,62,12,34);
v1.show(11,66,34);
v1.show();
}
}