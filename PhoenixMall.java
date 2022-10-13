class PhoenixMall
{
  static String Address = "Phoenix Mall" ;//Static variables 
  static int OpeningTime = 9 ;//Static variables 
  static boolean AC = true ;//Static variables 
  String MovieName ;//Instance variables 
  int MovieTime ;//Instance variables 
  boolean MovieHit ;//Instance variables 
  
  public static void main (String[] args)
{
  PhoenixMall screen1 = new PhoenixMall();
  screen1.MovieName = "Ponniyin Selvan";
  screen1.MovieTime = 10 ;
  screen1.MovieHit = true ;
    
  PhoenixMall screen2 = new PhoenixMall();
  screen2.MovieName = "Naanae Varuven";
  screen2.MovieTime = 11 ;
  screen2.MovieHit = false ;
    
  PhoenixMall screen3 = new PhoenixMall();
  screen3.MovieName = "VTK";
  screen3.MovieTime = 10 ;
  screen3.MovieHit = true ;
    
  PhoenixMall screen4 = new PhoenixMall();
    
  System.out.println("Movie name is : "+  screen1.MovieName + " , Movie Time is : " + screen1.MovieTime + " , Movie is hit : "+ screen1.MovieHit);
    
  System.out.println("Movie name is : "+  screen2.MovieName + " , Movie Time is : " + screen2.MovieTime + " , Movie is hit : "+ screen2.MovieHit);
    
  System.out.println("Movie name is : "+  screen3.MovieName + " , Movie Time is : " + screen3.MovieTime + " , Movie is hit : "+ screen3.MovieHit);
    
  System.out.println("Movie name is : "+  screen4.MovieName + " , Movie Time is : " + screen4.MovieTime + " , Movie is hit : "+ screen4.MovieHit);//JDK assume its default value
}
}
