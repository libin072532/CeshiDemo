package IODemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputDome {

	
	public static void FileOutputStreamTest(String inpath,String outpath) throws FileNotFoundException, IOException {
			//�ж��Ƿ����file
				File file  = new File(outpath);
				if(file.exists()) {
					file.delete();
				}else {
					file.createNewFile();
				}
		try (     	 
                //��try()�д��ļ����ڽ�β�Զ��ر�
                FileInputStream fis = new FileInputStream(inpath);       		
                FileOutputStream fos = new FileOutputStream(outpath);
                ) {
            byte[] buf = new byte[4];
            int hasRead = 0;
            while ((hasRead = fis.read(buf)) > 0) {
                //ÿ��ȡһ�ξ�дһ�Σ������پ�д����
                fos.write(buf, 0, hasRead);
            }
            System.out.println("write success");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
