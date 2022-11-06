class Find_Factorial
{
public static void main(String[] args)
{
Find_Factorial ff = new Find_Factorial();
ff.find_factorial(5);
}	private int find_factorial(int max) {
		int fact = 1; 
		int no = 1; 
		while(no<=max)
		{
		fact = fact * no; 
		no = no+1; 
		}
		System.out.println("Factorial  is " + fact); 
		
		return fact; 
		
	}
}
