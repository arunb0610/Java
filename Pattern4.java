package pattern_programs;

class Pattern4
{
public static void main(String[] args)
{
Pattern4 p2 = new Pattern4();
p2.Pattern4();
}
void Pattern4()
{
for(int row = 1; row <= 5; row++)
{
    for(int col=row; col <= 5; col++)
        {
        System.out.print(col+" ");
        }
System.out.println();
}
}
}
