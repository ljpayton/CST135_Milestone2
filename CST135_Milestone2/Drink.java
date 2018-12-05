package application;

public class Drink {
	private String Coke;
	private String Water;
	private String Poweraid;
	private String Fanta;
	private String Sprite;
	
	
	public Drink() {
		Coke = "";
		Water = "";
		Poweraid = "";
		Fanta = "";
		Sprite = "";
	}
	
	public Drink(String coke, String water, String poweraid, String fanta, String sprite) {
		super();
		Coke = coke;
		Water = water;
		Poweraid = poweraid;
		Fanta = fanta;
		Sprite = sprite;
	}

	@Override
	public String toString() {
		return "Drink [Coke=" + Coke + ", Water=" + Water + ", Poweraid=" + Poweraid + ", Fanta=" + Fanta + ", Sprite="
				+ Sprite + "]";
	}
	
	
	
	
	
}
