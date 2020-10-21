import java.util.Scanner;

public class Service{

    private String service_info;
	private String service;
	private double service_price;

	private String[] mess_menu = new String[3];
	private Room r; //aggregation

	public Service( Room rObj){
         r = rObj;
    }

	public void CreateService(String s,double p) {		//create service and its price
		service = s;
		service_price =p;
	}

	public void UpdateService() {
        Scanner in = new Scanner (System.in);
		System.out.println( "Enter the new service that you want to update" );
		service = in.nextLine();
	}

	public void RemoveService() {
		 service = null;
	}

	double GetServicePrice() {
		System.out.println( "The service price is " + service_price );
		return service_price;
	}

	public String GetService() {
		return service;
	}

	public void CreateMessMenu() {
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

	public void UpdateMessMenu() {
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

	public void RemoveMessMenu() {
		 mess_menu[3] = null;
	}

	public void DisplayMessMenu(){
		System.out.println( "The meals for the Day are " );
		for (int i = 0; i < mess_menu.length ; i++) {
            String element = mess_menu[i];
            System.out.println( element );
		}
	}
}
