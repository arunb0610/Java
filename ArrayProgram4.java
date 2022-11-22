public class ArrayProgram4 {

	public static void main(String[] args) {
		ArrayProgram4 ap = new ArrayProgram4();
		ap.printingOddIndex();
	}

	private void printingOddIndex() {
		int[] marks = {92,82,94,88,78};
		for(int i = 0; i<marks.length; i++)
		{
            if(i%2 != 0)
			System.out.print(marks[i]+" ");
		}
	}

}

