package assignment4;



public class Node extends ElementType{

	       private ElementType info;   
	       private Node next;  
	       private Node prev;

	       public Node() {
	           info = null;
	           next = null;
	           prev = null;
	       }
	       public Node(ElementType info, Node prev , Node next) {
	    	   this.info = info;
	    	   this.prev= prev;
	    	   this.next = next;
	       }
	     
	       public void setInfo(ElementType e) {
	           info = e;
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

	       public ElementType getInfo() {
	           return info;
	       }

	       public Node getNext() {
	           return next;
	       }
	   }


