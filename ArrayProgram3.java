public class ArrayProgram3 {

	public static void main(String[] args) {
		ArrayProgram3 ap = new ArrayProgram3();
		ap.printingEvenIndex();
	}

	private void printingEvenIndex() {
		int[] marks = {92,82,94,88,78};
		for(int i = 0; i<marks.length; i++)
		{
            if(i%2 == 0)
			System.out.print(marks[i]+" ");
		}
	}

}

