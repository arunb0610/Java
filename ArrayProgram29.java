import java.util.Scanner;

class ArrayProgram29
{
public static void main(String[] args)
{
ArrayProgram29.Matrix_Multiplication();
}
static void Matrix_Multiplication()
{
Scanner sc = new Scanner(System.in);
int[][] matrix = new int[2][2];
int[][] matrix2 = new int[2][2];
int[][] mul = new int[2][2];
for(int row = 0; row<matrix.length; row++)
{
for(int col = 0; col<matrix[row].length; col++)
{
System.out.print("Enter Number : ");
matrix[row][col] = sc.nextInt();
}
System.out.println();
}
for(int row = 0; row<matrix2.length; row++)
{
for(int col = 0; col<matrix2[row].length; col++)
{
System.out.print("Enter Number : ");
matrix2[row][col] = sc.nextInt();
}
System.out.println();
}
for(int row = 0; row<mul.length; row++)
{
for(int col = 0; col<mul[row].length; col++)
{
mul[row][col] = matrix[row][col] * matrix2[row][col] + matrix[row][col] * matrix2[row][col];
System.out.print(mul[row][col]+" ");
}
System.out.println();
}
}
}
