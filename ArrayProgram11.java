class ArrayProgram11
{
public static void main(String[] args)
{
Arrayprogram11.printing_two_big_elements();
}
static void printing_two_big_elements()
    {
		// TODO Auto-generated method stub
		int[] ar = {43,45,21,90,40};
		int big = Integer.MIN_VALUE , big2 = Integer.MIN_VALUE ;
				for(int i = 0; i<ar.length; i++)
				{
					if(ar[i]>big)
					{
						big2 = big;
						big = ar[i];
					}
					else if(ar[i]>big2)
					{
						big2 = ar[i];
					}
				}
				System.out.println("The first biggest number is "+big+" and the second biggest number is "+big2);
	}
}
