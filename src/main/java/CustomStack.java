import java.util.LinkedList;

public class CustomStack<T> {

    private final MyLinkedList linkedList = new MyLinkedList<>();

    public void push(T data) {
        linkedList.addFirst(data);
    }

    public T pop() {
        return (T) linkedList.removeFirst();
    }

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public String toString() {
        return linkedList.toString();
    }

    public T peek(){
        return (T) linkedList.getLast();
    }
}
