class Pattern_19
{
public static void main(String[] args)
{
Pattern_19.find_pattern();
}
static void find_pattern()
{
for(int row = 1; row<=5; row++)
{
    for(int col = 1; col<=6-row; col++)
    {
    System.out.print(" "+" ");
    }
        for(int col = 1; col<=row; col++)
        {
        if(row%2 == 0)
        
        System.out.print("#"+" ");
        
        else
        System.out.print(row+" ");
        }
System.out.println();
}
}
}
