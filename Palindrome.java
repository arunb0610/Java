class Palindrome
{
public static void main(String[] args)
{
Palindrome pl = new Palindrome();
pl.find_palindrome(202202);
}
	private void find_palindrome(int no) { 
		int no2 = no; 
		int rev = 0; 
		while(no>0)
		{
		int rem = no%10; 
		rev = (rev*10) + rem; 
		no = no/10; 
		}

		if(no2 == rev)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		
	}
}
