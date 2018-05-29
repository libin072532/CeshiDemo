package trees;

import java.util.ArrayList;
import java.util.List;

public class test {

	
	public static void main(String[] arg) {
//		String exp="A(B(D(H,G)),C(E,F))";
//		Mains mains = new Mains();
//		Node tress = mains.CreateTree(exp);
//		mains.PreOrder(tress);
//		System.out.println();
// 		mains.InOrder(tress);
//		System.out.println();
// 		mains.PostOrder(tress);
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		for (String item : list) {
		if ("1".equals(item)) {
		list.remove("1");
		}
		}
		System.out.println(list.get(0));
		}
}
