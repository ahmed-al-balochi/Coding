//package ...programming.Coding.CPP-OOP-to-Java ;

public class Main{

    public static void main(String[] args) {
        Student a1=new Student();
        //Student a2=new Student();
        HostelManager hm1 = new HostelManager ();
        Hostel h1 = new Hostel (hm1);
        Room R = new Room (h1, hm1);
        BookHostel bh1 = new BookHostel(R, a1);
        System.out.println("Manager ID: "+hm1.ManagerIDGetter());
        hm1.RegisterAccount();
        hm1.Login();
        hm1.UpdateLoginInfo();
        a1.RegisterAccount();
        a1.Login();
        a1.UpdateLoginInfo();
        a1.Address("4","10","Bani Gala","Islamabad");
        a1.GetAddress();
        //a2 = a1;
        //a1.RemoveLocation();
        //System.out.println("Addess Removed");
        //a1.GetAddress();
        //System.out.println("Name: "+ a1.NameGetter() +" Password: " + a1.PassGetter()+ " Email: " + a1.EmailGetter());
        //a1.RemoveAccount(a1);
        //System.out.println("Name: "+ a1.NameGetter() +" Password: " + a1.PassGetter()+ " Email: " + a1.EmailGetter());
        R.SetRoom(1);
        R.SetRoomFloor(1);
        R.CreateRoomInfo();
        R.DisplayRoomInfo();
        Service S = new Service(R);
        S.CreateService("WIFI", 500.50);
        S.GetService();
        S.CreateMessMenu();
        S.DisplayMessMenu();
        Complain C = new Complain(R, S, hm1, a1);
        C.WriteComplain();
        C.CreateComplainReply();
        C.GetComplain();
        C.GetComplainReply();
        bh1.updateBookedHostel();
        Double price = 50.0;
        bh1.ManageFees(price);
        bh1.showBookedHostel();
        h1.HostelRegister();
        h1.HostelAddress("4","10","Bani Gala","Islamabad");
        h1.SearchHostel();
    }
}
