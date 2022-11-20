class Pattern_B
{
public static void main(String[] args)
{
Pattern_B.pattern_B();
}
static void pattern_B()
{
for(int row = 1; row<=9; row++)
{
    for(int col = 1; col<=7; col++)
    {
    if(row == 1 || col==1 || col==7 || row == 5 || row == 9)
    System.out.print(" *");
    else
    System.out.print("  ");
    }
System.out.println();
}
}
}
