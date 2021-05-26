import java.util.Scanner;
class queue{
    queue q;
    int n=0;
    boolean valueSet = false;
    String str=" ";
    public synchronized int get(){
        Scanner in = new Scanner(System.in);
        if(valueSet==false)
            try{
                wait();
            }catch(InterruptedException e){}
        System.out.println("\t\t\t\tWrite Your Message Reply: ");
        str = in.nextLine();
        valueSet = false;
        notify();
        return n;
    }
    public synchronized int put(int n, String s){
        Scanner in = new Scanner(System.in);
        str = s;
        if(valueSet)
            try{
                wait();
            }catch(InterruptedException e){}
        this.n = n;
        valueSet = true;
        System.out.println("\t\tWrite Your Message: ");
        str = in.nextLine();
        valueSet = true;
        notify();
        return n;
    }
}
class myThreads implements Runnable{
    queue q;
    String str;
    public myThreads(queue q, String s){
        this.q = q;
        str = s;
        new Thread(this,str).start();
        while(true){
        q.put(1,str);
        q.get();
        }
    }
    public void run(){}
}

public class Task5{
    public static void main(String[]args){
        queue q = new queue();
        System.out.println("To End The Program Press CTRL+C\n");
        myThreads T1 = new myThreads(q,"Thread");
    }
}
