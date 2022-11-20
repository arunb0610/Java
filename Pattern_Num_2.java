class Pattern_Num_2
{
public static void main(String[] args)
{
Pattern_Num_2.print_2();
}
static void print_2()
{
for(int row = 1; row<=9; row++)
{
    for(int col = 1; col<=5; col++)
    {
    if(col == 5 &&  row <= 5 || row == 5 || row ==1 || row == 9 || col == 1 &&  row >= 5)
    System.out.print(" *");
    else
    System.out.print("  ");
    }
System.out.println();
}
}
}
