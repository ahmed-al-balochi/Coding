class Queue{
int n; boolean valueSet = false; String str;
public synchronized int get(){
if(valueSet==false)
try{
wait(); }catch(InterruptedException e){}
System.out.println("Thread "+str+" Get: " + n+"\n");
valueSet = false;
notify();
return n;
}
public synchronized void put(int n, String s){
str = s;
if(valueSet)
try{
wait(); }catch(InterruptedException e){}
this.n = n;
valueSet = true;
System.out.println("Thread "+str+" Put: " + n);
notify();
} }

class myThreads implements Runnable{
    Queue q;
    String str;
    public myThreads(Queue q,String s){
      this.q = q;
      str = s;
      new Thread(this,str).start();
      for(int i=1;i<6;i++){
      q.put(i,str);
      q.get();
      }
        //System.out.println("End of Thread "+str+" :");
    }
    public void run(){}
}

public class Task2 {
  public static void main(String args[]){
      Queue q = new Queue();
      myThreads th1 = new myThreads(q,"1st");
      myThreads th2 = new myThreads(q,"2nd");
      myThreads th3 = new myThreads(q,"3rd");
  }
}
