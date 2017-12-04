package linkedlist;

public class LinkedList<T> {

    class Node<T> {
        private T item;
        private Node<T> next; // recursive data structure

        /**
         * @param value
         * @param next
         */
        public Node(T value, Node<T> next) {
            setValue(value);
            setNext(next);
        }

        public T getValue() {
            return item;
        }

        public void setValue(T value) {
            item = value;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "Value: " + item;
        }
    }

    private Node<T> head;
    private int size;

    {
        head = null;
        size = 0;
    }

    public LinkedList() {
    }

    public int size() {
        return size;
    }

//    public void add(T value) {
//        head = addToEnd(head, value);
//        size++;
//    }

    public void add(T value){
        Node newItem = new Node<>(value,null);

        if (head == null){
            head = newItem;
        } else {
            Node<T> node = head;
            while(node.getNext() != null){
                node = node.getNext();
            }
            node.setNext(newItem);
        }
        size++;
    }

    private Node<T> addToEnd(Node<T> node, T value) {
        if (node == null) {
            return new Node<>(value, null);
        } else if (node.getNext() == null) {
            node.setNext(new Node<>(value, null));
        } else {
            addToEnd(node.getNext(), value);
        }
        return node;
    }

    @Override
    public String toString() {
        return "[" + listToString(head) + "]";
    }

    private String listToString(Node<T> node) {
        if (node == null) {
            return "";
        } else {
            return node + " " + listToString(node.getNext());
        }
    }
}
