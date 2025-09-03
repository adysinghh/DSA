package practice;

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

public class linkedlist {
    public static void main(String[] args) {
        int[] arr = {11, 2, 3, 4, 5};
        Node head = arrayToLinkedList(arr);
        traverse(head);


        Node found = search(head, 18);
        if (found == null) System.err.println("\nNot Found");
        else System.err.println("\nFound: " + found.data);
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

    public static void traverse (Node head) {
        Node move = head;

        while (move != null) {
            System.out.print(move.data + " ");
            move = move.next;
        }
    }

    public static Node search (Node head, int target) {
        Node move = head;

        while (move != null) {
            if (move.data == target) {
                return move;
            } else {
                move = move.next;
            }
        }

        return move;
    }
}
