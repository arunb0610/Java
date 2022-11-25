class ArrayProgram23
{
public static void main(String[] args)
{
int[] ar = {23,65,76,12,34};
for(int count = 0 ; count < 2; count++)
{
ar = ArrayProgram23.left_shifting(ar);
System.out.println();
for(int i = 0; i<ar.length; i++)
{
System.out.print(ar[i]+" ");
}
System.out.println();
}
}
static int[] left_shifting(int[] ar)
{
for(int i = 0; i<ar.length; i++)
{
System.out.print(ar[i]+" ");
}
int temp = ar[0];
int i = 0;
for(; i<ar.length-1; i++)
{
ar[i] = ar[i+1];
}
ar[i] = temp;
return ar;
}
} 
