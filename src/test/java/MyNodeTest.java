import javapractice.MyNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyNodeTest {
    @Test
    public void given3NumberWhenLinkedShouldPassedLinkedListTest() {

        MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        boolean result = myFirstNode.getNext().equals(mySecondNode) &&
               mySecondNode.getNext().equals(myThirdNode);
        Assert.assertTrue(result);
         }

    }
