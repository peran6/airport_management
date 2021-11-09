package airport_managment;
import java.time.LocalDate;

public class Ticket {

	private int Ticket_id;
	private int flight_id;
	private LocalDate date;
	private String type_nor_stu;
	private String type_eco_bus;
	private int price;
	private String name;
	private String surname;
	private String kyriws;
	private String epidorpio;
	private String poto;
	
	public Ticket(int Ticket_id,int flight_id,String type_nor_stu,String type_eco_bus,int price,
			String name,String surname){
		this.flight_id = flight_id;
		this.type_nor_stu = type_nor_stu;
		this.type_eco_bus = type_eco_bus;
		this.price = price;
		this.name = name;
		this.surname = surname;

	}
//set,get Ticket_id	
	public int getTicket_id() {
		return Ticket_id;
	}
	public void setTicket_id(int Ticket_id) {
		this.Ticket_id = Ticket_id;
	}
//set,get flight_id	
	public int getflight_id() {
		return flight_id;
	}
	public void setflight_id(int flight_id) {
		this.flight_id = flight_id;
	}
//set,get date	
	public LocalDate getdate() {
		return date;
	}
	public void setdate(LocalDate date) {
		this.date = date;
	}
//set,get type_nor_stu
	public String gettype_nor_stu() {
		return type_nor_stu;
	}
	public void settype_nor_stu(String type_nor_stu) {
		this.type_nor_stu = type_nor_stu;
	}
//set,get type_eco_bus
	public String gettype_eco_bus() {
		return type_eco_bus;
	}
	public void settype_eco_bus(String type_eco_bus) {
		this.type_eco_bus = type_eco_bus;
	}	
//set,get price	
	public int getprice() {
		return price;
	}
	public void setprice(int price) {
		this.price = price;
	}
//set,get name	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
//set,get surname	
	public String getsurname() {
		return surname;
	}
	public void setsurname(String surname) {
		this.surname = surname;
	}
//set,get kyriws	
	public String getkyriws() {
		return kyriws;
	}
	public void setkyriws(String kyriws) {
		this.kyriws = kyriws;
	}
//set,get epidorpio	
	public String getepidorpio() {
		return epidorpio;
	}
	public void setepidorpio(String epidorpio) {
		this.epidorpio = epidorpio;
	}
//set,get poto	
	public String getpoto() {
		return poto;
	}
	public void setpoto(String poto) {
		this.poto = poto;
	}
}
