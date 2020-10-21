import java.util.Scanner;

public class Service{

    private String service_info;
	private String service;
	private double service_price;

	private String[] mess_menu = new String[3];
	private Room r; //aggregation

public void create_service(String s,double p) {		//create service and its price
		service = s;
		service_price =p;
	}

	public void update_sevice() {
        Scanner in = new Scanner (System.in);
		System.out.println( "Enter the new service that you want to update" );
		service = in.nextLine();
	}

	public void remove_sevrice() {
		 service = null;
	}

	double getServicePrice() {
		System.out.println( "The service price is " + service_price );
		return service_price;
	}

	public String get_service() {
		return service;
	}

	public void show_service() {
		System.out.println( "the service in Room " + r.get_room() + " has " + service + " for " + service_price + "PKR");
	}

	public void SetRoom( Room r1){ //aggregation
         r = r1;
    }

	public void create_mess_menu() {
		String breakfast, lunch, dinner;
        Scanner in = new Scanner (System.in);
		System.out.println( "Enter breakfast " );
		breakfast = in.nextLine();


		System.out.println( "Enter lunch " );
		lunch = in.nextLine();

		System.out.println( "Enter dinner " );
		dinner = in.nextLine();

		mess_menu[0] = breakfast;
		mess_menu[1] = lunch;
		mess_menu[2] = dinner;
	}

	public void update_mess_menu() {
        Scanner in = new Scanner (System.in);
		String breakfast, lunch, dinner;
		System.out.println( "Enter new breakfast " );
		breakfast = in.nextLine();


		System.out.println( "Enter new lunch " );
		lunch = in.nextLine();

		System.out.println( "Enter new dinner " );
		dinner = in.nextLine();

		mess_menu[0] = breakfast;
		mess_menu[1] = lunch;
		mess_menu[2] = dinner;
}

	public void remove_mess_menu() {
		 mess_menu[3] = null;
	}

	public void show_mess_menu(){
		System.out.println( "The meals for the Day are " );
		for (int i = 0; i < mess_menu.length ; i++) {
            String element = mess_menu[i];
            System.out.println( element );
		}
	}
}
