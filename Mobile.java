class Mobile extends Telephone
{
int price = 15000 ;
String name = "Mobile" ;

Mobile()
{
    System.out.println("Mobile class constructor");
}
public void sms()
{
    System.out.println("Messaging Facility"); 
}
public void access()
{
    System.out.println("Accessed");
}
public static void main (String[] args)
{
    Mobile samsung = new Mobile();
    Mobile bsnl = new Mobile();
    samsung.call();
    samsung.receive_call();
    samsung.sms();
    bsnl.call();
    bsnl.receive_call();
{
    System.out.println(samsung.price);
    System.out.println(samsung.name);
    System.out.println(bsnl.price);
    System.out.println(bsnl.name);
}

}
}
