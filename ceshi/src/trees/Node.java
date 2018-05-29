package trees;
//½ÚµãÀà
public class Node {

	private char data;
	private Node lchild;
	private Node rchild;
	public char getData() {
		return data;
	}
	public void setData(char data) {
		this.data = data;
	}
	public Node getLchild() {
		return lchild;
	}
	public void setLchild(Node lchild) {
		this.lchild = lchild;
	}
	public Node getRchild() {
		return rchild;
	}
	public void setRchild(Node rchild) {
		this.rchild = rchild;
	}
	 
	
	
	 public Node(){  
         
	    }  
	 public Node(char ch, Node rchild, Node lchild){  
		 this.data = ch;  
	        this.rchild = rchild;  
	        this.lchild = lchild;  
	    }  
	
	 public String toString() {
			return   "" + getData();  
		}
}
