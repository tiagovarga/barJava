package entities;

public class Bill {
	
	private char gender;
	private int beer;
	private int barbecue;
	private int softDrink;
	
	public Bill() {
		
	}
	
	public Bill(char gender, int beer, int barbecue, int softDrink) {
		super();
		this.gender = gender;
		this.beer = beer;
		this.barbecue = barbecue;
		this.softDrink = softDrink;
	}

	public double cover() {
		if (feeding() > 30.0) {
			return 0.0;
		}
		else {
			return 4.0;
		}
	}
	
	public double feeding() {
		return 5.0 * beer + 7.0 * barbecue + 3.0 * softDrink;
	}
	
	public double ticket() {
		if (gender == 'F') {
			return 8.00;
		}
		else {
			return 10.00;
		}
	}
	
	public double total() {
		return feeding() + cover() + ticket();
		
	}

}
