class ActorSivakumar implements Actor
{

static String address = "coimbatore";

ActorSivakumar(int age,String carbrand)
{
System.out.println("Sivakumar age is : "+age);
System.out.println("Sivakumar carbrand is : "+carbrand);
}

ActorSivakumar()
{
System.out.println("Zero arg constructor");
}

public static void main(String[] args)
{
ActorSivakumar as = new ActorSivakumar(65,"Audi car");
as.act();
as.dance();
as.sing();
as.speaking();
System.out.println("Actor sivakumar address is :"+as.address);

Actor ac = new ActorSivakumar();
System.out.println("For actors makeup required : "+ac.makeupRequired);
System.out.println("Actors living place is :"+ac.address);
}

public void act()
{
System.out.println("He is a good actor");
}

public void dance()
{
System.out.println("Dancing on a stage");
}

public void sing()
{
System.out.println("singing");
}

void speaking()
{
System.out.println("speaking");
}
}
