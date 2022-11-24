class ArrayProgram13
{
public static void main(String[] args)
{
ArrayProgram13.adding_odd_index();
}
	   static void adding_odd_index() {
		// TODO Auto-generated method stub
		int[] ar = {54,76,88,23,45,90};
		int total = 0;
		for(int i =0; i<ar.length; i++)
		{
			if(i%2 != 0)
			{
				total += ar[i] ;
			}
		}
		System.out.println("The total of the odd indexes are "+total);
	}
}
