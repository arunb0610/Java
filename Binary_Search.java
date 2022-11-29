class Binary_Search
{
public static void main(String[] args)
{
Binary_Search.find_key();
}
static void find_key()
{
int[] ar = {1,4,5,6,8,9,11,15,17,20,21};
int key = 20;
int min = 0, max = ar.length-1;
while(min<=max)
{
int mid = (min+max)/2;
if(key == ar[mid])
{
System.out.println("Yes got it at "+mid);
break;
}
else if(key>ar[mid])
{
min = mid + 1;
}
else
{
max = mid-1;
}
}
}
}

