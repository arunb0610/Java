import java.util.*;
class LCM_n // For n numbers
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
		int div = 2, lcm = 1;
		for(; div <= small; div++)
		{
			int count = 0;
			for(int i = 0; i<ar.length; i++)
			{
				if(ar[i]%div==0)
				{
					count++;
				}
			}
			if(count>1)
			{
				lcm *= div;
				for(int i = 0; i<ar.length; i++)
				{
					if(ar[i]%div == 0)
					{
						ar[i] /= div;
					}
				}
                div = 1;
			}
		}
		for(int i = 0; i<ar.length; i++)
		{
			lcm *= ar[i];
		}
		System.out.println("The LCM for the given numbers is "+lcm);
	}
}
