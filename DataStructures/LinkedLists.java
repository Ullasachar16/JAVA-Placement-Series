package DataStructures;

public class LinkedLists {
    //Linked List Example
    //Scratch Implementation

    Node head;
    private int size;

    LinkedLists () {
        this.size = 0;
    }
    public class Node {
        String data;
        Node next;
        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node lastNode = head;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }
    public void printList() {
        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public void removeFirst() {
        if(head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }
        head = this.head.next;
        size--;
    }
    public void removeLast() {
        if(head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }
        size--;
        if(head.next == null) {
            head = null;
            return;
        }
        Node currNode = head;
        Node lastNode = head.next;
        while(lastNode.next != null) {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
        currNode.next = null;
    }
    public int getSize() {
        return size;
    }

    public static void main(String args[]) {
        LinkedLists list = new LinkedLists();
        //add at last
        list.addLast("is");
        list.addLast("a");
        list.addLast("list");
        list.printList();
        //add at first
        list.addFirst("this");
        list.printList();
        System.out.println(list.getSize());
        //remove at first
        list.removeFirst();
        list.printList();
        //remove at last
        list.removeLast();
        list.printList();
    }
}
