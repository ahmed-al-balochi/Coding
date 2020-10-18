import java.util.Scanner;

public class Room {
    private int room_num;
	private String room_info;
	private int room_floor_num;
	private Hostel h; //compostion
	private HostelManager hm; //compostion

    public void add_room(int r) { //takes input from user
		room_num = r;
	}

    public void SetHostelManager(int hm1){
        hm = new HostelManager();
        hm.ManagerIDSetter(hm1);
    }

    public void SetRoomHostel(String N, String Num, Double P){
        h = new Hostel();
        h.SetHostel(N,Num,P);
    }

	public void update_room(int r) {
		room_num = r;
	}

	public void create_room_info() {
		String rom_info;
		System.out.println( "Enter Room info " );
        Scanner in = new Scanner(System.in);
		rom_info = in.nextLine();
		room_info = rom_info;
	}

	public int show_room() {
		System.out.println( "Room number is " + room_num );
		return room_num;
	}

	public void add_room_floor(int rn) { //takes input from user
		room_floor_num = rn;
	}

	public void update_room_floor(int rom_flor) {	//takes input from user
		room_floor_num = rom_flor;
	}

	public void show_room_Info(){
		System.out.println( "Room floor is " + room_floor_num );
		System.out.println( "Room Info " + room_info );
	}
}
