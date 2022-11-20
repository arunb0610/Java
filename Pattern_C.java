class Pattern_C
{
public static void main(String[] args)
{
Pattern_C.print_C();
}
static void print_C()
{
for(int row = 1; row<=9; row++)
{
    for(int col = 1; col<=5; col++)
    {
    if(row == 1 || row==9 || col==1)
    System.out.print(" *");
    else
    System.out.print("  ");
    }
System.out.println();
}
}
}
