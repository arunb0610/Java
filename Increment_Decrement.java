class Increment_Decrement // pre Increment and post Increment,  pre Decrement and post Decrement
{
public static void main(String[] args)
{
Increment_Decrement.find_total();
}
static void find_total()
{
int no1 = 10, no2 = 20 ;
System.out.println(no1++ - ++no1 + no1-- - --no1 + no2++ - ++no2 + no2-- + --no2);
}
}
