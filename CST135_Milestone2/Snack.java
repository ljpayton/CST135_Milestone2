package application;

public abstract class Snack {
	private String Butterfinger;
	private String Snickers;
	private String Payday;
	private String KitKat;
	private String NatureBar;
	private String Doritos;
	private String Lays;
	private String OvenBaked;
	private String RufflesBBQ;
	private String RufflesSourCream;
	
	public Snack() {
		Butterfinger = "";
		Snickers = "";
		Payday = "";
		KitKat = "";
		NatureBar = "";
		Doritos = "";
		Lays = "";
		OvenBaked = "";
		RufflesBBQ = "";
		RufflesSourCream = "";
	}
	
	public Snack(String butterfinger, String snickers, String payday, String kitKat, String natureBar, String doritos,
			String lays, String ovenBaked, String rufflesBBQ, String rufflesSourCream) {
		super();
		Butterfinger = butterfinger;
		Snickers = snickers;
		Payday = payday;
		KitKat = kitKat;
		NatureBar = natureBar;
		Doritos = doritos;
		Lays = lays;
		OvenBaked = ovenBaked;
		RufflesBBQ = rufflesBBQ;
		RufflesSourCream = rufflesSourCream;
	}

@Override
	public String toString() {
		return "Snack [Butterfinger=" + Butterfinger + ", Snickers=" + Snickers + ", Payday=" + Payday + ", KitKat="
				+ KitKat + ", NatureBar=" + NatureBar + ", Doritos=" + Doritos + ", Lays=" + Lays + ", OvenBaked="
				+ OvenBaked + ", RufflesBBQ=" + RufflesBBQ + ", RufflesSourCream=" + RufflesSourCream + "]";
	}


public String getButterfinger() {
	return Butterfinger;
}
public void setButterfinger(String butterfinger) {
	Butterfinger = butterfinger;
}

public String getSnickers() {
	return Snickers;
}

public void setSnickers(String snickers) {
	Snickers = snickers;
}

public String getPayday() {
	return Payday;
}

public void setPayday(String payday) {
	Payday = payday;
}
public String getKitKat() {
	return KitKat;
}

public void setKitKat(String kitKat) {
	KitKat = kitKat;
}
public String getNatureBar() {
	return NatureBar;
}
public void setNatureBar(String natureBar) {
	NatureBar = natureBar;
}
public String getDoritos() {
	return Doritos;
}
public void setDoritos(String doritos) {
	Doritos = doritos;
}
public String getLays() {
	return Lays;
}
public void setLays(String lays) {
	Lays = lays;
}
public String getOvenBaked() {
	return OvenBaked;
}
public void setOvenBaked(String ovenBaked) {
	OvenBaked = ovenBaked;
}

public String getRufflesBBQ() {
	return RufflesBBQ;
}
public void setRufflesBBQ(String rufflesBBQ) {
	RufflesBBQ = rufflesBBQ;
}

public String getRufflesSourCream() {
	return RufflesSourCream;
}

public void setRufflesSourCream(String rufflesSourCream) {
	RufflesSourCream = rufflesSourCream;
}
	
	

}
