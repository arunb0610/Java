package practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.*;

public class RegexTask {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		RegexTask rt = new RegexTask();
		rt.regex_Task();
	}

	private void regex_Task() throws IOException {
		// TODO Auto-generated method stub
		File f = new File("/home/arunb/Desktop/info(i).txt");
		f.createNewFile();
		
		File f2 = new File("/home/arunb/Desktop/copy.txt");
		f2.createNewFile();
		
		FileWriter fw = new FileWriter(f);
		FileWriter fw2 = new FileWriter(f2);
		
		fw.write("Name : ArunKumar\n"
				+ "Mobile no : 7299565636\n"
				+ "Mail ID : stylewalker.ak@gmail.com");
		fw.flush();
		fw.close();
		
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		String read = br.readLine();
		Pattern patternobj = Pattern.compile("(0|91)?[6-9][0-9]{9}");
				
		while(read!=null)
		{
			Matcher matcherobj = patternobj.matcher(read);
			if(matcherobj.find())
			{
				fw2.write(matcherobj.group());
			}
			read = br.readLine();
		}
		fw2.flush();
		fw2.close();
		
		FileReader fr2 = new FileReader(f2);
		BufferedReader br2 = new BufferedReader(fr2);
		String read2 = br2.readLine();
		while(read2!=null)
		{
			System.out.println(read2);
			read2 = br2.readLine();
		}

		
		
	}

}
