class ArrayProgram12
{
public static void main(String[] args)
{
ArrayProgram12.printing_two_small_elements();
}
static void printing_two_small_elements()
    {
		// TODO Auto-generated method stub
		int[] ar = {43,45,21,90,40};
		int small = Integer.MAX_VALUE , small2 = Integer.MAX_VALUE ;
				for(int i = 0; i<ar.length; i++)
				{
					if(ar[i]<small)
					{
						small2 = small;
						small = ar[i];
					}
					else if(ar[i]<small2)
					{
						small2 = ar[i];
					}
				}
				System.out.println("The first biggest number is "+small+" and the second biggest number is "+small2);
	}
}
