package trees;

//二叉树
public class Mains {
	
	//创建
	public Node CreateTree(String exp) {
		Node[] nodes = new Node[3];
		Node b=null, p = null;  
		int top =-1,k=0,j=0;
		char[] exps = exp.toCharArray();  
        char data = exps[j];  
			 while(j<exps.length-1) {
				 switch(data) {
				 case '(':  
		                top++;  
		                nodes[top] = p;  
		                k = 1;  
		                break;  
		            case ')':  
		                top--;  
		                break;  
		            case ',':  
		                k = 2;  
		                break;  
		            default:  
		            p= new  Node(data,null,null);
		            if(b==null) {
		            	b=p;
		            }else {
		            	  switch (k) {  
		                    case 1:  
		                    			nodes[top].setLchild(p);  
		                        break;  
		                    case 2:  
		                        nodes[top].setRchild(p);  
		                        break;  
		                    }  
		            }
				 }
				 
				 j++;
				 data =exps[j];
			 }
		                       
		 return b;  
	}
	
	
	
	/**
	 * 前序遍历
	 * 
	 * @param node
	 */
	public void PreOrder(Node node) {
		if (node == null) {
			return;
		} else {
			System.out.print(node.getData() + " ");
			PreOrder(node.getLchild());
			PreOrder(node.getRchild());	 

		}
	}

	/**
	 * 中序遍历
	 * 
	 * @param node
	 */
	public void InOrder(Node node) {
		if (node == null) {
			return;
		} else {
			InOrder(node.getLchild());
			System.out.print(node.getData() + " ");
			InOrder(node.getRchild());
		}
	}

	/**
	 * 后序遍历
	 * 
	 * @param node
	 */
	public void PostOrder(Node node) {
		if (node == null) {
			return;
		} else {
			PostOrder(node.getLchild());
			PostOrder(node.getRchild());
			System.out.print(node.getData() + " ");
		}
	}

}
