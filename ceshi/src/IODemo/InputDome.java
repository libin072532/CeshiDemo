package IODemo;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputDome {
	
			public void BufferedReaderTest(String path) {
				File file =new File(path);			
				try {
					BufferedReader bre = null;
					bre = new BufferedReader(new FileReader(file));//此时获取到的bre就是整个文件的缓存流
					String str;
					while ((str = bre.readLine())!= null) // 判断最后一行不存在，为空结束循环
					{
					System.out.println(str);//原样输出读到的内容
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
			
			public void FileInputStreamTest(String  path) {	
				try {
					 FileInputStream file = new FileInputStream(path);
						byte[] buf = new byte[1024];
							        int hasRead = 0;
							  
						     //read()返回的是单个字节数据（字节数据可以直接专程int类型)，但是read(buf)返回的是读取到的字节数，真正的数据保存在buf中
							        while ((hasRead = file.read(buf)) > 0) {
						         //每次最多将1024个字节转换成字符串，这里tmp2.txt中的字符小于1024，所以一次就读完了
							             //循环次数 = 文件字符数 除以 buf长度
							            System.out.println(new String(buf, 0 ,hasRead));
								             /*
							            * 将字节强制转换成字符后逐个输出，能实现和上面一样的效果。但是如果源文件是中文的话可能会乱码
							             
							            for (byte b : buf)    {
							                char ch = (char)b;
							                if (ch != '\r')
							               System.out.print(ch);
							          }
							           */
							     }
							      //在finally块里close更安全
							        file.close();
				} catch (IOException e) {
					// TODO: handle exception
				}
				
				
			}
			
}
