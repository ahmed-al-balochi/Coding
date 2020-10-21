import java.util.Scanner;

public class Hostel {
    private String HostelName;
	private String HostelPhoneNum;
	private String Detail;
	private Double HostelPrice;

	private HostelManager hm; //compostion
	private Address d2; //compostion

	public Hostel(HostelManager hmObj ){
	HostelName = "";
	HostelPhoneNum = "";
	Detail = "";
	HostelPrice = 0.0;
    hm = hmObj;
    }

	public void SetHostel(String N, String Num, Double P){
	HostelName = N;
	HostelPhoneNum = Num;
	HostelPrice = P;
	}
	public void HostelRegister() { // Hostel manager adds name.phone num, price
	String n, p;
	double e;
	System.out.println( "Hello please enter the Name of the Hostel" );
	Scanner in = new Scanner (System.in);
	n = in.nextLine();
	HostelName = n;

	System.out.println( "Hello please enter your Hostel phone number" );
	p = in.nextLine();
	HostelPhoneNum = p;

	System.out.println( "Hello please enter your Price" );
	e = in.nextDouble();
	HostelPrice = e;
}

    public void HostelAddress(String h, String s, String Co, String c){
        d2 = new Address();
        d2.SetLocation( h, s, Co, c);
    }

	public void SearchHostel(){  // by price
		System.out.println( "Enter your starting range" );
		double min;
		Scanner in = new Scanner(System.in);
		min = in.nextDouble();

		System.out.println( "Enter your Ending range" );
		double max;
		max = in.nextDouble();


		for (int i=0; HostelPrice > min && HostelPrice < max;i++) {
			System.out.println("Found You a Hostel Named: " +HostelName + " For: " +HostelPrice +"PKR");
			break;
		}

	}


	public void ShowHostelInfo() { // name.phone num, price,address
		System.out.println( "Hostel name " + HostelName );
		System.out.println( "Hostel phone " + HostelPhoneNum );
		System.out.println( "Hostel price " + HostelPrice );
	}

	public double getPrice() { // name.phone num, price,address
		return HostelPrice;
	}

	public void RemoveHostel() {
		HostelName = null;
		HostelPhoneNum = null;
		HostelPrice = null;
	}

}
