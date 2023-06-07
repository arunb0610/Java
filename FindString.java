class FindString //ifnding the input in main string
{
	public static void main(String[] args) {
		String str = "I have another animal annoying me", input = "an" ;
		char[] ch1 = str.toCharArray(), ch2 = input.toCharArray();
		int count = 0 , i = 0;
		for(int j = 0; j<ch1.length; j++)
		{
			int k = j;
			while(i<ch2.length)
			{
				if(ch2[i] == ch1[k])
				{
					i++;
					k++;
					if(i==ch2.length&&j!=ch1.length-1)
					{
						count++;
						i = 0;
						break;
					}
				}
				else
				{
					i = 0;
					break;
				}
			}
		}
		System.out.println("The given input ( "+input+" ) occured "+count+" times");
	}
}
