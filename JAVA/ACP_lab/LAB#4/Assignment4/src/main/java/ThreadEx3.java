/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahmed
 */


class PrintNum implements Runnable {
private int lastNum;
// Construct a task for printing 1, 2, ... n
public PrintNum(int n) {
lastNum = n;
}
// Tell the thread how to run
public void run() {
Thread t4 = new Thread(new PrintNum(50));
t4.start();
try{
for (int i = 1; i <= lastNum; i++) {
System.out.print(" " + i);
if(i==5)
t4.join(); }
}catch(InterruptedException ex){}
}
}

public class ThreadEx3 {
    public static void main(String []args){
        PrintNum printA = new PrintNum(100);
        
                
        Thread thread1 = new Thread(printA);
        
        thread1.start();
    }
}
