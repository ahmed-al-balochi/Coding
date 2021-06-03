/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahmed
 */

class MyThread1 extends Thread{
    public MyThread1(String s){
        super(s);
    }
    public void run(){
        for(int i= 0;i<3; i++){
            Thread cur = Thread.currentThread();
            cur.setPriority(Thread.MIN_PRIORITY);
            int p = cur.getPriority();
            System.out.println("Thread Name: "+Thread.currentThread().getName()); 
            System.out.println("Thread Priority: "+cur); 
        }
    }
}
class MyThread2 extends Thread{
    public MyThread2(String n){
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
public class NewClass {
    public static void main(String[]args){
        MyThread1 Athr = new MyThread1("A");
        Athr.start();
        MyThread2 Bthr = new MyThread2("B");
        Bthr.start();
    }
}
