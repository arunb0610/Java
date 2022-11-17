package pattern_programs;

class Pattern12
{
public static void main(String[] args)
{
Pattern12 p2 = new Pattern12();
p2.Pattern12();
}
void Pattern12()
{
for(int row = 1; row <= 5; row++)
{
    for(int col=1; col <= 6-row; col++)
        {
        System.out.print(" "+" ");
        }
    for(int col = 1; col<=row; col++)
    {
    System.out.print("*"+" ");
    }
System.out.println();
}
}
}
