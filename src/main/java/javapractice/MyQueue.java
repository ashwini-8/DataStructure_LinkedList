package javapractice;

public class MyQueue {
    private final MyLinkedList myLinkedList;

    public MyQueue() {
        this.myLinkedList = new MyLinkedList();
    }

    public void enqueue(INode myNode) {
        myLinkedList.append(myNode);
    }

    public INode getHead() {
        return this.myLinkedList.getHead();
    }

    public INode getTail() {
        return this.myLinkedList.getTail();
    }

    public void printQueue() {
        myLinkedList.printMyNode();
    }

    public void dequeue() {
        myLinkedList.pop();
    }
}

