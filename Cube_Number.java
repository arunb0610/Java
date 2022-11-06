class Cube_Number
{
public static void main(String[] args)
{
Cube_Number cn = new Cube_Number();
cn.cube_number();
}
void cube_number()
{
int num = 1;
while(num<=4)
{
int cube = num*num*num;
System.out.println("The value of "+num+" cube is "+cube);
num = num+1;
}
}
}
