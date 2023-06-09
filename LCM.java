import java.util.*;
class LCM // For 2 numbers
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a First Number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter a Second Number : ");
		int num2 = sc.nextInt(), gcd = 1, div = 2, lcm = 0;
		while(div <= num1)
		{
			if(num1 % div == 0 && num2 % div == 0)
			{
				gcd = div;
			}
			div++;
		}
		lcm = num1 * num2 / gcd;
		System.out.println(lcm);
	}
}
