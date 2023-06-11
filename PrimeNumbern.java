import java.util.*;
class PrimeNumbern // For n numbers
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a count : ");
		int num = 1, count2 = sc.nextInt();
		while(num < count2)
		{
			int count = 0, div = 2;
			while(div<=num/2)
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
				System.out.println(num);
			}
			num++;
		}
	}
}
