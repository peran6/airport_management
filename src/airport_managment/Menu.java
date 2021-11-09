package airport_managment;

public class Menu {
	
	private int Menu_id;
	private String Kyrios;
	private String Epidorpio;
	private String Poto;
	
	public Menu(int Menu_id, String Kyrios, String Epidorpio, String Poto) {
		this.Menu_id = Menu_id;
		this.Kyrios = Kyrios;
		this.Epidorpio = Epidorpio;
		this.Poto = Poto;
	}
	
//set,get menu_id
	public int getMenu_id() {
		return Menu_id;
	}
	public void setMenu_id(int Menu_id) {
		this.Menu_id = Menu_id;
	}
	
//set,get kyrios
	public String getKyrios() {
		return Kyrios;
	}
	public void setKyrios(String Kyrios) {
		this.Kyrios = Kyrios;
	}
	
//set,get epidorpio
	public String getEpidorpio() {
		return Epidorpio;
	}
	public void setEpidorpio(String Epidorpio) {
		this.Epidorpio = Epidorpio;
	}
	
//set,get Poto
	public String getSeat_id() {
		return Poto;
	}
	public void setPoto(String Poto) {
		this.Poto = Poto;
	}
	
}
