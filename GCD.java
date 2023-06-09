import java.util.*;
class GCD // For 2 numbers
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a First Number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter a Second Number : ");
		int num2 = sc.nextInt(), gcd = 1, div = 2;
		while(div <= num1)
		{
			if(num1 % div == 0 && num2 % div == 0)
			{
				gcd = div;
			}
			div++;
		}
		System.out.println(gcd);
	}
}
