package pattern_programs;

class Pattern3
{
public static void main(String[] args)
{
Pattern3 p2 = new Pattern3();
p2.Pattern3();
}
void Pattern3()
{
for(int row = 5; row>=1; row--)
{
    for(int col=5; col>=6-row; col--)
        {
        System.out.print(col+" ");
        }
System.out.println();
}
}
}
