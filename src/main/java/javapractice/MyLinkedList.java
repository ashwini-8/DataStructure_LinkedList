package javapractice;

public class MyLinkedList {
    public INode tail;
    public INode head;
    private static int counter;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
     }

    public void add(INode newNode) {
       if(this.tail == null){
           this.tail = newNode;
       }
       if(this.head ==null){
           this.head =newNode;
       }else {
           INode tempNode = this.head;
           this.head = newNode;
           this.head.setNext(tempNode);
       }
    }
    public void printMyNode() {
        StringBuffer myNodes = new StringBuffer("My Nodes: ");
        INode tempNode = head;
        while (tempNode.getNext() != null){
            myNodes.append(tempNode.getKey());
            if(!tempNode.equals(tail)) myNodes.append("->");
            tempNode = tempNode.getNext();

        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }

    public void append(INode myNode) {
        if(this.head == null){
            this.head = myNode;
        }
        if(this.tail == null){
            this.tail = myNode;
        }else {
            this.tail.setNext(myNode);
            this.tail = myNode;
        }
    }

    public void insert(INode myNode ,INode newNode) {
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    public INode pop() {
        INode tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    public INode popLast(){
        INode tempNode = this.head;
        while(!tempNode.getNext().equals(tail)){
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tempNode= tempNode.getNext();
        return tempNode;
    }

    public INode search(INode index) {
        INode tempNode = head;
        while (tempNode != null) {
            tempNode = tempNode.getNext();
            if (tempNode.equals(index))
                return tempNode;
        }
        return null;
    }

    public INode delete(INode index) {


        if (head.equals(index)) {
            INode node = head;
            head = head.getNext();
            return node;
        }
        INode tempNode= head;
        while (!tempNode.getNext().equals(index)) {
            tempNode = tempNode.getNext();
        }
        INode temp = tempNode.getNext();
        tempNode.setNext(tempNode.getNext().getNext());
        decrementCounter();
        return temp;

    }
    private static int getCounter() {
        return counter;
    }
    private static void incrementCounter() {
        counter++;
    }

    private void decrementCounter() {
        counter--;
    }

    public int size() {
        return getCounter();
    }

    public INode sortList(INode index) {

        if (head.equals(index)) {
            INode node = head;
            head = head.getNext();
            return node;
        }
        INode tempNode= head;
        while (!tempNode.getNext().equals(index)) {
            tempNode = tempNode.getNext();
        }
        INode temp = tempNode.getNext();
        tempNode.setNext(tempNode.getNext().getNext());
        return temp;
    }

    public INode getHead() {
        return head;
    }

    public INode getTail() {
        return tail;
    }
}
