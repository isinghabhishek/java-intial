import java.util.*;

public class SLinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) { // O(1)
        // step-1 Create new Node
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }

        // step-2 newNode head
        newNode.next = head;

        //step-3
        head = newNode;
    }

    public void addLast(int data) { // O(1)
        // step-1 create a Node(newNode)
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            return;
        }

        // step-2 tail.next --> newNode
        tail.next = newNode;

        //step-3 tail --> newNode
        tail = newNode;
    }

    public void printLinkedList() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void add(int idx, int data) {
        if(idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i=0;
        while(i < idx-1) {
            temp = temp.next;
            i++;
        }

        // i = idx-1; tem --> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int remove(int data) {
        if(size == 0) {
            System.out.println("LL is Empty");
            return -1;
        }

        public void reverse() {
            Node prev = null;
            Node curr = tail = head;
            Node next;
            
            while(curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
        }
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);        
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);

    }
}
