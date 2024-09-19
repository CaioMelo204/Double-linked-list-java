public class DoubleLinkedList {
    private Node head;
    private Node tail;
    int length = 0;

    public void push(int data) {
        Node newNode = new Node(data);
        Node current = tail;
        if (head == null) {
            head = newNode;
            tail = head;
        } else {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public int pop() {
        if (tail == null) {
            return -1;
        }
        int data = tail.data;
        tail = tail.prev;
        tail.next = null;
        length--;
        return data;
    }

    public void unshift(int data) {
        Node newNode = new Node(data);
        Node current = head;
        if (head == null) {
            head = newNode;
            tail = head;
        } else {
            newNode.next = current;
            current.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public int shift() {
        if (head == null) {
            return -1;
        }
        int del = head.data;
        head = head.next;
        head.prev = null;
        length--;
        return del;
    }

    public void insert(int data, int position) {
        if (position >= length || position < 0) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 0) {
            unshift(data);
            return;
        }

        if (position == length - 1) {
            push(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
        }
        newNode.prev = current;
        newNode.next = current.next;
        current.next.prev = newNode;
        current.next = newNode;
        length++;
    }

    public int remove(int position) {
        if (position >= length || position < 0) {
            System.out.println("Invalid position");
            return -1;
        }

        if (position == 0) {
            return shift();
        }

        if (position == length - 1) {
            return pop();
        }

        Node current = head;
        for (int i = 0; i < position; i++) {
            current = current.next;
        }
        current.prev.next = current.next;
        current.next.prev = current.prev;
        current.next = null;
        current.prev = null;
        length--;
        return current.data;
    }

    public void traverse() {
        Node current = head;
        System.out.print("Traversal of linked list: ");
        while (current != null) {
            System.out.print("[ " + current.data + " ] -> ");
            current = current.next;
        }
        System.out.println();
    }

    public void backTraverse() {
        Node current = tail;
        System.out.print("Traversal of linked list backwards: ");
        while (current != null) {
            System.out.print("[ " + current.data + " ] -> ");
            current = current.prev;
        }
        System.out.println();
    }
}
