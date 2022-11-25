class ArrayProgram25
{
public static void main(String[] args)
{
int[] ar = {5,3,4,7,6};
ar = ArrayProgram25.removing_element(ar);
System.out.println();
for(int i = 0; i<ar.length; i++)
{
if(ar[i] != -1)
System.out.print(ar[i]+" ");
}
}
static int[] removing_element(int[] ar)
{
int key = 4;
for(int i = 0; i<ar.length; i++)
{
if(ar[i] == key)
{
ar[i] = -1 ;
}
}
return ar;
}
}

