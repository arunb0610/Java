class ArrayProgram20
{
public static void main(String[] args)
{
ArrayProgram20.adding_arrays();
}
	   static void adding_arrays() {
        int[] ar1 = {23,13,49,61};
        int[] ar2 = {10,20,45,36,58,64,54};
        int small = ar1.length<ar2.length?ar1.length:ar2.length;
        int big = ar1.length>ar2.length?ar1.length:ar2.length;
        int[] add = new int[big];
        for(int i = 0; i<small; i++)
        {
        add[i] = ar1[i] + ar2[i];
        System.out.print(add[i]+" ");
        }
        for(int i = small; i<big; i++)
        {
        add[i] = ar2[i];
        System.out.print(add[i]+" ");
        }
    }
}
