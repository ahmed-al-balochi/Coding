import java.util.Scanner;

public class BookHostel {
    private String booking_room;
	private Double monthly_fees;
	private Student st;	//compostion
	private Room r;	//compostion

    public BookHostel(Room rObj, Student stObj){
	   r = rObj;
       st = stObj;
}

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

}
