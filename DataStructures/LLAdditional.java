package DataStructures;

class LinkedListsAdditional {
    //scratch implementation
    Node head;
    private int size;

    LinkedListsAdditional () {
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null) {
            return null;
        }


        int size = 0;
        ListNode temp = head;
        while(temp != null) {
            temp = temp.next;
            size++;
        }

        //removing SIZEth node from last i.e. head
        if(n == size) {
            return head.next;
        }

        //find previous node
        int ptf = size - n; // position to find
        ListNode prev = head; // previous node
        int cp = 1; // current position

        while(cp != ptf) {
            prev = prev.next;
            cp++;
        }

        prev.next = prev.next.next;
        return head;
    }
    public ListNode getMiddle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) {
            return true;
        }

        ListNode firstHalfEnd = getMiddle(head);
        ListNode secondHalfStart = reverse(firstHalfEnd.next);
        ListNode firstHalfStart = head;

        while(secondHalfStart != null) {
            if(secondHalfStart.val != firstHalfStart.val) {
                return false;
            }
            secondHalfStart = secondHalfStart.next;
            firstHalfStart = firstHalfStart.next;
        }

        return true;
    }
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow) {
                return true;
            }
        }

        return false;
    }
    public static void main(String args[]) {
        LinkedListsAdditional list = new LinkedListsAdditional();
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
