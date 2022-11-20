class Pattern_D
{
public static void main(String[] args)
{
Pattern_D.print_D();
System.out.println();
}
static void print_D()
{
for(int col=1; col<=6; col++ )
{
    System.out.print("*  ");
}
System.out.println();
for(int row = 1; row<=9; row++)
{
System.out.print("*");
System.out.print("\t\t");
System.out.println("*");
}
for(int col=1; col<=6; col++ )
{
    System.out.print("*  ");
}
}
}
