package assignment4;

import app.LinkedList.Node;

public class LinkedList {
	
	   private Node first;
	   private Node tail;
	   

	   public LinkedList() {
	       first = new Node();
	       tail = new Node();
	   }

	   public boolean isEmpty() {
	       return (first == null && tail.getNext()== null );
	   }

	   public void display() {
	       Node current = first;

	      if(first!= null) {
	    	  do {
	    	  System.out.println(current.getInfo() + " ");
	    	  current = current.getNext();
	    	  }while(current!= first);
	      }

	       System.out.println();
	   }

	   public boolean search(String x) {
	       Node current = first.getNext();

	       while (current != null) {
	           if (current.getInfo().toString().contains(x)) {
	               return true;
	           }
	           current = current.getNext();
	       }

	       return false;
	   }
	   

	   public void add(ElementType x) {
		   Node newNode=new Node();
	        newNode.setInfo(x);

	        newNode.setNext(first.getNext());
	        first.setNext(newNode);
	   }
	   

	   public void remove(String e) {
		   Node current = first.getNext();
		   Node previous = first;
		   boolean stop = false;
	       while(current!=null && !stop) {
	    	   if(current.getInfo().toString().contains(e))
	    		   stop = true;
	       
	       else {
	    	   previous=current;
               current=previous.getNext();

	       }
	   }
	       if(stop) {
	    	   previous.setNext(current.getNext());;
	       }
	       
	   }
	   public int length() {
		   Node current = first.getNext();
		   int count = 0;
		   
		   while(current!= null) {
			   current = current.getNext();
			   count++;
		   }
		   return count;
	   }
	   
	   public String toString() {
	        Node current = first.getNext();

	        String str = "";
	        while (current != null) {
	            str += current.getInfo() + " -> ";
	            current = current.getNext();
	        }

	        return str;
	    }
	   
	   

	   


		   	
	   }
