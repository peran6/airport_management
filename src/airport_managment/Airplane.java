package airport_managment;

public class Airplane {
//Ap means Airplane 
//bus means bussiness
	private int Ap_id;
	private String Ap_discription;
	private int Ap_rows;
	private int Ap_columns;
	private int Ap_bus_rows;
	
	public Airplane(int Ap_id, String Ap_discription, int Ap_rows, int Ap_columns, int Ap_bus_rows) {
		this.Ap_id = Ap_id;
		this.Ap_discription = Ap_discription;
		this.Ap_rows = Ap_rows;
		this.Ap_columns = Ap_columns;
		this.Ap_bus_rows = Ap_bus_rows;
	}
	
//set,get Ap_code
	public int getAp_id() {
		return Ap_id;
	}
	public void setAp_id(int Ap_id) {
		this.Ap_id = Ap_id;
	}
	
//set,get Ap_discription
	public String getAp_discription() {
		return Ap_discription;
	}
	public void setAp_discription(String Ap_discription) {
		this.Ap_discription = Ap_discription;
	}
	
//set,get Ap_rows
	public int getAp_rows() {
		return Ap_rows;
	}
	public void setAp_rows(int Ap_rows) {
		this.Ap_rows = Ap_rows;
	}
	
//set,get Ap_columns
	public int getAp_columns() {
		return Ap_columns;
	}
	public void setAp_columns(int Ap_columns) {
		this.Ap_columns = Ap_columns;
	}
	
//set,get Ap_bus_rows
	public int getAp_bus_rows() {
		return Ap_bus_rows;
	}
	public void setAp_bus_rows(int Ap_bus_rows) {
		this.Ap_bus_rows = Ap_bus_rows;
	}
}
