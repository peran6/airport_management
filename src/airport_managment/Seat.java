package airport_managment;

abstract class Seat {
	
	 private int Seat_id;
	 private int Seat_row;
	 private int Seat_column;
	 //private Ticket ticket;
	 
	 public Seat(int Seat_id, int Seat_row, int Seat_column /* ,Ticket ticket*/) {
			this.Seat_id = Seat_id;
			this.Seat_row = Seat_row;
			this.Seat_column = Seat_column;
			//this.Ap_columns = Ap_columns;
		}
	 
//set,get Seat_id
	public int getSeat_id() {
		return Seat_id;
	}
	public void setSeat_id(int Seat_id) {
		this.Seat_id = Seat_id;
	}
		
//set,get Seat_row
	public int getSeat_row() {
		return Seat_row;
	}
	public void setSeat_row(int Seat_row) {
		this.Seat_row = Seat_row;
	}
		
//set,get Seat_column
	public int getSeat_column() {
		return Seat_column;
	}
	public void setSeat_column(int Seat_column) {
		this.Seat_column = Seat_column;
	}


}
