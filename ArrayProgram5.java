public class ArrayProgram5 {

	public static void main(String[] args) {
		ArrayProgram5 ap = new ArrayProgram5();
		ap.printingOddElement();
        System.out.println();
	}

	private void printingOddElement() {
		int[] marks = {92,82,94,89,78};
		for(int i = 0; i<marks.length; i++)
		{
            if(marks[i]%2 != 0)
			System.out.print(marks[i]+" ");
		}
	}

}

