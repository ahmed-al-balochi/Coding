class Th extends Thread{
    int Pr;
    Th(int p){
       Pr = p;
    }
  public void run() {
      if(Pr == 0){
      for(int i=1; i<=20; i++)
          System.out.println("Count is: "+i);
      }
      else{
          try{
      Thread.sleep(100);
      System.out.println("\n\tThread 2:\n");
      for(int i=20; i>=1; i--)
          System.out.println("Count is: "+i);
      }catch(InterruptedException ex){ System.out.println(ex+" Caught");}
    }
  }
}

public class Task1 {
  public static void main(String[] args) {
    Th thread1 = new Th(0);
    thread1.setPriority(Thread.MIN_PRIORITY);

    Th thread2 = new Th(1);
    thread2.setPriority(Thread.MAX_PRIORITY);

    thread1.start();
    thread2.start();
  }
}
