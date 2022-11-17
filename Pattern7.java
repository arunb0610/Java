package pattern_programs;

class Pattern7
{
public static void main(String[] args)
{
Pattern7 p2 = new Pattern7();
p2.Pattern7();
}
void Pattern7()
{
for(int row = 1; row <= 5; row++)
{
    for(int col=1; col <= 6-row; col++)
        {
        System.out.print("*"+" ");
        }
System.out.println();
}
}
}
