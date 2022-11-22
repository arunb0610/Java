import java.util.Scanner;

public class Scanner_Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Price : ");
		int price = sc.nextInt();
		float discount = (10 * 100) / 100;
		float offer_price = price - discount;
		System.out.println("Offer price is Rs:"+offer_price);
	}

}
