package practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTask2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		RegexTask2 rt = new RegexTask2();
		rt.regexTask2();
	}

	private void regexTask2() throws IOException {
		// TODO Auto-generated method stub
		File f = new File("/home/arunb/Desktop/Task");
		f.mkdir();
		File f2 = new File("/home/arunb/Desktop/copy.txt");
		
		FileWriter fw = new FileWriter(f2,true);
		
		
		File ff1 = new File("/home/arunb/Desktop/Task/file1.txt");
		ff1.createNewFile();
		File ff2 = new File("/home/arunb/Desktop/Task/file2.txt");
		ff2.createNewFile();
		File ff3 = new File("/home/arunb/Desktop/Task/file3.txt");
		ff3.createNewFile();
		File ff4 = new File("/home/arunb/Desktop/Task/file4.txt");
		ff4.createNewFile();
		File ff5 = new File("/home/arunb/Desktop/Task/file5.txt");
		ff5.createNewFile();
		
		FileReader fr1 = new FileReader(ff1);
		FileReader fr2 = new FileReader(ff2);
		FileReader fr3 = new FileReader(ff3);
		FileReader fr4 = new FileReader(ff4);
		FileReader fr5 = new FileReader(ff5);
		
		BufferedReader br1 = new BufferedReader(fr1);
		String read1 = br1.readLine();
		BufferedReader br2 = new BufferedReader(fr2);
		String read2 = br2.readLine();
		BufferedReader br3 = new BufferedReader(fr3);
		String read3 = br3.readLine();
		BufferedReader br4 = new BufferedReader(fr4);
		String read4 = br4.readLine();
		BufferedReader br5 = new BufferedReader(fr5);
		String read5 = br5.readLine();
		
		Pattern check = Pattern.compile("(0|91)?[6-9][0-9]{9}");
		
		while(read1!=null)
		{
			Matcher match = check.matcher(read1); 
			if(match.find())
			{
				fw.write("\n"+match.group());
			}
			read1 = br1.readLine();
		}
		fw.flush();
		fw.close();


	}

}
