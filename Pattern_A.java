class Pattern_A
{
public static void main(String[] args)
{
Pattern_A.pattern_A();
}
static void pattern_A()
{
for(int row = 1; row<=9; row++)
{
    for(int col = 1; col<=5; col++)
    {
    if(row == 1 || col==1 || col==5 || row == 5)
    System.out.print(" *");
    else
    System.out.print("  ");
    }
System.out.println();
}
}
}
