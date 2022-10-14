class SuperMarket
{

int price, discount; 
String brand; 

SuperMarket (String brand, int price, int discount)

{    
    this.brand = brand; 
    this.price = price;  
    this.discount = discount;
}
SuperMarket (String brand, int price) // parameterized constructor

{          
    this.brand = brand; 
    this.price = price; 
}
SuperMarket() // Zero-args or no-args constructor

{

}
public static void main(String[] args)

{
    SuperMarket brush = new SuperMarket("Pepsodent", 30, 5); 
    SuperMarket soap = new SuperMarket("Lux", 25, 2);
    SuperMarket rice = new SuperMarket("Ponni", 50);
    SuperMarket boost = new SuperMarket(); 
    brush.purchase(); 
    soap.purchase();
    rice.purchase(); 
}
void purchase()
{
    System.out.println("Customer is buying product "+ brand + " for Rs. "+ price + " with discount "+ discount); 
}

}
