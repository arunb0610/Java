class ArmstrongNumber //Finding the number is armstrong or not
{
	public static void main(String[] args) {
		int num = 153, temp = num, prod = 1, sum = 0, count = 0;
		while(temp > 0)
		{
			count++;
			temp/=10;
		}
		temp = num;
		while(temp > 0)
		{
			int rem = temp % 10;
			for(int i = 0; i<count; i++)
			{
				prod *= rem;
			}
			sum += prod;
            prod = 1;
			temp /= 10;
		}
		if(sum == num)
		{
			System.out.println("The given number is Armstrong Number");
		}
		else
		{
			System.out.println("The given number is not Armstrong Number");
		}
	}
}
