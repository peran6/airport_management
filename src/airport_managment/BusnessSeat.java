package airport_managment;

public class BusnessSeat extends Seat{
	
	private Menu menu;
	
	public BusnessSeat(int Seat_id, int Seat_row, int Seat_column, Menu menu) {
		super(Seat_id, Seat_row, Seat_column);
		this.menu = menu;
	}
	
//set,get menu
	public Menu getmenu() {
		return menu;
	}
	public void setmenu(Menu menu) {
		this.menu = menu;
	}
}
