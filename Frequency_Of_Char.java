class Frequency_Of_Char
{
public static void main(String[] args)
{
String name = "arunkumar";
char[] ar = name.toCharArray();
ar = Frequency_Of_Char.find_frequency(ar);
}
static char[] find_frequency(char[] ar)
{
int[] freq = new int[ar.length];
for(int i = 0; i<ar.length; i++)
{
char letter = ar[i];
int count = 1;
for(int j = i+1; j<ar.length; j++)
{
if(letter == ar[j])
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
System.out.print(ar[i]+""+freq[i]);
}
return ar;
}
}
