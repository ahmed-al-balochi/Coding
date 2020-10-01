import java.util.Scanner;

public class BookHostel {
    private String booking_room;
	private Double monthly_fees;
	private Student st1;	//compostion
	//private Room r1;	//compostion

   /* void book_room(room _r1) {
	r1 = _r1;
}*/

	public String showBookedHostel() {
		System.out.println( "The booked room is " + booking_room );
		return booking_room;
	}

	public void updateBookedHostel() {
        Scanner in = new Scanner (System.in);
		String r;
		System.out.println("Select your new room: ");
		r = in.nextLine();
		booking_room = r;
	}

	public void unBookHostel() {
		booking_room = null;
	}

	public void ManageFees(Double price) {
		monthly_fees = price;
		System.out.println("Monthly dues = " + monthly_fees );
	}

	public void SetStudent(String st)  //compostion
	{
        st1 = new Student();
        st1.UniNameSetter(st);
	}
}
