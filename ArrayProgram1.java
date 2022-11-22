public class ArrayProgram1 {

	public static void main(String[] args) {
		ArrayProgram1 ap = new ArrayProgram1();
		ap.getMarks();
	}

	private void getMarks() {
		int[] marks = {92,82,94,88,78};
		int total = 0;
		for(int i = 0; i<marks.length; i++)
		{
			System.out.print(marks[i]+" ");
			total = total + marks[i];
		}
		System.out.println();
		System.out.println("Total is :"+total);
	}

}

