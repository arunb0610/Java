class Pattern_Num_5
{
public static void main(String[] args)
{
Pattern_Num_5.print_5();
}
static void print_5()
{
for(int row = 1; row<=9; row++)
{
    for(int col = 1; col<=5; col++)
    {
    if(col == 1 &&  row <= 5 || row == 5 || row ==1 || row == 9 || col == 5 &&  row >= 5)
    System.out.print(" *");
    else
    System.out.print("  ");
    }
System.out.println();
}
}
}
