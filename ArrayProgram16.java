class ArrayProgram16
{
public static void main(String[] args)
{
ArrayProgram16.multiples_of_5();
}
	   static void multiples_of_5() {
        int[] ar = {35,56,70,15,32,60};
        int[] ar2 = new int[ar.length-1];
        int i = 0, j = 0;
        for(; i<ar.length; i++)
        {
        if(ar[i]%5 == 0)
            {
            ar2[j] = ar[i];
            System.out.print(ar2[j]+" ");
            }
        }
    }
}
