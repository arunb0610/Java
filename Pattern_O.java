class Pattern_O
{
public static void main(String[] args)
{
Pattern_O.print_O();
}
static void print_O()
{
for(int row = 1; row<=6; row++)
{
    for(int col = 1; col<=6; col++)
    {
    if(row == 1 || row==6 || col==1 || col==6)
    System.out.print(" *");
    else
    System.out.print("  ");
    }
System.out.println();
}
}
}
