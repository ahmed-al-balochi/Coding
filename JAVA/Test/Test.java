import java.util.Scanner;

public class Test {
     public String name;
     public int age;

    public Test(String n, int a){
     name = n;
     age =a;
      }
    public void display(){
     System.out.print("NAME: "+name);
     System.out.println(" | AGE: "+age);
    }
    public void usertaken (){
     System.out.print("Enter Name: ");
     Scanner sn = new Scanner(System.in);
     String n = sn.nextLine();
     name = n;

     System.out.print("Enter Age: ");
     Scanner ia = new Scanner(System.in);
     int a = ia.nextInt();
     age = a;
     }
      public static void main(String[] args) {

      Test a1 = new Test("Ahmed",12);
      a1.display();
      a1.usertaken();
      a1.display();
      }
}
