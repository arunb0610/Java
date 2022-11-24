class ArrayProgram14
{
public static void main(String[] args)
{
ArrayProgram14.reverse_sorting();
}
	   static void reverse_sorting() {
        int[] ar = {34,56,76,12,32};
        int[] ar2 = new int[ar.length];
        int i = ar.length-1, j = 0;
        for(; i>=0; i--)
        {
        ar2[j] = ar[i];
        System.out.print(ar2[j]+" ");
        j++;
        }
    }
}
