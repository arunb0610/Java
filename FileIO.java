package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileIO fio = new FileIO();
		//fio.list();
		//fio.listFiles();
		//fio.write();
		//fio.writePara();
		//fio.read();
		fio.bufferRead();
		
	}

	private void bufferRead() throws IOException {
		// TODO Auto-generated method stub
		File f = new File("/home/arunb/Desktop/sample.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String r = br.readLine();
		while(r!=null)
		{
			System.out.println(r);
			r = br.readLine();
		}
	}

	private void read() throws Exception {
		// TODO Auto-generated method stub
		File f = new File("/home/arunb/Desktop/sample.txt");
		FileReader fr = new FileReader(f);
		int r = fr.read();
		while(r!=-1)
		{
			System.out.print((char)r);
			r = fr.read();
		}
	}

	private void writePara() throws IOException {
		// TODO Auto-generated method stub
		File f = new File("/home/arunb/Desktop/sample.txt");
		FileWriter fw = new FileWriter(f,true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("\n2) String Introduction \n"
				+ "3) String class important methods\n"
				+ "4) count of one character in a given String\n"
				+ "5) Count of vowels in a given String\n"
				+ "6) Printing only the numbers present in a String \n"
				+ "7) Count of each character in a given String\n"
				+ "8) Finding duplicate characters in a given String\n"
				+ "9) count of total number of occurrences of a given char. in a string without using loop\n"
				+ "10) Reversing a given String\n"
				+ "11) Palindrome\n"
				+ "12) Convert String to charArray\n"
				+ "13) Convert String to Integer\n"
				+ "14) Convert Char. Array to String\n"
				+ "15) String in immutable \n"
				+ "16) String comparison\n"
				+ "17) Count of words in given String\n"
				+ "18) Change only the first letter of a given String to upper case \n"
				+ "19) Change upper case to Lower case in a given String\n"
				+ "20) Two Strings are anagram or not\n"
				+ "21) Find first non repeated character of a given String\n"
				+ "22) Find the char. which occurred the highest times in a given String\n"
				+ "23) Sort elements in Dictionary Order (Lexicographical)\n"
				+ "24) Find last non repeated character in a given String\n"
				+ "25) finding if adjacent characters are same and printing only those in a given array ");
		bw.newLine();
		bw.write("\nEnd");
		bw.flush();
		bw.close();
	}

	private void write() throws IOException {
		// TODO Auto-generated method stub
		File f = new File("/home/arunb/Desktop/sample.txt");
		FileWriter fw = new FileWriter(f);
		fw.write("Arun Kumar");
		fw.write("\n");
		fw.write("Gowtham");
		fw.flush();
		fw.close();
	}

	private void listFiles() {
		// TODO Auto-generated method stub
		File f = new File("/home/arunb/Java");
		File[] files = f.listFiles();
		for(File filename:files)
		{
			System.out.println(filename);
		}
	}

	private void list() {
		// TODO Auto-generated method stub
		File f = new File("/home/arunb/Java");
		String[] files = f.list();
		for(String filename:files)
		{
			System.out.println(filename);
		}
	}

}
