package IODemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputDome {

	
	public static void FileOutputStreamTest(String inpath,String outpath) throws FileNotFoundException, IOException {
			//判断是否存在file
				File file  = new File(outpath);
				if(file.exists()) {
					file.delete();
				}else {
					file.createNewFile();
				}
		try (     	 
                //在try()中打开文件会在结尾自动关闭
                FileInputStream fis = new FileInputStream(inpath);       		
                FileOutputStream fos = new FileOutputStream(outpath);
                ) {
            byte[] buf = new byte[4];
            int hasRead = 0;
            while ((hasRead = fis.read(buf)) > 0) {
                //每读取一次就写一次，读多少就写多少
                fos.write(buf, 0, hasRead);
            }
            System.out.println("write success");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
