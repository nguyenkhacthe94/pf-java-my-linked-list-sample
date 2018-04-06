public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    public MyLinkedList() {
    }

    public void add(int index, E element) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E e) {
        Node temp = head;
        Node holder;
        while (temp.next != null) {
            int i = 0;
            temp = temp.next;
            i++;
        }
        holder = temp.next;
        temp.next = new Node(e);
        temp.next.next = holder;
        numNodes++;
    }

    public E remove(int index) {
        Node temp = head;
        int i = 0;
        while (temp != null && i < index) {
            temp = temp.next;
            i++;
        }
        while (temp.next != null && i == index) {
            temp.data = temp.next.data;
        }
        return (E) temp;
    }

    public boolean remove(Object e) {
    }

    public int size() {
        Node temp = head;
        int size = 1;
        while (temp.next != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    public E clone() {
    }

    public boolean contains(E o) {
        boolean isContain = false;
        Node temp = head;
        while (temp != null) {
            if (o == temp.data) {
                isContain = true;
                break;
            }
            temp = temp.next;
        }
        return isContain;
    }

    public int indexOf(E o) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (o != temp.data) {
                index++;
                temp = temp.next;
            }
            else return index;
        }
        return index;
    }

    public boolean add(E e) {

    }

    public void ensureCapacity(int minCapacity) {
    }

    public E get(int index) {
        Node temp=head;
        for(int i=0; i<index; i++) {
            temp = temp.next;
        }
        return (E) temp;
    }

    public E getFirst() {
        return (E) head;
    }

    public E getLast() {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return (E) temp;
    }

    public void clear() {
        Node temp = head;
        while (temp!= null) {
            temp.data = null;
            temp = temp.next;
        }
    }
}
