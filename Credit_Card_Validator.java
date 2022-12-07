import java.util.Scanner;

public class Credit_Card_Validator {
	
	public static void main(String[] args) {
		Credit_Card_Validator ccv = new Credit_Card_Validator();
		ccv.creditCardValidity();
	}

	private void creditCardValidity() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How many digits your Credit Card has?");
		int digits = sc.nextInt(), sum = 0;
		System.out.println("Enter your Credit Card number : ");
		String cc = sc.next();
		int[] ccno = new int[digits];
		for(int i = 0; i<cc.length(); i++)
		{
			int ch = cc.charAt(i);
			ccno[i] =  Character.getNumericValue(ch);
		}
		for(int j = 0; j<ccno.length; j++)
		{
			if(j%2 == 0)
			{
				ccno[j] *= 2;
			}
		}
		for(int k = 0; k<ccno.length; k++)
		{
			
			if(ccno[k]>=10)
			{
				int num = ccno[k], rem = 0;
				while(num>0)
				{
					int rem2 = num%10;
					rem += rem2 ;
					num /= 10;
				}
				ccno[k] = rem ;
			}
			sum += ccno[k];
		}
		if(sum%10 == 0)
		{
			System.out.println("Your Card is valid credit card");
		}
		else
		{
			System.out.println("Your Card is not valid credit card");
		}
		
	}
	

}
