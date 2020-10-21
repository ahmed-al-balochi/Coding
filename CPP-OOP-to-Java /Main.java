//package ...programming.Coding.CPP-OOP-to-Java ;

public class Main{

    public static void main(String[] args) {
        Student a1=new Student();
        a1.NameSetter("Ahmed");
        Student a2=new Student();
        HostelManager hm1 = new HostelManager ();
        hm1.NameSetter("Ed");
        Hostel h1 = new Hostel ();
        BookHostel bh1 = new BookHostel ();
        Room R = new Room ();
        R.add_room(1);
        R.add_room_floor(1);
        R.SetHostelManager(1);
        R.SetRoomHostel("pal", "1",290.0);
        R.create_room_info();
        R.show_room_Info();
        Service S = new Service();
        S.SetRoom(R);
        S.create_service("WIFI", 500.50);
        S.show_service();
        S.create_mess_menu();
        S.show_mess_menu();
        Complain C = new Complain(R, S, hm1, a1);
        C.write_complain();
        C.show_complain();
        C.create_complaint_reply();
        C.show_complain_reply();
        /*bh1.updateBookedHostel();
        Double price = 50.0;
        bh1.ManageFees(price);
        String st = "Ssm";
        bh1.SetStudent(st);
        bh1.showBookedHostel();
        h1.SetHostelManager(1);
        h1.HostelRegister();
        h1.HostelAddress("4","10","Bani Gala","Islamabad");
        h1.search_Hostel();
        System.out.println("Manager ID: "+hm1.ManagerIDGetter());
        hm1.RegisterAccount();
        hm1.Login();
        hm1.UpdateLoginInfo(); */
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
