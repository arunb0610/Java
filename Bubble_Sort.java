class Bubble_Sort
{
public static void main(String[] args)
{
Bubble_Sort.sorting_Numbers();
}
static void sorting_Numbers()
{
int[] ar = {9,5,4,6,7,1,3};
for(int j = 1; j<ar.length; j++)
{
for(int i = 0; i<ar.length-j; i++)
{
if(ar[i]>ar[i+1])
{
int temp = ar[i];
ar[i] = ar[i+1];
ar[i+1] = temp;
}
}
}
for(int i = 0; i<ar.length; i++)
{
System.out.print(ar[i]+" ");
}
}
}
