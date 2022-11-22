public class ArrayProgram7 {

	public static void main(String[] args) {
		ArrayProgram7 ap = new ArrayProgram7();
		ap.printing_odd_Index_Element(); //Printing odd index and odd element
System.out.println();
        ap.printing_Even_Index_Element();//Printing even index and even element
        System.out.println();
	}

	private void printing_odd_Index_Element() {
		int[] marks = {92,82,94,89,77};
		for(int i = 0; i<marks.length; i++)
		{
            if(marks[i]%2 != 0 && i%2 != 0)
			System.out.print(marks[i]+" ");
		}
	}
	private void printing_Even_Index_Element() {
		int[] marks = {92,82,94,89,77};
		for(int i = 0; i<marks.length; i++)
		{
            if(marks[i]%2 == 0 && i%2 == 0)
			System.out.print(marks[i]+" ");
		}
	}

}

