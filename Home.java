class Home
{
Sony hometheatre; 

public static void main(String[] args)
{
Sony laptop = new Sony(); 
Sony tv = new Sony(25000);
Sony tv2 = tv;
Sony products = new Sony(tv2);
//null
//creates an object using another object of the same Java class.
System.out.println(tv2.price);
Home appa = new Home(); 
System.out.println(appa.hometheatre);
appa.send(laptop,tv);// Passing Object as argument
}

void send(Sony lap, Sony television)
{
System.out.println("Sending");
System.out.println("Telivision price is : " + television.price);
television.price = 10000; 
}
}
