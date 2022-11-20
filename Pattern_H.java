class Pattern_H
{
public static void main(String[] args)
{
Pattern_H.print_H();
}
static void print_H()
{
for(int row = 1; row<=9; row++)
{
    for(int col = 1; col<=5; col++)
    {
    if(col == 5 || row == 5 || col == 1 || col == 9)
    System.out.print(" *");
    else
    System.out.print("  ");
    }
System.out.println();
}
}
}
