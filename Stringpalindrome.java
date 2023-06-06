class StringPalindrome
{
    public static void main(String[] args)
    {
    String str = "malayalam";
    int j = str.length()-1, count = 0;
    for(int i = 0; i<j; i++)
    {
        if(str.charAt(i)!=str.charAt(j))
        {
            count = 1;
            break;
        }
        j--;
    }
    if(count == 0)
    {
         System.out.println("The given string is Palindrome");
    }
    else
    {
        System.out.println("The given string is not palindrome");
    }
    }
}
