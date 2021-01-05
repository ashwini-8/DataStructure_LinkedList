package javapractice;

public class MyStack {

    private final MyLinkedList myLinkedList;

    public MyStack() {
        this.myLinkedList = new MyLinkedList();
    }

    public void push(INode myNode) {
            myLinkedList.add(myNode);
    }

    public void printStack() {
        myLinkedList.printMyNode();
    }

}
