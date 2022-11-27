
/**
 * Implements the node of a doubly linked list of integers.
 *
 * @author Jerrick Wong // Code is derived from Class Slides
 */
public class Node
{

    private int info;
    private Node next;
    private Node prev;

    public Node() {
        info =0;
        next=null;
        prev=null;
    }

    public int getInfo()
    {
        return info;  //DUMMY CODE; TO IMPLEMENT
    }

    public Node getNext()
    {
        return next;    //DUMMY CODE; TO IMPLEMENT
    }

    public Node getPrev()
    {
        return prev;    //DUMMY CODE; TO IMPLEMENT
    }

    public void setInfo(int i)
    {
        info=i;
    }

    public void setNext(Node n)
    {
        next=n;
    }

    public void setPrev(Node p)
    {
        prev=p;
    }

}
