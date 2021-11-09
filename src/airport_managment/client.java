package airport_managment;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;

public class client {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		boolean bool1,bool2,bool31,bool32;
		ArrayList<Airplane> airplanes = new ArrayList<Airplane>();
		airplanes.add(new Airplane(0, "0", 0, 0, 0)); // vazw ena stoixeio wste na mporei na mpainei sthn for pio katw //
		ArrayList<Menu> menus = new ArrayList<Menu>();
		menus.add(new Menu(0, "0", "0", "0")); // vazw ena stoixeio wste na mporei na mpainei sthn for pio katw //
		ArrayList<Flight> flights = new ArrayList<Flight>();
		ArrayList<Ticket> tickets = new ArrayList<Ticket>();
		int Ticketcounter = 0;
		
		int choice;
		do{
			
			System.out.println("[1] Insert Airplane");
			System.out.println("[2] Insert Menu");
			System.out.println("[3] Insert Flight");
			System.out.println("[4] Cancel Flight");
			System.out.println("[5] Book Ticket");
			System.out.println("[6] Cancel Ticket");
			System.out.println("[7] Order Menu Items (Available only in Business Seats) ");
			System.out.println("[8] Seats Capacity for a certain Flight");
			System.out.println("[0] Exit");
			System.out.println("[>] Insert Choice: ");
			choice = in.nextInt();
			
			if(choice == 1){
				bool1=false;
				
				//checking for an existing airplane
				System.out.println("Please give the id of the Airplane:");
				int idAp = in.nextInt();
				for (int row1 = 0; row1 < airplanes.size(); row1++) {
					if (idAp == airplanes.get(row1).getAp_id()) {
						bool1 = true;
					}
				}
				
				if (bool1 == false) {
					System.out.println("Please give the deiscription of the airplane:");
					String discAp = in.next();
					System.out.println("Please give the rows of the airplane:");
					int rowAp = in.nextInt();
					System.out.println("Please give the columns of the airplane:");
					int colAp = in.nextInt();
					int busAp;
					
					do{
						System.out.println("Please give the bussiness rows of the airplane(<=rows):");
						busAp = in.nextInt();
					}while(busAp > rowAp);
					
					//Add new airplane if not exist
					Airplane airplane1 = new Airplane(idAp ,discAp ,rowAp ,colAp ,busAp);
					airplanes.add(airplane1);
					System.out.println("New airplane added.");
				} else {
					System.out.println("This airplane already exists.");
				}	
				
			}else if(choice == 2){
				bool2=false;
				
				//checking for an existing menu
				System.out.println("Please give the id of the Menu:");
				int idMenu = in.nextInt();
				for (int row1 = 0; row1 < menus.size(); row1++) {
					if (idMenu == menus.get(row1).getMenu_id()) {
						bool2 = true;
					}
				}
				
				if (bool2 == false) {
					System.out.println("Please give kyriws of the menu:");
					String kyrMenu = in.next();
					System.out.println("Please give epidorpio of the menu:");
					String epiMenu = in.next();
					System.out.println("Please give poto of the menu:");
					String potMenu = in.next();
					
					//Add new menu if not exist
					Menu menu1 = new Menu(idMenu ,kyrMenu ,epiMenu ,potMenu);
					menus.add(menu1);
					System.out.println("New menu added.");
				} else {
					System.out.println("This menu already exists.");
				}	
			}else if(choice == 3){
				bool31 = false;bool32 = false;
				Airplane airplane;
				int idFlight;
				boolean checkid;
				do{
					checkid=false;
					System.out.println("Please give id of the flight:");
					idFlight = in.nextInt();
					for (int row1 = 0; row1 < flights.size(); row1++) {					
						if (idFlight == flights.get(row1).getflight_id()) {
													
							checkid = true;
							System.out.println("there is already this flight id!");
							
						}
					}
				}while(checkid==true);
				
				System.out.println("Please give date of the flight ('2017-03-03'):");
				String dateFlight = in.next();
				LocalDate localDate = LocalDate.parse(dateFlight);
				System.out.println("Please give airplanes's id :");
				int idAp = in.nextInt();
				
				
				for (int row1 = 0; row1 < airplanes.size(); row1++) {
					if (idAp == airplanes.get(row1).getAp_id()) {
						
						bool31 = true;
						System.out.println("bool31");
					}
				}
				for (int row1 = 0; row1 < flights.size(); row1++) {	
					
					if (  (idAp == flights.get(row1).getAirplane()) ||  (localDate.isEqual(flights.get(row1).getDate())) ) {
												
						bool32 = true;
						System.out.println("bool32= true");
					}
				}
				
				boolean created = false;
				for (int row1 = 0; row1 < airplanes.size(); row1++) {
				if ( bool31 == true && bool32 == false && idAp == airplanes.get(row1).getAp_id()) {
					created = true;
					System.out.println("Please give time of the flight (10:15:30) :");
					String timeFlight = in.next();
					LocalTime localTime = LocalTime.parse(timeFlight);
					System.out.println("Please give departure airport :");
					String depAriport = in.next();
					System.out.println("Please give Arrival airport :");
					String arrAriport = in.next();
					
					airplane=airplanes.get(row1);
					
					Flight flight = new Flight();
					flights.add(flight);
					flight.setflight_id(idFlight);
					flight.setDate(localDate);
					flight.setTime(localTime);
					flight.setDeparture_airport(depAriport);
					flight.setArrival_airport(arrAriport);					
					flight.setSeat(airplane);
					//flight.setNumber_seats(number_seats);
					//flight.getFree_seats();
					System.out.println("New flight have been added");
				}
				}
				if(created==false){
					System.out.println("we couldnt add this flight");
				}			
			}else if(choice == 4){
				System.out.println("Please give the ID of the Flight you want to delete: ");
				int delId = in.nextInt();
				for (int row1 = 0; row1 < flights.size(); row1++) {
					
						if ( delId == flights.get(row1).getflight_id() ) {
							flights.remove(row1);
							System.out.println("Flight removed.");
							
						}else{
							System.out.println("No Flight with that ID was found.");
						}
					}

				for (int row1 = 0; row1 < tickets.size(); row1++) {	
					if (delId == tickets.get(row1).getflight_id() ) {
						String surnamedel = tickets.get(row1).getsurname();
						int pricedel = tickets.get(row1).getprice();
						String.format("surname: %s -> money: %d",surnamedel ,pricedel);
						tickets.remove(row1);
					}
				}
				
			}else if(choice == 5){
				boolean bool51 = false;
				boolean bool52 = false;
				int flighingAir = 0;
				System.out.println("Please give the Flight_id you want to book:");
				int flight = in.nextInt();
				System.out.println("Please give the type of the seat(business,economy):");
				String type1 = in.next();
				
				for (int row1 = 0; row1 < flights.size(); row1++) {					
					if (flight == flights.get(row1).getflight_id() ) {							
						bool51 = true;
						flighingAir = flights.get(row1).getflight_id();
					}
				}
				for (int row1 = 0; row1 < airplanes.size(); row1++) {
					if(flighingAir == airplanes.get(row1).getAp_id() && airplanes.get(row1).getAp_bus_rows()>=1){
						bool52 =true;
						
					}
				}
				if(bool51 == true && bool52 == true){
					System.out.println("Please give normal or student ticket:");
					String type2 = in.next();
					System.out.println("Please give your name:");
					String name = in.next();
					System.out.println("Please give your surname:");
					String surname = in.next();
					System.out.println("Please give the porice of the ticket:");
					int price = in.nextInt();
					Ticket ticket = new Ticket(Ticketcounter+1, flight, type2, type1, price, name, surname);
					tickets.add(ticket);
					System.out.println("New Ticket added.");	
				}
				
				
			}else if(choice == 6){
				System.out.println("Please give the ticket_id you want to delete:");
				int ticket = in.nextInt();
				
				for (int row1 = 0; row1 < tickets.size(); row1++) {					
					if (ticket == tickets.get(row1).getTicket_id() ) {							
						tickets.remove(row1);
						System.out.println("Ticket removed.");
					}else{
						System.out.println("No Ticket with that ID was found.");
					}
				}
				
			}else if(choice == 7){
				System.out.println("[7]");
			}else if(choice == 8){
				System.out.println("[8]");
			}
		}while(choice!= 0 );
		in.close();
	}

}
