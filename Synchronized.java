class Display{
public synchronized void wish(String name)
{
for(int i=1;i<=5;i++)
{
System.out.print("good morning:");
try
{
Thread.sleep(1000);
}
catch(InterruptedException e)
{
}
System.out.println(name);
}
}
}
class MyThread extends Thread
{
Display d;
String name;
MyThread(Display d,String name)
{
this.d=d;
this.name=name;
}
public void run()
{
d.wish(name);
}
}
class Synchronized
{
public static void main(String args[])
{
Display d1=new Display();
MyThread t1=new MyThread(d1,"dhoni");
MyThread t2=new MyThread(d1,"yuvraj");
t1.start();
t2.start();
}
} 
