public class ArrayProgram8 {

	public static void main(String[] args) {
		ArrayProgram8 ap = new ArrayProgram8();
		ap.printingBigElement();
        System.out.println();
	}

	private void printingBigElement() {
		int[] marks = {92,82,94,89,78};
        int big = Integer.MIN_VALUE;
		for(int i = 0; i<marks.length; i++)
		{
            if(marks[i]>big)
            big = marks[i];
		}
        System.out.println("Highest number in an array is "+big);
	}

}

