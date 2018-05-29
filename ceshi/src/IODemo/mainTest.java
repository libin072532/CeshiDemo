package IODemo;

import java.io.IOException;

public class mainTest {

	public static void main(String[] args) {
		
		String  path = ".classpath"; 
	
//		InputDome input = new InputDome();
//		input.BufferedReaderTest(path);	
//		input.FileInputStreamTest(path);
			 
		String inpath = "intest.txt";
		String outpath = "outtest.txt";
		OutputDome outputDome = new OutputDome();
		try {
			outputDome.FileOutputStreamTest(inpath, outpath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
}
