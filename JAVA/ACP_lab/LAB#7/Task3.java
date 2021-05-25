import java.lang.Math;

class Queue{
    Queue q;
  int sum=0;
  int rand, min =0,inc=0 ,max=100;
int n; boolean valueSet = false; String str;
public synchronized int get(){
if(valueSet==false)
try{
wait(); }catch(InterruptedException e){}
//System.out.println("Thread "+str+" Get: " + n+"\n");
if(inc==4){
  System.out.println("\nSum " + sum);
  int avg=sum/5;
  System.out.println("AVG = " + avg);
}
  inc++;
valueSet = false;
notify();
return n;
}
public synchronized void put(int n, String s){
str = s;
if(valueSet)
try{
wait(); }catch(InterruptedException e){}
      rand = (int)(Math.random()*(max-min+1)+min);
      System.out.println("rand = " + rand);
      sum += rand;
this.n = n;
valueSet = true;
//System.out.println("Thread "+str+" Put: " + n);
notify();
} }


class myThreads implements Runnable{
    Queue q;
    String str;
    public myThreads(Queue q,String s){
      this.q = q;
      str = s;
      new Thread(this,str).start();
      q.put(1,str);
      q.get();
    }
    public void run(){}
}


class Test extends Thread
{
}

public class Task3 {
  public static void main(String args[]){
      Queue q = new Queue();
    myThreads  test[] = new myThreads[5];
     for(int i = 0; i < test.length; i++)
     {
       test[i] = new myThreads(q,"Thread");
     }
  }
}
