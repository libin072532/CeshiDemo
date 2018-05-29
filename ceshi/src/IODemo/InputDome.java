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
					bre = new BufferedReader(new FileReader(file));//��ʱ��ȡ����bre���������ļ��Ļ�����
					String str;
					while ((str = bre.readLine())!= null) // �ж����һ�в����ڣ�Ϊ�ս���ѭ��
					{
					System.out.println(str);//ԭ���������������
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
							  
						     //read()���ص��ǵ����ֽ����ݣ��ֽ����ݿ���ֱ��ר��int����)������read(buf)���ص��Ƕ�ȡ�����ֽ��������������ݱ�����buf��
							        while ((hasRead = file.read(buf)) > 0) {
						         //ÿ����ཫ1024���ֽ�ת�����ַ���������tmp2.txt�е��ַ�С��1024������һ�ξͶ�����
							             //ѭ������ = �ļ��ַ��� ���� buf����
							            System.out.println(new String(buf, 0 ,hasRead));
								             /*
							            * ���ֽ�ǿ��ת�����ַ�������������ʵ�ֺ�����һ����Ч�����������Դ�ļ������ĵĻ����ܻ�����
							             
							            for (byte b : buf)    {
							                char ch = (char)b;
							                if (ch != '\r')
							               System.out.print(ch);
							          }
							           */
							     }
							      //��finally����close����ȫ
							        file.close();
				} catch (IOException e) {
					// TODO: handle exception
				}
				
				
			}
			
}
