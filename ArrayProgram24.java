class ArrayProgram24
{
public static void main(String[] args)
{
int[] ar = {9,1,3,5,0};
ar = ArrayProgram24.inserting_element(ar);
System.out.println();
for(int i = 0; i<ar.length; i++)
{
System.out.print(ar[i]+" ");
}
}
static int[] inserting_element(int[] ar)
{
for(int i = 0; i<ar.length; i++)
{
System.out.print(ar[i]+" ");
}
int key = 6;
ar[ar.length-1] = key;
return ar;
}
}

