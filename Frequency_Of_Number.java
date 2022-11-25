class Frequency_Of_Number
{
public static void main(String[] args)
{
Frequency_Of_Number.find_frequency();
}
static void find_frequency()
{
int[] ar = {2,3,1,2,3,4,5,6,7,5,6,8,9,1,2,3,9,0,3};
int[] freq = new int[ar.length];
for(int i = 0; i<ar.length; i++)
{
int num = ar[i];
int count = 1;
for(int j = i+1; j<ar.length; j++)
{
if(num == ar[j])
{
count++;
freq[j] = -1;
}
}
if(freq[i] != -1)
freq[i] = count;
}
for(int i =0; i<ar.length; i++)
{
if(freq[i] > 1)
System.out.println(ar[i]+" occurs "+freq[i]+" times");
}
for(int i =0; i<ar.length; i++)
{
if(freq[i] == 1)
System.out.println(ar[i]+" occurs only one time.");
}
}
}
