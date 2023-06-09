import java.util.*;
class StrongNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt(), temp = num, sum = 0, prod = 1;
		while(temp>0)
		{
			int rem = temp % 10;
			while(rem>0)
			{
				prod *= rem;
				rem--;
			}
			sum += prod;
			prod = 1;
			temp /= 10;
		}
		if(sum == num)
		{
			System.out.println("The given number is Strong number");
		}
		else
		{
			System.out.println("The given number is not Strong number");
		}
	}
}
