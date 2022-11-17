package pattern_programs;

class Pattern13
{
public static void main(String[] args)
{
Pattern13 p2 = new Pattern13();
p2.Pattern13();
}
void Pattern13()
{
for(int row = 5; row>=1; row--)
{
    for(int col=row; col>=1; col--)
        {
        System.out.print(col+" ");
        }
System.out.println();
}
}
}
