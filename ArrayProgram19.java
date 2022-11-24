class ArrayProgram19
{
public static void main(String[] args)
{
ArrayProgram19.printing_adjacent_nos();
}
	   static void printing_adjacent_nos() {
        int[] ar = {35,56,70,15,32,60,55};
        for(int i = 0; i<ar.length-1; i++)
        {
        int small = ar[i]<ar[i+1]?ar[i]:ar[i+1];
        int big = ar[i]>ar[i+1]?ar[i]:ar[i+1];
        for(; small<=big;small++)
            {
            System.out.print(small+" ");
            }
        System.out.println();
        }
    }
}
