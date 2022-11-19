class Pattern_16
{
public static void main(String[] args)
{
Pattern_16.find_pattern();
}
static void find_pattern()
{
int col = 0;
for(int row = 1; row<=5; row++)
{
for(col=col+1; col<=9 ;col++)
{
System.out.println(col+" ");
}
System.out.println();
}
}
}
