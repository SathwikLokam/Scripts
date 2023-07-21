public class QueueLinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void enque(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = null;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void print() {
        Node curPose = head;
        if (head == null) {
            System.out.println("No data");
            return;
        }
        do {
            System.out.print(curPose.data + " ");
            curPose = curPose.next;
        } while (curPose != null);
        System.out.println();
    }

    public void deque() {
        Node curPos = head;
        if (curPos == null) {
            System.out.println("No data");
            return;
        }
        if (curPos.next == null) {
            head = null;
            return;
        }
        while (curPos.next.next != null) {
            curPos = curPos.next;
        }
        curPos.next = null;

    }

    public static void main(String[] args) {
        QueueLinkedList queue = new QueueLinkedList();
        queue.enque(100);
        queue.enque(200);
        queue.enque(300);
        queue.enque(400);
        queue.enque(500);
        queue.deque();
        queue.deque();
        queue.deque();
        queue.deque();
        queue.print();
    }
}
