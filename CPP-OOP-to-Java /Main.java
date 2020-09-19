//package ...programming.Coding.CPP-OOP-to-Java ;

public class Main{

    public static void main(String[] args) {
        Student a1=new Student();
        Student a2=new Student();
        a1.RegisterAccount();
        a1.Login();
        a1.UpdateLoginInfo();
        a1.Address("4","10","Bani Gala","Islamabad");
        a1.GetAddress();
        a2 = a1;
        a1.RemoveLocation();
        //System.out.println("Addess Removed");
        a1.GetAddress();
        System.out.println("Name: "+ a1.NameGetter() +" Password: " + a1.PassGetter()+ " Email: " + a1.EmailGetter());
        a1.RemoveAccount(a1);
        System.out.println("Name: "+ a1.NameGetter() +" Password: " + a1.PassGetter()+ " Email: " + a1.EmailGetter());
    }
}
