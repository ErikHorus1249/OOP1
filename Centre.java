package thuchanh3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Centre {

	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		IntPhoneNumber ip = null;
		List<IntPhoneNumber> list = new ArrayList<IntPhoneNumber>();
		PhoneBook pb = new PhoneBook(ip, list, scanner);
		while(true) {
			System.out.println("\nNhap :");
			n = scanner.nextInt();
			switch (n) {
			case 1:
				pb.nhap();
				break;
			case 2:
				pb.TimMaVung();
				break;
			case 3:
				pb.show();
				break;
			case 4:
				break;
			case 5:
				pb.timD();
				break;
			default:
				System.out.println("THOAT !");
				break;
			}
			if(n == 0) {
				break;
			}
		}
	}

}
