package airport_managment;

import java.time.LocalTime;
import java.time.LocalDate;

public class Flight /*extends Airplane*/ {

	private int flight_id;
	private LocalDate date;
	private LocalTime time;
	private String departure_airport;
	private String arrival_airport;
	private int airplane;
	private Seat seat[][];
	private int menu;
	private int number_seats;
	private int free_seats;

	/*public Flight(int flight_id, LocalDate date, LocalTime time, String departure_airport, String arrival_airport, int airplane) {
		this.flight_id = flight_id;
		this.date = date;
		this.time = time;
		this.departure_airport = departure_airport;
		this.arrival_airport = arrival_airport;
		this.airplane = airplane;
	}*/
	
//set,get flight_id
	public int getflight_id() {
		return flight_id;
	}
	public void setflight_id(int flight_id) {
		this.flight_id = flight_id;
	}

//set,get date
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
//set,get time	
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	
//set,get departure_airport	
	public String getDeparture_airport() {
		return departure_airport;
	}
	public void setDeparture_airport(String departure_airport) {
		this.departure_airport = departure_airport;
	}

//set,get arrival_airport
	public String getArrival_airport() {
		return arrival_airport;
	}
	public void setArrival_airport(String arrival_airport) {
		this.arrival_airport = arrival_airport;
	}
	
//set,get airplane
	public int getAirplane() {
		return airplane;
	}
	public void setAirplane(int airplane) {
		this.airplane = airplane;
	}
	
//set,get seat
	public Seat[][] getSeat() {
		return seat;
	}
	public void setSeat(Airplane airplane) {
		this.seat = new Seat[airplane.getAp_rows()][airplane.getAp_columns()];
	}
	
//set,get menu
	public int getMenu() {
		return menu;
	}
	public void setMenu(int menu) {
		this.menu = menu;
	}
	
//set,get number_seats
	public int getNumber_seats() {
		return number_seats;
	}
	public void setNumber_seats(int number_seats) {
		this.number_seats = number_seats;
	}
	
//set,get free_seats
	public int getFree_seats() {
		return free_seats;
	}
	public void setFree_seats(int free_seats) {
		this.free_seats = free_seats;
	}
	
	
}
