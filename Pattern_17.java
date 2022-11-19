class Pattern_17
{
public static void main(String[] args)
{
Pattern_17.find_pattern();
}
static void find_pattern()
{
for(int row = 1; row<=4; row++)
{
    for(int col = 1; col<=row; col++)
    {
    if(col%2 == 0)
    System.out.print("#"+" ");
    else
    System.out.print(row+" ");
    }
System.out.println();
}
for(int row = 1; row<=4; row++)
{
    for(int col = 4; col>=row; col-- )
    if(col%2 == 1)
    System.out.print("#"+" ");
    else
    System.out.print(row+4+" ");
System.out.println();
}
}
}

