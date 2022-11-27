
/**
 * The class Deque implements a double-ended queue with a doubly linked list.
 * The list uses a header and a trailer (dummy) nodes.
 *
 * @author Jerrick Wong 6235276 // Code is partially derived from class slides
 */
public class Deque
{

    /**
     * Default constructor. Sets this object as an empty deque.
     *
     */
    public Deque()
    {
        front = new Node();
        back = new Node();
        front.setNext(back);
        back.setPrev(front);
        count = 0;
    }

    /**
     * Adds new element to the back end of the deque. The method takes O(1)
     * time.
     *
     * @param x new element to be added to the deque.
     */

    public void addToBack(int x)
    {
        Node newValue = new Node();
        newValue.setInfo(x);
        if (front.getNext() == back){
            front.setNext(newValue);
        }
        if(count!=0){
            back.getPrev().setNext(newValue);
        }

        newValue.setPrev(back.getPrev());
        newValue.setNext(back);
        back.setPrev(newValue);
        count++;
    }

    /**
     * Adds new element to the front end of the deque. The method takes O(1)
     * time.
     *
     * @param x new element to be added to the deque.
     */

    public void addToFront(int x)
    {
        Node newValue = new Node();

        newValue.setInfo(x);
        if (back.getPrev() == front){
            back.setPrev(newValue);
        }
        if(count!=0){
            front.getNext().setPrev(newValue);
        }
        newValue.setNext(front.getNext());
        newValue.setPrev(front);
        front.setNext(newValue);
        count++;
    }

    /**
     * Retrieves element on the back end of the deque. The method takes O(1)
     * time.
     *
     * @return operation is successful: valid = true and item = element on the
     * back end; operation is unsuccessful (i.e. empty deque): valid = false and
     * item = dummy value
     */

    public DequeItem getBack()
    {
        int lastValue=0;
        boolean empty=true;
        if(back.getPrev()==front){
            empty= false;
        }else{
            lastValue=back.getPrev().getInfo();
        }
        return new DequeItem(empty,lastValue);


       //DUMMY CODE; TO IMPLEMENT
    }

    /**
     * Retrieves element on the front end of the deque. The method takes O(1)
     * time.
     *
     * @return operation is successful: valid = true and item = element on the
     * front end; operation is unsuccessful (i.e. empty deque): valid = false and
     * item = dummy value
     */

    public DequeItem getFront()
    {
        int firstValue=0;
        boolean empty=true;
        if(front.getNext()==back){
            empty= false;
        }else{
            firstValue=front.getNext().getInfo();
        }
        return new DequeItem(empty,firstValue);


        //DUMMY CODE; TO IMPLEMENT
    }


    /**
     * Determines if deque is empty. The method takes O(1) time.
     *
     * @return true if deque contains no elements, false otherwise.
     */

    public boolean isEmpty()
    {


        return front.getNext()==back;   //DUMMY CODE; TO IMPLEMENT
    }

    /**
     * Removes element on the back end of the deque. The method takes O(1) time.
     *
     * @return false if removal cannot be performed (i.e. the deque is empty),
     * true otherwise
     */

    public boolean removeBack()
    {

        if(back.getPrev()==front){
            return false;
        }
        Node newBack=back.getPrev().getPrev();
        back.setPrev(newBack);
        count--;
        return true;   //DUMMY CODE; TO IMPLEMENT
    }

    /**
     * Removes element on the front end of the deque. The method takes O(1)
     * time.
     *
     * @return false if removal cannot be performed (i.e. the deque is empty),
     * true otherwise
     */

    public boolean removeFront()
    {
        if(front.getNext()==back){
            return false;
        }
        Node newFront=front.getNext().getNext();
        front.setNext(newFront);
        count--;
        return true;//DUMMY CODE; TO IMPLEMENT
    }

    /**
     * Constructs a String description of the deque.
     *
     * @return String containing the deque elements.
     */
    public String toString()
    {
        String str = "";

        Node current = front.getNext();
        for (int i = 0; i < count - 1; i++)
        {
            str += current.getInfo() + ", ";
            current = current.getNext();
        }

        if (count != 0)
            return "Deque: [" + str + back.getPrev().getInfo() + "]";
        else
            return "Deque: []";
    }

    private int count;  //number of elements in the deque
    private Node back;  //points to the item in the back
    private Node front; //points to the item in the front
}
