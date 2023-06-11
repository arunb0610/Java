import java.util.*;
class GCD_n // For n numbers
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many numbers do you have? ");
		int len = sc.nextInt(), small = Integer.MAX_VALUE;
		int[] ar = new int[len];
		for(int i = 0; i<len; i++)
		{
			System.out.print("Enter a "+(i+1)+" Number : ");
			ar[i] = sc.nextInt();
			if(ar[i]<small)
			{
				small = ar[i];
			}
		}
		int count = 0, div = 2, gcd = 0;
		for(; div <= small; div++)
		{
			count = 1;
			for(int i = 0; i<ar.length-1; i++)
			{
				if(ar[i]%div == 0 && ar[i+1]%div == 0)
				{
					count++;
					gcd = div;
				}
			}
		}
		if(count == ar.length)
		{
			System.out.println("The GCD for the given numbers is "+gcd);
		}
		else
		{
			System.out.println("GCD is not possible for the given numbers");
		}
	}
}
