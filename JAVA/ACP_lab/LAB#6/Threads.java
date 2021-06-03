 class Threads extends Thread{
    Threads(){
        Thread t = new Thread(this, "Demo Thread");
        System.out.println("Child Thread"+t);
        t.start();
    }
    public void run(){
        try{
            for(int i=5;i>0;i--){
                System.out.println("Child Thread"+i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Child Interrupted");
        }
            System.out.println("Exiting Child Thread");
    }
    public static void main(String[]args){
        new Threads();
    }
}
class MyThread extends Thread{
    public MyThread(String n){
        super(n);
    }
    public void run(){
        for(int i= 0;i<3; i++){
            Thread cur = Thread.currentThread();
            cur.setPriority(Thread.MAX_PRIORITY);
            int p = cur.getPriority();
            System.out.println("Thread Name: "+Thread.currentThread().getName()); 
            System.out.println("Thread Priority: "+cur); 
        }
    }
}