package application;

public class Chips {
	private String Doritos;
	private String Lays;
	private String OvenBaked;
	private String RufflesBBQ;
	private String RufflesSourCream;
	
	
	public Chips() {
		this.Doritos = "";
		this.OvenBaked="";
		this.RufflesBBQ="";
		this.RufflesSourCream="";
		this.Lays="";	
	}


	public Chips(String doritos, String lays, String ovenBaked, String rufflesBBQ, String rufflesSourCream) {
		super();
		Doritos = doritos;
		Lays = lays;
		OvenBaked = ovenBaked;
		RufflesBBQ = rufflesBBQ;
		RufflesSourCream = rufflesSourCream;
	}


	@Override
	public String toString() {
		return "Chips [Doritos=" + Doritos + ", Lays=" + Lays + ", OvenBaked=" + OvenBaked + ", RufflesBBQ="
				+ RufflesBBQ + ", RufflesSourCream=" + RufflesSourCream + "]";
	}
	
	
}
