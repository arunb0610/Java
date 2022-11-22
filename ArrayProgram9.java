public class ArrayProgram9 {

	public static void main(String[] args) {
		ArrayProgram9 ap = new ArrayProgram9();
		ap.printingSmallElement();
        System.out.println();
	}

	private void printingSmallElement() {
		int[] marks = {92,82,94,89,78};
        int small = Integer.MAX_VALUE;
		for(int i = 0; i<marks.length; i++)
		{
            if(marks[i]<small)
            small = marks[i];
		}
        System.out.println("Highest number in an array is "+small);
	}

}

