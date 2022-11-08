class PhoenixMall
{
  static String Address = "Phoenix Mall" ;//Static variables 
  static int OpeningTime = 9 ;//Static variables 
  static boolean AC = true ;//Static variables 
  String movieName ;//Instance variables 
  int movieTime ;//Instance variables 
  boolean movieHit ;//Instance variables 
  
  public static void main (String[] args)
{
  PhoenixMall screen1 = new PhoenixMall();
  screen1.movieName = "Ponniyin Selvan";
  screen1.movieTime = 10 ;
  screen1.movieHit = true ;
    
  PhoenixMall screen2 = new PhoenixMall();
  screen2.movieName = "Naanae Varuven";
  screen2.movieTime = 11 ;
  screen2.movieHit = false ;
    
  PhoenixMall screen3 = new PhoenixMall();
  screen3.movieName = "VTK";
  screen3.movieTime = 10 ;
  screen3.movieHit = true ;
    
  PhoenixMall screen4 = new PhoenixMall();
    
  System.out.println("Movie name is : "+  screen1.movieName + " , Movie Time is : " + screen1.movieTime + " , Movie is hit : "+ screen1.movieHit);
    
  System.out.println("Movie name is : "+  screen2.movieName + " , Movie Time is : " + screen2.movieTime + " , Movie is hit : "+ screen2.movieHit);
    
  System.out.println("Movie name is : "+  screen3.movieName + " , Movie Time is : " + screen3.movieTime + " , Movie is hit : "+ screen3.movieHit);
    
  System.out.println("Movie name is : "+  screen4.movieName + " , Movie Time is : " + screen4.movieTime + " , Movie is hit : "+ screen4.movieHit);//JDK assume its default value
}
}
