class Square_Number
{
public static void main(String[] args)
{
Square_Number sn = new Square_Number();
sn.square_number();
}
void square_number()
{
int num = 1;
while(num<=10)
{
int square = (num*num);
System.out.println("The value of "+num+" square is "+square);
num = num+1;
}
}
}
