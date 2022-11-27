package assignment;


public class Node {
	 	private int info;   
	    private Node next;  
	    private Node prev;

	    public Node() {
	        info = 0;
	        next = null;
	        prev = null;
	    }
	    public Node(int info, Node prev , Node next) {
	 	   this.info = info;
	 	   this.prev= prev;
	 	   this.next = next;
	    }
	  
	    public void setInfo(int i) {
	        info = i;
	    }

	    public void setNext(Node l) {
	        next = l;
	    }
	    public void setPrev(Node previous) {
	 	   prev = previous;
	    }
	    public Node getPrev() {
	 	   return prev;
	    }

	    public int getInfo() {
	        return info;
	    }

	    public Node getNext() {
	        return next;
	    }

}
