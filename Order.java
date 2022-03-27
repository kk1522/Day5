package packagetest.restaurant;

public class Order {
	
	private int tableNo;
	private int seatNo;
	private String soup;
	private String starter;
	private String mainCourse;
	private String dessert;
	public Order(int tableNo, int seatNo, String soup, String starter, String mainCourse, String dessert) {
		super();
		this.tableNo = tableNo;
		this.seatNo = seatNo;
		this.soup = soup;
		this.starter = starter;
		this.mainCourse = mainCourse;
		this.dessert = dessert;
	}
	public int getTableNo() {
		return tableNo;
	}
	public void setTableNo(int tableNo) {
		this.tableNo = tableNo;
	}
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	public String getSoup() {
		return soup;
	}
	public void setSoup(String soup) {
		this.soup = soup;
	}
	public String getStarter() {
		return starter;
	}
	public void setStarter(String starter) {
		this.starter = starter;
	}
	public String getMainCourse() {
		return mainCourse;
	}
	public void setMainCourse(String mainCourse) {
		this.mainCourse = mainCourse;
	}
	public String getDessert() {
		return dessert;
	}
	public void setDessert(String dessert) {
		this.dessert = dessert;
	}
	
	

}
