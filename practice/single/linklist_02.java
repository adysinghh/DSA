package practice.single;

class Node {
    int data;
    Node next;
    Node(int d, Node n) {
        this.data = d;
        this.next = n;
    }

    Node(int d) {
        this.data = d;
        this.next = null;
    }
}

public class linklist_02 {
   public static void main(String[] args) {
         int[] arr = {11, 2, 3, 4, 5};
         Node head = arrayToLinkedList(arr);
        //  Node nHead = deletefirst(head);
        //  traverse(nHead);
        //  Node lastH = deleteLast(head);
        Node lastH = deleteK(head, 3);
        traverse(lastH);
   }

   public static Node arrayToLinkedList (int[] arr) {
        Node head = new Node(arr[0]);
        Node move = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            move.next = temp;
            move = move.next;
        }

        return head;
    }

    public static Node deletefirst (Node head) {
        head = head.next;
        return head;
    }

    public static Node deleteLast(Node head) {
        // If list is empty
        if (head == null) {
            return null;
        }

        // If list has only one node
        if (head.next == null) {
           return null;
        }

        Node move = head;
        // stop at the second-last node
        while (move.next.next != null) {
            move = move.next;
        }

        // remove the last node
        move.next = null;

        return head; // return updated head
    }

    public static Node deleteK (Node head, int data) {
    d
    }



    public static void traverse (Node head) {
        Node move = head;

        while (move != null) {
            System.out.print(move.data + " ");
            move = move.next;
        }
    }
}


