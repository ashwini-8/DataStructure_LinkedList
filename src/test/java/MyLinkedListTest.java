import javapractice.MyLinkedList;
import javapractice.MyNode;
import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
    @Test
    public void given3NumbersWhenAddedToLinkedListShouldBeAddedToTop() {
        MyNode<Integer> myfirstNode = new MyNode<Integer>(70);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myfirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.printMyNode();
        boolean result = myLinkedList.head.equals(myThirdNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myfirstNode);
        Assert.assertTrue(result);


    }

    @Test
    public void given3NumbersWhenAppendToLinkedListShouldBeAddedToLast() {
        MyNode<Integer> myfirstNode = new MyNode<Integer>(56);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myfirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printMyNode();
        boolean result = myLinkedList.head.equals(myfirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3NumbersWhenInsertSecondInBetweenShouldPassLinkedListResult() {
        MyNode<Integer> myfirstNode = new MyNode<Integer>(56);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myfirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myfirstNode,mySecondNode);
        myLinkedList.printMyNode();
        boolean result = myLinkedList.head.equals(myfirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3NumbersShouldDeleteTheFirstElementOfSequenceShouldPassLinkedListResult() {
        MyNode<Integer> myfirstNode = new MyNode<Integer>(56);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myfirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myfirstNode,mySecondNode);
        myLinkedList.pop();
        myLinkedList.printMyNode();
        boolean result = myLinkedList.head.equals(mySecondNode) &&
                myLinkedList.head.getNext().equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3NumbersShouldDeleteTheLastElementOfSequenceAndShouldPassLinkedListResult() {
        MyNode<Integer> myfirstNode = new MyNode<Integer>(56);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(myfirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.popLast();
        myLinkedList.printMyNode();
        boolean result = myLinkedList.head.equals(myfirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3NumbersShouldSearchElementOfSequenceAndShouldPassLinkedListResult() {
        MyNode<Integer> myfirstNode = new MyNode<Integer>(56);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
        MyNode<Integer> myFourthNode = new MyNode<Integer>(40);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(myfirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(mySecondNode,myFourthNode);
        myLinkedList.printMyNode();
        boolean result = myLinkedList.head.equals(myfirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.head.getNext().getNext().equals(myFourthNode) &&
                myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3NumbersShouldDeleteElementOfSequenceAndShouldPassLinkedListResult() {
        MyNode<Integer> myfirstNode = new MyNode<Integer>(56);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
        MyNode<Integer> myFourthNode = new MyNode<Integer>(40);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(myfirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.delete(myFourthNode);
        myLinkedList.size();
        myLinkedList.printMyNode();
        boolean result = myLinkedList.head.equals(myfirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }
}
