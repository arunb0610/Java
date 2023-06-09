import java.util.*;
class NeonNum
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
		int num = sc.nextInt(), sum = 0, sum2 = 0, sq = num * num;
		while(sq>0)
		{
			int rem = sq % 10;
			sum += rem;
			int rem2 = num%10;
			sum2 += rem2;
			num /= 10;
			sq /= 10;
		}
		if(sum == sum2)
		{
			System.out.println("The number is neon number");
		}
		else
		{
			System.out.println("The number is not neon number");
		}
	}
}
