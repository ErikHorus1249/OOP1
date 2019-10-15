package thuchanh3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBook {

	private int maVung;
	private int soDT;
	private int maQG;
	private IntPhoneNumber ip;
	private Scanner scanner = new Scanner(System.in);
	private List<IntPhoneNumber> list = new ArrayList<IntPhoneNumber>();
	//construction
	public PhoneBook( IntPhoneNumber ip, List<IntPhoneNumber> list, Scanner scanner) {
		this.list = list;
		this.scanner = scanner;
		this.ip = ip;
	}
	// hien thi menu
	public void Display() {
		System.out.println("1. Nhap vao so dien thoai");
		System.out.println("2. Tim so dien thoai theo ma vung");
		System.out.println("3. Liet ke so dien thoai có tuy chon");
		System.out.println("4. Tinh tong do dien thoai theo vung");
		System.out.println("5. Tim so dien thoai theo duoi");
	}
	// nhap lieu
	public void nhap() {
		System.out.println("Press :");
		int n = scanner.nextInt();
		if(n==1) {
			System.out.println("Nhap vao ma Quoc gia ");
			maQG = scanner.nextInt();
			System.out.println("Nhap vao ma Vung ");
			maVung = scanner.nextInt();
			System.out.println("Nhap vao so dien thoai ");
			soDT = scanner.nextInt();
			ip = new IntPhoneNumber(maVung, soDT, maQG);
			list.add(ip);
		}
		else {
			System.out.println("Nhap vao ma Vung ");
			maVung = scanner.nextInt();
			System.out.println("Nhap vao so dien thoai ");
			soDT = scanner.nextInt();
			ip = new IntPhoneNumber(maVung, soDT);
			list.add(ip);
		}
	}
	// Tim so dien thoai theo vung
	public void TimMaVung() {
		System.out.println("Nhap vao ma vung can tim :");
		int n = scanner.nextInt();
		for(IntPhoneNumber n1 : list) {
			if(n==n1.getMaVung()) {
				System.out.println(n1.getMaQG()+"-"+n1.getMaVung()+"-"+n1.getSoDT());
			}
		}
	}
	// show toan bo so dien thoai theo yeu cau
	public void show() {
		System.out.println("1. In so dien thoai quoc te :");
		System.out.println("0. In so dien thoai noi dia");
		System.out.println("Nhap vao yeu cau :");
		int n2 = scanner.nextInt();
		if(n2 == 1) {
			for(IntPhoneNumber n : list) {
				if(n.getMaQG()!=0) System.out.println(n.getMaQG()+"-"+n.getMaVung()+"-"+n.getSoDT());
			}
		}
		else {
			for(IntPhoneNumber n : list) {
				if(n.getMaQG()==0) System.out.println(n.getMaQG()+"-"+n.getMaVung()+"-"+n.getSoDT());
			}	
		}
	}
	// Tim so dien thoai theo so duoi
	public void timD() {
		System.out.println("Nhap vao so duoi can tim :");
		int n = scanner.nextInt();
		for(IntPhoneNumber n1 : list) {
			if((n1.getSoDT()-n)%100 == 0) {
				System.out.println(n1.getMaQG()+"-"+n1.getMaVung()+"-"+n1.getSoDT());
			}
		}	
	}
	// Tinh tong so dien thoai theo vung
	public void TongVung() {
		
	}
}
