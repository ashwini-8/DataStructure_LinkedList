import javapractice.INode;

public abstract class MyNode<K> implements INode<K> {
    private  K key;
    private  MyNode next;
    @Override
    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    public MyNode() {
        this .key = null;
        this.next= null;
    }
}
