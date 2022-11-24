class ArrayProgram18
{
public static void main(String[] args)
{
ArrayProgram18.storing_odd_indexed_nos();
}
	   static void storing_odd_indexed_nos() {
        int[] ar = {35,56,70,15,32,60};
        int[] ar2 = new int[ar.length-1];
        int i = 0, j = 0;
        for(; i<ar.length; i++)
        {
        if(i%2 != 0)
            {
            ar2[j] = ar[i];
            System.out.print(ar2[j]+" ");
            }
        }
    }
}
