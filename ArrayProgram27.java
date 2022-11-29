import java.util.Scanner;

class ArrayProgram27
{
public static void main(String[] args)
{
ArrayProgram27.Multi_dimensional_Array();
}
static void Multi_dimensional_Array()
{
Scanner sc = new Scanner(System.in);
int[][] marks = new int[3][5];
int maths = 0, highest = Integer.MIN_VALUE;
for(int row = 0; row<marks.length; row++)
{
int total = 0;
for(int col = 0; col<marks[row].length; col++)
{
System.out.print("Enter Marks : ");
marks[row][col] = sc.nextInt();
total = total + marks[row][col];
if(col == 2)
{
maths += marks[row][col];
}
if(total>highest)
{
highest = total;
}
}
System.out.println("Total is "+total);
System.out.println();
}
System.out.println("Average in Maths is : "+maths/3);
System.out.println("Highest Total is : "+highest);
}
}
