import java.util.*;
class PrimeNumber2
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt(), div = 2, count = 0;
		while(div<num/2)
		{
			if(num%div == 0)
			{
				count = 1;
				break;
			}
            div++;
		}
		if(count == 0)
		{
			System.out.println("The given number is Prime number");
		}
		else
		{
			System.out.println("The given number is not Prime number");
		}
	}
}
