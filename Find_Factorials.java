class Find_Factorials
{
public static void main(String[] args)
{
Find_Factorials ff = new Find_Factorials();
ff.find_factorials(5);
}
 void find_factorials(int max) {

		while(max>=1)
		{
		int fact = 1; 
		int no = 1; 
		while(no<=max)
		{
		fact = fact * no; 
		no = no+1; 
		}
		System.out.println("Factorial  is " + fact); 
		max = max -1; 
		}
		
	}
}


