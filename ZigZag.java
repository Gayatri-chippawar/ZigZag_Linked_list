package Linked_List;

public class ZigZag {
    public static  class Node{
        int data ;
        Node next ;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void getZigZag(){
//        step 1 - get Middle
        Node mid = getMid(head);
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node rtHead = prev;
        Node lhHead = head;

        Node nextL,nextR;

        while(rtHead !=null && lhHead!=null){
            nextL = lhHead.next;
            lhHead.next = rtHead;
            nextR = rtHead.next;
            rtHead.next = nextL;

            lhHead = nextL;
            rtHead = nextR;
        }
    }
    public void addLast(int data){

        //step1:create new node
        Node newNode = new Node(data);
        //Empty linkedList
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step2:next of tail pointing to newnode
        tail.next = newNode;

        //step3:tail = newNode
        tail = newNode;
    }

    public  void printList(){//O(n)
        if(head == null){
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = head;

        while (temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args) {
        ZigZag z = new ZigZag();
        z.addLast(1);
        z.addLast(2);
        z.addLast(3);
        z.addLast(4);
        z.addLast(5);
        z.addLast(6);
        z.printList();
        z.getZigZag();
        z.printList();
    }
}
