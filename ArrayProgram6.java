public class ArrayProgram6 {

	public static void main(String[] args) {
		ArrayProgram6 ap = new ArrayProgram6();
		ap.printingEvenElement();
        System.out.println();
	}

	private void printingEvenElement() {
		int[] marks = {92,82,94,89,78};
		for(int i = 0; i<marks.length; i++)
		{
            if(marks[i]%2 == 0)
			System.out.print(marks[i]+" ");
		}
	}

}

