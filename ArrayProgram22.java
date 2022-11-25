class ArrayProgram22
{
public static void main(String[] args)
{
ArrayProgram22 ap = new ArrayProgram22();
int[] ar = {60,70,80,90};
for(int count = 0; count < 2; count++)
{
ar = ap.right_shifting(ar);
System.out.println();
for(int i = 0; i<ar.length; i++)
{
}
System.out.println();
}
}
static int[] right_shifting(int[] ar)
{
for(int i = 0; i<ar.length; i++)
{
}
int temp = ar[ar.length-1];
int i = ar.length-1;
for(; i>0; i--)
{
ar[i] = ar[i-1];
}
ar[i] = temp;
return ar;
}
} 
