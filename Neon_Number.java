class Neon_Number
{
public static void main(String[] args)
{
Neon_Number nn = new Neon_Number();
nn.find_neon_number();
}
void find_neon_number()
{
int num = 9;
int neon = 0;
int square = num*num;
while(square>0)
{
int rem = square%10;
neon = neon + rem;
square = square/10;
}
if(neon == num)
{
System.out.println("It is a Neon Number");
}
else
{
System.out.println("It is not a Neon Number");
}
}
}
