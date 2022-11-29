import java.util.Scanner;

class ArrayProgram28
{
public static void main(String[] args)
{
ArrayProgram28.Matrix_Addition();
}
static void Matrix_Addition()
{
Scanner sc = new Scanner(System.in);
int[][] matrix = new int[2][2];
int[][] matrix2 = new int[2][2];
int[][] add = new int[2][2];
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
for(int row = 0; row<add.length; row++)
{
for(int col = 0; col<add[row].length; col++)
{
add[row][col] = matrix[row][col] + matrix2[row][col];
System.out.print(add[row][col]+" ");
}
System.out.println();
}
}
}
