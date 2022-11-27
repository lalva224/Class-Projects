package binarySearchTrees;

/**
* @author A. Hernandez
* Data Structures and Algorithms
*/
public class BinarySearchTree
{
    public BinarySearchTree()
    {
        root = new Node();        
        root.setLeftChild(null);
        root.setRightChild(null);
        root.setInfo(-1);
    }
    public int getHeight() {
    	return getHeight(root.getLeftChild());
    }
    public int count(int x) {
    	return count(root.getLeftChild(),x);
    }
    private int count(Node p, int x) {
    	int count = 0;
    	if(p!=null) return  0;
    	else if (x==p.getInfo()) {
    		return 1 + count(p.getRightChild(),x);
    	}
    	else if(x< p.getInfo()) {
    		return  count(p.getLeftChild(),x);
    	}
    	else 
    		return count(p.getRightChild(),x);
    		
    		
    		
    		
    	}
    
    private int getHeight(Node p) {
    	if(p==null) {
    		return -1;
    	}
    	else {
    		return 1+ Math.max(getHeight(p.getLeftChild()), getHeight(p.getRightChild()));
    	}
    }
    public String toString() {
    	return toString(root.getLeftChild());
    }
    private String toString(Node p) {
    	
    	if(p!=null) {
    	return	toString(p.getLeftChild()) + 
    		String.valueOf(p.getInfo()+ " ") + 
    		toString(p.getRightChild());
    	}
    	
    	else return "";
    }

    public boolean isEmpty()
    {
        return root.getLeftChild() == null;
    }

    public void inorderDisplay()
    {
        inorderDisplay(root.getLeftChild());
        System.out.println();
    }
    public void preorderDisplay() {
    	preorderDisplay(root.getLeftChild());
    	System.out.println();
    }
    public void postorderDisplay() {
    	postorderDisplay(root.getLeftChild());
    	System.out.println();
    }

    public boolean contains(int x)
    {
        return search(x, root.getLeftChild());
    }

    public void add(int x)
    {
        if (root.getLeftChild() == null)
        {
            Node p = new Node();
            p.setNode(x, null, null);
            root.setLeftChild(p);
        } else
            insert(x, root.getLeftChild());
        
    }

    public int getMin()
    {
        return getMin(root);
    }
    public int getMax() {
    	return getMax(root.getLeftChild());
    }

    public int positiveSum() {
    	return positiveSum(root.getLeftChild());
    }
    
    private int positiveSum(Node p) {
    	int sum = 0;
    	if(p!=null && p.getInfo()>=0) {
    		sum+= p.getInfo();
    		positiveSum(p.getLeftChild());
    		positiveSum(p.getRightChild());
    	}
    	return sum;
    }

    private Node root;    //root of the bst; implemented as a dummy node.

    private void inorderDisplay(Node p)
    {
        if (p != null)
        {
            inorderDisplay(p.getLeftChild());
            System.out.print(p.getInfo() + " ");
            inorderDisplay(p.getRightChild());
        }
    }
    private void preorderDisplay(Node p) {
    	if(p!= null) {
    		System.out.print(p.getInfo()+ " ");
    		preorderDisplay(p.getLeftChild());
    		preorderDisplay(p.getRightChild());
    		
    	}
    }
    	private void postorderDisplay(Node p){
    		if(p!=null) {
    			postorderDisplay(p.getLeftChild());
    			postorderDisplay(p.getRightChild());
    			System.out.print(p.getInfo()+ " ");
    		}
    	
    }

    private boolean search(int x, Node p)
    {
        if (p == null)
            return false;
        else if (x == p.getInfo())
            return true;
        else if (x < p.getInfo())
            return search(x, p.getLeftChild());
        else
            return search(x, p.getRightChild());
    }

    private void insert(int x, Node p)
    {
        if (x < p.getInfo())
            if (p.getLeftChild() == null)
            {
                Node q = new Node();
                q.setNode(x, null, null);
                p.setLeftChild(q);
            } else
                insert(x, p.getLeftChild());
        else if (p.getRightChild() == null)
        {
            Node q = new Node();
            q.setNode(x, null, null);
            p.setRightChild(q);
        } else
            insert(x, p.getRightChild());
    }

    private int getMin(Node p)
    {
        if (p.getLeftChild() == null)
            return p.getInfo();
        else
            return getMin(p.getLeftChild());
    }
    
    private int getMax(Node p) {
    	if(p.getRightChild() == null)
    			return p.getInfo();
    	else
    		return getMax(p.getRightChild());
    }
    public void deleteMax() {
    	deleteMax(root,root.getLeftChild());
    }
    
    private void deleteMax(Node prev, Node after) {
    	if(after.getRightChild() == null) {
    		if(root.getLeftChild() == after) {
    			prev.setLeftChild(null);
    		}
    		else
    			prev.setRightChild(null);
    	}
    	else {
    		deleteMax(after,after.getRightChild());			
    	}
    }
}

