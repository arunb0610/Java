package practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTask3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		RegexTask3 rt2 = new RegexTask3();
		rt2.regexTask3();
	}

	private void regexTask3() throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		File f = new File("/home/arunb/Desktop/Task2");
		f.mkdir();
		File f2 = new File("/home/arunb/Desktop/copy.txt");
		
		FileWriter fw = new FileWriter(f2,true);
		
		System.out.println("How many files do you want to create?");
		int len = sc.nextInt();
		
		File[] files = new File[len];
		for(int i = 0; i<files.length; i++)
		{
			files[i] = new File("/home/arunb/Desktop/Task2/file"+i+".txt");
			files[i].createNewFile();
		}
		
		FileWriter[] fiwr = new FileWriter[files.length];
		for(int i = 0; i<fiwr.length; i++)
		{
			fiwr[i] = new FileWriter(files[i]);
			System.out.println("Write the content that you want to write in a file and press enter : ");
			String content = sc.nextLine();
			fiwr[i].write(content);
			fiwr[i].flush();
			fiwr[i].close();
		}
		
		FileReader[] frar = new FileReader[fiwr.length];
		BufferedReader[] brar = new BufferedReader[frar.length];
		
		for(int i = 0; i<brar.length; i++)
		{
			frar[i] = new FileReader(files[i]);
			brar[i] = new BufferedReader(frar[i]);
			String[] read = new String[brar.length];
			read[i] = brar[i].readLine();
			Pattern check = Pattern.compile("(0|91)?[0-9]{10}");
			
			while(read[i]!=null)
			{
				Matcher match = check.matcher(read[i]);
				if(match.find())
				{
					fw.write("\n"+match.group());
				}
				read[i] = brar[i].readLine();
			}
				
		}
		fw.flush();
		fw.close();
		
	}

}
