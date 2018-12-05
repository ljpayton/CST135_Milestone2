package application;

public class Candy {
	private String Butterfinger;
	private String Snickers;
	private String Payday;
	private String KitKat;
	private String NatureBar;
	
	public Candy() {
		Butterfinger = "";
		Snickers = "";
		Payday = "";
		KitKat = "";
		NatureBar = "";
	}
	
	public Candy(String butterfinger, String snickers, String payday, String kitKat, String natureBar) {
		super();
		Butterfinger = butterfinger;
		Snickers = snickers;
		Payday = payday;
		KitKat = kitKat;
		NatureBar = natureBar;
	}



	@Override
	public String toString() {
		return "Candy [Butterfinger=" + Butterfinger + ", Snickers=" + Snickers + ", Payday=" + Payday + ", KitKat="
				+ KitKat + ", NatureBar=" + NatureBar + "]";
	}
	
	
	
}
