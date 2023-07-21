public class StackLinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void print() {
        Node curPos = head;
        if (curPos == null) {
            System.out.println("No data");
            return;
        }
        do {
            System.out.print(curPos.data + " ");
            curPos = curPos.next;
        } while (curPos != null);
        System.out.println();
    }

    public void pop() {
        if (head == null) {
            System.out.println("Stack Underflow");
            return;
        }
        head = head.next;
    }

    public static void main(String args[]) {
        StackLinkedList stack = new StackLinkedList();
        stack.pop();
        stack.print();
    }
}