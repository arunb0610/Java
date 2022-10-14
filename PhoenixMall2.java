class PhoenixMall2
{
  String MovieName ;//Instance variables 
  int MovieTime ;//Instance variables 
  boolean MovieHit ;//Instance variables 
  PhoenixMall2 (String MovieName , int MovieTime , boolean MovieHit)
{
  this.MovieName = MovieName;
  this.MovieTime = MovieTime;
  this.MovieHit = MovieHit;
}
  PhoenixMall2()
{

}
  public static void main (String[] args)
{
  PhoenixMall2 screen1 = new PhoenixMall2("Ponniyin Selvan" , 10 , true);
    
  PhoenixMall2 screen2 = new PhoenixMall2("Naanae Varuven" , 11 , false);
    
  PhoenixMall2 screen3 = new PhoenixMall2("VTK" , 10 , true);
    
  PhoenixMall2 screen4 = new PhoenixMall2();
  screen1.show();
  screen2.show();
  screen3.show();
  screen4.show();
}
void show()
{
    
  System.out.println("Movie name is : "+ MovieName + " , Movie Time is : " +  MovieTime + " , Movie is hit : "+ MovieHit);

}
}

