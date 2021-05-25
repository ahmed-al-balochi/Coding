class Share{
public synchronized void doword(String str){
for(int i=0;i<5;i++){
System.out.println("Started :"+str);
try{
Thread.sleep(100);
}catch(Exception e){}
}
}
}
class MyThread extends Thread{
Share s;
MyThread(Share s,String str)
{ super(str); this.s=s; start(); }
public void run()
{ s.doword(Thread.currentThread().getName()); }
}
public class Test{
public static void main(String args[]){
Share s = new Share();
MyThread m1=new MyThread(s,"Thread1");
MyThread m2=new MyThread(s,"Thread2");
MyThread m3=new MyThread(s,"Thread3");
}
}
