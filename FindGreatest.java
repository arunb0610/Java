class FindGreatest
{
    public static void main (String[] args)
    {
        int num = 967580, big = 0, big2 = 0;
        while(num>0)
        {
            int rem = num%10;
            if(rem>big)
            {
                big2 = big;
                big = rem;
            }
            if(rem<big && rem>big2)
            {
                big2 = rem;
            }
            num/=10;
        }
        System.out.println("Greatest digit in  a number is "+big);
        System.out.println("Second Greatest digit in  a number is "+big2);
    }
}
