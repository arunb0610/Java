package pattern_programs;

class Pattern2
{
public static void main(String[] args)
{
Pattern2 p2 = new Pattern2();
p2.pattern2();
}
void pattern2()
{
for(int row = 1; row<=5; row++)
{
    for(int col=1; col<=6-row; col++)
        {
        System.out.print(col+" ");
        }
System.out.println();
}
}
}
