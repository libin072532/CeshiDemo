package IODemo;

import java.io.*;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList {
	
	 	public static void main(String[] args) {
//	 		File path =new File(".");
	 		File path =new File("D:\\JavaCode\\Eclipse\\ceshi");
	 		String[] list;
	 		if(args.length	==	0)
	 			list =path.list();
	 		else
	 			list = path.list(new DirFilter(args[0]));
	 		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
	 		for (String listItem : list) {
				System.out.println(listItem);
			}
	 		 
	 		
	 	}
	 	
}
	class DirFilter implements 	FilenameFilter{
		private Pattern pattern;
		
		public DirFilter(String regex) {
				pattern =Pattern.compile(regex);
		}
		@Override
		public boolean accept(File dir, String name) {
			// TODO Auto-generated method stub
			return false;
		}
		
	}