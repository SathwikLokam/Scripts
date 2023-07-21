public class SingleLinkedList {
    Node head = null;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            next = null;
        }
    }

    public int addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public addLast(String data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
        
    }

    public void print() {
        Node curPos = head;
        if (head == null) {
            System.out.println("No data found");
        }
        do {
            System.out.println(curPos.data);
            curPos = curPos.next;
        } while (curPos != null);

    }

    public boolean isExits(String data) {
        Node curPos = head;
        if (curPos == null) {
            System.out.println("No data found");

        }
        do {
            if (curPos.data == data)
                return true;
            curPos = curPos.next;
        } while (curPos != null);
        return false;
    }

    public int length() {
        int len = 0;
        Node curNode = head;
        if (curNode == null) {
            System.out.println("No data found");
            return 0;
        }
        do {
            len++;
            curNode = curNode.next;
        } while (curNode != null);
        return len;
    }

    public void deleteByPosition(int position) {
        Node curNode = head;
        if (position > length()) {
            System.out.println("No element in the position");
            return;
        }
        position -= 1;
        while (--position > 0) {
            curNode = curNode.next;
        }
        while (curNode != null)
            ;
    }

    public void deleteByValue(String data) {
        Node preNode = head, curPos = head;
        if (curPos == null) {
            System.out.println("No data found");
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        do {
            if (curPos.data == data) {
                preNode.next = curPos.next;
                return;
            }
            preNode = curPos;
            curPos = curPos.next;
        } while (curPos != null);

    }

    public void deleteFirst() {
        if (length() == 0) {
            System.out.println("No data found");
            return;
        }
        head = head.next;
    }

    public void deleteLast() {
        Node curNode = head, preNode = head;
        if (curNode == null) {
            System.out.println("No sata found");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        do {
            preNode = curNode;
            curNode = curNode.next;
        } while (curNode.next != null);
        preNode.next = null;
    }

    public static void main(String args[]) {
        SingleLinkedList list = new SingleLinkedList();
        list.addLast("sathwik");
        list.addFirst("dat");
        list.addLast("is");
        list.addLast("a");
        list.addLast("fool");
        list.deleteLast();
        list.deleteFirst();
        list.print();
    }
}