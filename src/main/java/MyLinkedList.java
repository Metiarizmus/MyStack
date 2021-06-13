public class MyLinkedList<T>  {

    private static class Node<T> {

        private T data;

        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

    private Node<T> first = null;


    public void addFirst(T data) {
        Node<T> newFirst = new Node<T>(data);
        newFirst.next = first;
        first = newFirst;
    }


    public T removeFirst() {
        Node<T> oldFirst = first;
        first = first.next;
        return oldFirst.data;
    }

    public T getLast() {
        return (T) first;
    }

    @Override
    public String toString() {
        StringBuilder listBuilder = new StringBuilder();
        Node currentNode = first;
        while (currentNode != null) {
            listBuilder.append(currentNode).append(",");
            currentNode = currentNode.next;
        }
        return listBuilder.toString();
    }

    public boolean isEmpty() {
        return first == null;
    }
}
