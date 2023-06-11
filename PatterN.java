class PatterN
{
public static void main (String[] args)
{
int n = 5; 
for(int row = 1; row < n; row ++)
{
for(int col = n; col>(n+1)-row; col--)
{
System.out.print(col+" ");
}
for(int col = row; col<=n; col++)
{
System.out.print((n+1)-row+" ");
}
for(int col = row; col<n-1; col++)
{
System.out.print((n+1)-row+" ");
}
for(int col = (n+1)-row; col<=n; col++)
{
System.out.print(col+" ");
}
System.out.println();
}
for(int row = 1; row <= n; row ++)
{
for(int col = n; col>row; col--)
{
System.out.print(col+" ");
}
for(int col = 1; col<row; col++)
{
System.out.print(row+" ");
}
for(int col = 1; col<row; col++)
{
System.out.print(row+" ");
}
for(int col = row; col<=n; col++)
{
System.out.print(col+" ");
}
System.out.println();
}
}
}
