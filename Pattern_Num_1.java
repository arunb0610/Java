class Pattern_Num_1
{
public static void main(String[] args)
{
Pattern_Num_1.print_1();
}
static void print_1()
{
for(int row = 1; row<=9; row++)
{
    for(int col = 1; col<=5; col++)
    {
    if(col == 5)
    System.out.print(" *");
    else
    System.out.print("  ");
    }
System.out.println();
}
}
}
