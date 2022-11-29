class ArrayProgram30
{
public static void main(String[] args)
{
ArrayProgram30.divisibleBy_3();
}
static void divisibleBy_3()
{
int[] ar = {15,4,5,72,3,12};
for(int i = 0; i<ar.length; i++)
{
if(ar[i]%3 == 0)
{
System.out.println(ar[i]);
}
}
}
}
