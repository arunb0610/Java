class ArrayProgram15
{
public static void main(String[] args)
{
ArrayProgram15.storing_negative_elements();
System.out.println();
ArrayProgram15.storing_negative_elements_in_reverse();
}
        static void storing_negative_elements(){
        int[] ar = {-9,-6,-32,12,54,-7};
        int count = 0;
        for(int i = 0; i<ar.length; i++)
        {
        if(ar[i]<0){
            count++;
            }
        }
        System.out.println();
        int[] ar2 = new int[count];
        int i = 0, j = 0;
        for(; i<ar.length; i++)
        {
        if(ar[i]<0)
            {
            ar2[j] = ar[i];
            System.out.print(ar2[j]+" ");
            j++;
            }
        }
    }
	   static void storing_negative_elements_in_reverse() {
        int[] ar = {34,-56,76,-12,-32,-9};
        int count = 0;
        for(int i = 0; i<ar.length; i++)
        {
        if(ar[i]<0){
            System.out.print(ar[i]+" ");
            count++;
            }
        }
        System.out.println();
        int[] ar2 = new int[count];
        int i = ar.length-1, j = 0;
        for(; i>=0; i--)
        {
        if(ar[i]<0)
            {
            ar2[j] = ar[i];
            System.out.print(ar2[j]+" ");
            j++;
            }
        }
    }
}
