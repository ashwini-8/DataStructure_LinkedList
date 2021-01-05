import javapractice.INode;
import javapractice.MyNode;
import javapractice.MyStack;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyStackTest {
    @Test
    public void given3NumbersWhenAddedToStackShouldHaveLastAddedNode() {
        MyNode<Integer> myfirstNode = new MyNode<Integer>(70);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
        MyStack myStack = new MyStack();
        myStack.push(myfirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.printStack();
        INode peek = myStack.peak();
        Assert.assertEquals(myThirdNode,peek);

    }
}