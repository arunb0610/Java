import java.util.*;
public class Flames {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first name (without space)");
		String str1 = sc.next();str1 = str1.toLowerCase();
		System.out.println("Enter the second name (without space)");
		String str2 = sc.next();str2 = str2.toLowerCase();
		char[] ch1 = str1.toCharArray(), ch2 = str2.toCharArray();
		int sum = str1.length()+str2.length();
		for(int i = 0; i<ch1.length; i++)
		{
			for(int j = 0; j<ch2.length; j++)
			{
				if(ch1[i] == ch2[j])
				{
					ch2[j] = '1';
					sum -= 2;
					break;
				}
			}
		}
		String flames = "FLAMES";
		while(flames.length()>1)
		{
			int index = sum%flames.length();
			if(index == 0)
			{
				flames = flames.substring(0,flames.length()-1);
			}
			else
			{
				flames = flames.substring(index)+flames.substring(0,index-1);
			}
		}
		switch(flames)
		{
		case "F":
			System.out.println(str1+" and "+str2+" are Friends");
			break;
		case "L":
			System.out.println(str1+" and "+str2+" are Lovers");
			break;
		case "A":
			System.out.println(str1+" and "+str2+" are Affectionates");
			break;
		case "M":
			System.out.println(str1+" and "+str2+" are going to Married");
			break;
		case "E":
			System.out.println(str1+" and "+str2+" are Enemies");
			break;
		case "S":
			System.out.println(str1+" and "+str2+" are Siblings");
			break;
		}
	}

}

