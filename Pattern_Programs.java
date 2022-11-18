

public class Pattern_Programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern_Programs p1 = new Pattern_Programs();
		p1.pattern1();
		System.out.println();
		p1.pattern2();
		System.out.println();
		p1.pattern3();
		System.out.println();
		p1.pattern4();
	}

	private void pattern4() {
		// TODO Auto-generated method stub
		for(int row = 1; row<= 5; row++)
		{
			for(int col = 1; col<=row; col++)
			{
				System.out.print("  ");
			}
			for(int col = 1; col<= 6-row; col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

	private void pattern3() {
		// TODO Auto-generated method stub
		for(int row = 1; row<= 5; row++)
		{
			for(int col = 1; col<= 6-row; col++)
			{
				System.out.print("  ");
			}
			for(int col = 1; col<=row; col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private void pattern2() {
		// TODO Auto-generated method stub
		for(int row = 1; row<=5; row++)
		{
			for(int col = 1; col<= 6-row; col++)
			{
				System.out.print("* ");
			
			}
			System.out.println();
		}
	}

	private void pattern1() {
		// TODO Auto-generated method stub
		for(int row = 1; row<=5; row++)
		{
			for(int col=1; col<=row; col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}

