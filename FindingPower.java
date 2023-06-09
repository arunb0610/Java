import java.util.*;
class FindingPower
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");int num = sc.nextInt();
		System.out.println();
		System.out.print("Enter a power : ");
		int pow = sc.nextInt(), prod = 1;
		for(int i = 0; i<pow; i++)
		{
			prod *= num;
		}
		System.out.println(num+" power "+pow+" is "+prod);
	}
}
