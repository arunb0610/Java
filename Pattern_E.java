class Pattern_E
{
public static void main(String[] args)
{
Pattern_E.pattern_E();
}
static void pattern_E()
{
for(int row = 1; row<=9; row++)
{
    for(int col = 1; col<=5; col++)
    {
    if(row == 1 || col==1 || row == 5 || row == 9)
    System.out.print(" *");
    else
    System.out.print("  ");
    }
System.out.println();
}
}
}
