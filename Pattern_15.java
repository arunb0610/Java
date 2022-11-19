class Pattern_15
{
public static void main(String[] args)
{
Pattern_15.find_pattern();
}
static void find_pattern()
{
for(int row = 1; row<=5; row++)
{
for(int col = 1; col<= row; col++)
{
System.out.print(row+" ");
}
System.out.println();
}
}
}
