class Mobile extends Telephone
{
int Price = 15000 ;
String Name = "Moble" ;

public void sms()
{
    System.out.println("Messaging Facility"); 
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
    System.out.println(samsung.Price);
    System.out.println(samsung.Name);
    System.out.println(bsnl.Price);
    System.out.println(bsnl.Name);
}
}
}
