import java.util.Scanner;

class Frequency_Of_Number2 //user input
{
public static void main(String[] args)
{
Frequency_Of_Number2.find_frequency();
}
static void find_frequency()
{
Scanner sc = new Scanner(System.in);
System.out.print("How many numbers you have : ");
int length = sc.nextInt();
int[] ar = new int[length];
for(int i = 0; i<length; i++)
{
System.out.print("Enter the "+(i+1)+"th number : ");
ar[i] = sc.nextInt();
}
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
