public class ProiorityQueue {
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void add(int data)
    {
        System.out.println(data);
        Node newNode=new Node(data);
        Node curNode=head;
        if(head==null)
        {
            head=newNode;
            return;
        }
        if(head.next==null)
        {
            if(newNode.data<head.data)
            {
                newNode.next=head;
                head=newNode;
            }
            else
            {
               head.next=newNode;
            }
            return;
        }
        while(curNode.next!=null)
        {
            System.out.println("dnoaso");
            if(curNode.next.data>newNode.data && curNode.data<newNode.data)
            {
                newNode=curNode.next;
                curNode.next=newNode;
                return;
            }
        curNode=curNode.next;
        }
        curNode.next=newNode;
    }
    public void print()
    {
        Node curPos=head;
        if(curPos==null)
        {
            System.out.println("No data");
            return;
        }
        do
        {
            System.out.print(curPos.data+" ");
            curPos=curPos.next;
        }while(curPos!=null);
    }


    //Main mathod
    public static void main(String args[])
    {
        ProiorityQueue pq=new ProiorityQueue();
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(25);
        //pq.print();
    }
}