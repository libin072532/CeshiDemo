package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ceshi {
	//����
	public static void main(String[] arg){
		//map�ı���
		
		//��һ�֣�KeySet()
		Map map = new HashMap();
		map.put("key1","lisi1");
		map.put("key2","lisi2");
		map.put("key3","lisi3");
		//�Ȼ�ȡmap���ϵ����м���set���ϣ�keyset����
//		Iterator it = map.keySet().iterator();
		 //��ȡ������
//		while(it.hasNext()){
//		Object key = it.next();
//		System.out.println(map.get(key));
//		}
		
		//�ڶ��֣�entrySet()
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()){
			Entry e =(Entry) it.next();
			System.out.println("��"+e.getKey () + "��ֵΪ" + e.getValue());
			}
//		�Ƽ�ʹ�õڶ��ַ�ʽ����entrySet()������Ч�ʽϸߡ�
//		����keySet��ʵ�Ǳ�����2�Σ�һ����תΪiterator��
//		һ�ξ��Ǵ�HashMap��ȡ��key�����ڵ�value����entrysetֻ�Ǳ����˵�һ�Σ�
//		����key��value���ŵ���entry�У����Կ��ˡ����ֱ����ı���ʱ�����Ǻ����Ե�
		
	}
}
