package thuchanh3;

public class IntPhoneNumber extends PhoneNumber{

	private int maQG;
	public IntPhoneNumber(int maVung, int soDT, int maQG) {
		super(maVung, soDT);
		this.maQG =maQG;
	}
	public IntPhoneNumber(int maVung, int soDT) {
		super(maVung, soDT);
	}
	public int getMaQG() {
		return maQG;
	}
	public void setMaQG(int maQG) {
		this.maQG = maQG;
	}
}
