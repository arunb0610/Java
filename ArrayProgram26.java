class ArrayProgram26
{
public static void main(String[] args)
{
ArrayProgram26.adding_in_sameArray();
}
static void adding_in_sameArray()
{
int[] ar = {0,10,5,3,5,7,1,2,8};
for(int i = 0; i<ar.length; i++)
{
int num = ar[i];
int total = 0;
for(int j = i+1; j<ar.length; j++)
{
total = num + ar[j];
if(total == 20)
{
System.out.println("Addition of "+ar[i]+"&"+ar[j]+"is 10");
}
}
}
}
}
