class Theatre
{
public static void main (String[] args)
{
    Theatre Raja = new Theatre();
    int Balance = Raja.BookTicket(200);
    System.out.println(Balance);
}
int BookTicket(int Price)
{
    int TicketPrice = 120;
    int Balance =  Price - TicketPrice;
    System.out.println("After booking ticket :"+ Balance);
    return Balance;
}
}
