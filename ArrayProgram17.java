class ArrayProgram17
{
public static void main(String[] args)
{
ArrayProgram17.printing_even_numbers();
}
	   static void printing_even_numbers() {
        int[] ar = {35,56,70,15,32,60};
        int[] ar2 = new int[ar.length-1];
        int i = 0, j = 0;
        for(; i<ar.length; i++)
        {
        if(ar[i]%2 == 0)
            {
            ar2[j] = ar[i];
            System.out.print(ar2[j]+" ");
            }
        }
    }
}
