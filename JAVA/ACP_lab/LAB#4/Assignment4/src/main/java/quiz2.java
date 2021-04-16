/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahmed
 */
class Company{
        String name, address;   
}
class Publication{
        String title;
        double price;
        void show(){}
}
class CD extends Publication{
    int PlayTime;
    void oversize(int in){
    if(PlayTime>in){
        System.out.println("Your Play Time is ok");
    }
    if(PlayTime>in){
        System.out.println("Your Play Time is ok");
    }
}
class Book extends Publication{
    int pages;
    void oversize(){}
}
public class quiz2 {
    public static void main(String[]args){
    
    }
}
