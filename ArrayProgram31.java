class ArrayProgram31
{
public static void main(String[] args)
{
ArrayProgram31 ap = new ArrayProgram31();
ap.prime_In_Array();
}
void prime_In_Array()
{
int[] ar = {13,11,15,6,7,19,31};
int[] ar2 = new int[ar.length];
int count2 = 0, total = 0;
for(int i = 0; i<ar.length; i++)
{
int div = 2, count =0;
while(ar[i]>div)
{
if(ar[i]%div == 0)
{
count++;
}
div++;
}
if(count == 0)
{
ar2[i] = ar[i]; 
count2++;
total += ar[i];
}
else
ar2[i] = -1;
}
for(int j=0; j<ar2.length; j++)
{
if(ar2[j] != -1)
{
System.out.print(ar2[j]+" ");
}
}
System.out.println();
System.out.println("Count of Prime numbers is "+count2);
System.out.println("Total of Prime numbers is "+total);
}
}
