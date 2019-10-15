package thuchanh3;

public class PhoneNumber {

	private int maVung;
	private int soDT;
	public PhoneNumber(int maVung, int soDT) {
		this.setMaVung(maVung);
		this.setSoDT(soDT);
	}
	public int getMaVung() {
		return maVung;
	}
	public void setMaVung(int maVung) {
		this.maVung = maVung;
	}
	public int getSoDT() {
		return soDT;
	}
	public void setSoDT(int soDT) {
		this.soDT = soDT;
	}
	
	
}
