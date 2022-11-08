class Programming_Basics
{
public static void main(String[] args)
{
Programming_Basics pb = new Programming_Basics();
pb.calculate_amount();
pb.dosai_count(8);
pb.beats(1024);
}

void calculate_amount()
{
int amount = 0 ;
int day = 0 ;
while(day<=10)
{
amount = amount + day ;
day = day + 1 ;
System.out.println("on "+day+" the amount is "+amount);
}
System.out.println("Total amount is :"+amount);
}
void dosai_count(int dosai)
{
int count = 3 ;
while(count>=1)
{
dosai = dosai + dosai/2;
count = count-1;
}
System.out.println("Total dosai is :"+dosai);
}
void beats(int count)
{
int man = 0 ;
while(count>1)
{
count = count/2;
man = man+1 ;
System.out.println(man+" got "+count+" beats.");
}
}
}
