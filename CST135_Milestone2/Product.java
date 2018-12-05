package application;

public abstract class Product {
	public String productList;
	public String Butterfinger;
	public String Snickers;
	public String Payday;
	public String KitKat;
	public String NatureBar;
	public String Coke;
	public String Water;
	public String Poweraid;
	public String Fanta;
	public String Sprite;
	public String Doritos;
	public String Lays;
	public String OvenBaked;
	public String RufflesBBQ;
	public String RufflesSourCream;
	public String Mint;
	public int Row;
	public int Column;
	//default constructor 
public Product() {
	this.productList = "";
	this.Butterfinger="";
	this.Coke="";
	this.Doritos = "";
	this.Snickers = "";
	this.Payday ="";
	this.KitKat="";
	this.NatureBar="";
	this.Water="";
	this.Poweraid="";
	this.Fanta="";
	this.Sprite="";
	this.Lays="";
	this.OvenBaked="";
	this.RufflesBBQ="";
	this.RufflesSourCream="";
	this.Mint="";
	this.Row=0;
	this.Column=0;
}

//non default 
public Product(String productList, String butterfinger, String snickers, String payday, String kitKat, String natureBar,
		String coke, String water, String poweraid, String fanta, String sprite, String doritos, String lays,
		String ovenBaked, String rufflesBBQ, String rufflesSourCream, String mint, int row, int column) {
	super();
	this.productList = productList;
	Butterfinger = butterfinger;
	Snickers = snickers;
	Payday = payday;
	KitKat = kitKat;
	NatureBar = natureBar;
	Coke = coke;
	Water = water;
	Poweraid = poweraid;
	Fanta = fanta;
	Sprite = sprite;
	Doritos = doritos;
	Lays = lays;
	OvenBaked = ovenBaked;
	RufflesBBQ = rufflesBBQ;
	RufflesSourCream = rufflesSourCream;
	Mint = mint;
	Row = row;
	Column = column;
}


@Override
public String toString() {
	return "Product [productList=" + productList + ", Butterfinger=" + Butterfinger + ", Snickers=" + Snickers
			+ ", Payday=" + Payday + ", KitKat=" + KitKat + ", NatureBar=" + NatureBar + ", Coke=" + Coke + ", Water="
			+ Water + ", Poweraid=" + Poweraid + ", Fanta=" + Fanta + ", Sprite=" + Sprite + ", Doritos=" + Doritos
			+ ", Lays=" + Lays + ", OvenBaked=" + OvenBaked + ", RufflesBBQ=" + RufflesBBQ + ", RufflesSourCream="
			+ RufflesSourCream + ", Row=" + Row + ", Column=" + Column + "]";
}



public String getProductList() {
	return productList;
}

public void setProductList(String productList) {
	this.productList = productList;
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

public String getCoke() {
	return Coke;
}

public void setCoke(String coke) {
	Coke = coke;
}

public String getWater() {
	return Water;
}

public void setWater(String water) {
	Water = water;
}

public String getPoweraid() {
	return Poweraid;
}

public void setPoweraid(String poweraid) {
	Poweraid = poweraid;
}

public String getFanta() {
	return Fanta;
}

public void setFanta(String fanta) {
	Fanta = fanta;
}

public String getSprite() {
	return Sprite;
}

public void setSprite(String sprite) {
	Sprite = sprite;
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

public int getRow() {
	return Row;
}

public void setRow(int row) {
	Row = row;
}

public int getColumn() {
	return Column;
}

public void setColumn(int column) {
	Column = column;
}



}
