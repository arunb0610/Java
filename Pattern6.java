package pattern_programs;

class Pattern6
{
public static void main(String[] args)
{
Pattern6 p2 = new Pattern6();
p2.Pattern6();
}
void Pattern6()
{
for(int row = 1; row <= 5; row++)
{
    for(int col=1; col <= 6-row; col++)
        {
        System.out.print(1+" ");
        }
System.out.println();
}
}
}
