class ArrayProgram31
{
public static void main(String[] args)
{
ArrayProgram31 ap = new ArrayProgram31();
ap.prime_In_Array();
}
void find_prime(int[] ar)
{
int div = 2, j = 0, total = 0;
int[] ar2 = new int[ar.length];
for(int i=0; i<ar.length; i++)
{
int count = 0;
while(ar[i]>div)
{
if(ar[i]%div == 0)
{
count++;
break;
}
div++;
if(count == 0)
{
ar2[i] = ar[i];
total += ar2[i];
}
}
System.out.println(ar2[i]);
}
}
void prime_In_Array()
{
int[] ar = {11,13,15,16,11};
find_prime(ar);
}
}
