package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ceshi {
	//集合
	public static void main(String[] arg){
		//map的遍历
		
		//第一种：KeySet()
		Map map = new HashMap();
		map.put("key1","lisi1");
		map.put("key2","lisi2");
		map.put("key3","lisi3");
		//先获取map集合的所有键的set集合，keyset（）
//		Iterator it = map.keySet().iterator();
		 //获取迭代器
//		while(it.hasNext()){
//		Object key = it.next();
//		System.out.println(map.get(key));
//		}
		
		//第二种：entrySet()
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()){
			Entry e =(Entry) it.next();
			System.out.println("键"+e.getKey () + "的值为" + e.getValue());
			}
//		推荐使用第二种方式，即entrySet()方法，效率较高。
//		对于keySet其实是遍历了2次，一次是转为iterator，
//		一次就是从HashMap中取出key所对于的value。而entryset只是遍历了第一次，
//		它把key和value都放到了entry中，所以快了。两种遍历的遍历时间相差还是很明显的
		
	}
}
