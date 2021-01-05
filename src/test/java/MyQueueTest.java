import javapractice.INode;
import javapractice.MyNode;
import javapractice.MyQueue;
import javapractice.MyStack;
import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest {
    @Test
    public void given3NumbersWhenAddedToQueueShouldHaveAddedtoQueue() {
        MyNode<Integer> myfirstNode = new MyNode<Integer>(70);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(myfirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        myQueue.printQueue();

        boolean result= myQueue.getHead().equals(myfirstNode)&&
                myQueue.getHead().getNext().equals(mySecondNode)&&
                myQueue.getTail().equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3NumbersWhenPopedFromQueueShouldHaveBeenDeletedFromQueue() {
        MyNode<Integer> myfirstNode = new MyNode<Integer>(70);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(myfirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        myQueue.printQueue();
        myQueue.dequeue();
        myQueue.printQueue();
        boolean result=
                myQueue.getHead().equals(mySecondNode)&&
                        myQueue.getTail().equals(myThirdNode);
        Assert.assertTrue(result);
    }
}
