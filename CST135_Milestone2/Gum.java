package application;

public class Gum {
private String Mint;

public Gum() {
	this.Mint="";
	
}

public Gum(String mint) {
	super();
	Mint = mint;
}

@Override
public String toString() {
	return "Gum [Mint=" + Mint + "]";
}


}
