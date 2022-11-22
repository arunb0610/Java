public class ArrayProgram2 {

	public static void main(String[] args) {
		ArrayProgram2 ap = new ArrayProgram2();
		ap.printingReverseIndex();
	}

	private void printingReverseIndex() {
		int[] marks = {92,82,94,88,78};
		for(int i = marks.length-1; i>=0; i--)
		{
			System.out.print(marks[i]+" ");
		}
	}

}

