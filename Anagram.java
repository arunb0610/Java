import java.util.*;
class Anagram
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Fist word (without space)");
		String str1 = sc.next(); str1 = str1.toLowerCase();
		System.out.println("Enter the Second word (without space)");
		String str2 = sc.next(); str2 = str2.toLowerCase();
		char[] ch1 = str1.toCharArray(), ch2 = str2.toCharArray();
		int count = 0;
		if(ch1.length != ch2.length)
		{
			System.out.println("The given words are not Anagram");
		}
		for(int i = 0; i<ch1.length; i++)
		{
			for(int j = 0; j<ch2.length; j++)
			{
				if(ch1[i] == ch2[j])
				{
					count ++;
					ch2[j] = '1';
					break;
				}
			}
		}
		if(count == ch1.length)
		{
			System.out.println("The given words are Anagram");
		}
		else
		{
			System.out.println("The given words are not Anagram");
		}
	}
}
