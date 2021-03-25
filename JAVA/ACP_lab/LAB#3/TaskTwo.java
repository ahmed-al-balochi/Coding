//Create an Animalclass
//which have three methods (eat, sleep, swim, walk).
//Extend a class Fish that overrides walk method.
//Extend class Dolphin from Fish that overrides the walk method. If a walk method is called form Dolphin class, generate an exception (as fishcan’t walk).

import java.util.*;
class Animal{
    boolean Eat,Sleep,Swim,Walk;
    void eat(){
        Eat = true;
    }
    void sleep(){
        Sleep = true;
    }
    void swim(){
        Swim = true;
    }
    boolean walk(){
        return Walk = true;
    }
    void Display(){
        System.out.println("Eat :"+Eat+" Sleep: "+Sleep+" Swim: "+Swim+" Walk: "+Walk);
    }
}

class Fish extends Animal{
    boolean Swim;
    boolean walk(){
        return Swim = true;
    }
}

class Dolphin extends Fish{
    boolean Dolphin;
    boolean walk(){
        return Dolphin = true;
    }
}

class MyException extends Exception{
    boolean bool1;
   MyException(boolean bool2) {
      bool1 = bool2;
   }
   public String toString(){
       String str;
       if(bool1 )
           str = "Fish Can't Walk!";
       else
           str = "Animal Can Walk!";
       return str;
   }
}

public class TaskTwo{
    public static void main(String []args){
      int i =1;
      boolean bool;
      Animal animal = new Animal();
      Dolphin dolphin = new Dolphin();
      System.out.println("Is the Animal walking? "+animal.walk());
      try{
          bool = dolphin.walk();
          throw new MyException(bool);
            }catch(MyException e){
                System.out.println(e);
            }
    }
}
