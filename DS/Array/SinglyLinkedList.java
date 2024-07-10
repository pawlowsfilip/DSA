public class SinglyLinkedList {
    private ListNode head;
    
    private static class ListNode{
        private int data; // Generic Type
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int count() {
        if (head == null) {
            return 0;
        }

        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    public void beginningInsert(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void lastInsert(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }

        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public void positionInsert(int value, int position) {
        // create new node
        ListNode newNode = new ListNode(value);

        // if position is 1 change the
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            // else loop to the position and change insert it
        } else {
            // create a counter and helper to reach the position
            ListNode previous = head;
            int counter = 1;

            while (counter < position - 1) {
                previous = previous.next;
                counter++;
            }

            ListNode current = previous.next;
            previous.next = newNode;
            newNode.next = current;
        }
    }


    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();

        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);


        // forming a chain
        sll.head.next = second; // 10 -> 1
        second.next = third;    // 10 -> 1 -> 8
        third.next = fourth;    // 10 -> 1 -> 8 -> null
        sll.printList();

        // // print List
        // sll.printList();
        
        // // count
        // System.out.println(sll.count());

        // // beginning insert
        // sll.beginningInsert(5);
        // sll.printList();
        // sll.beginningInsert(0);
        // sll.printList();

        // // last insertion
        // sll.lastInsert(32);
        // sll.printList();
        // sll.lastInsert(365);
        // sll.printList();

        // position Insert
        sll.positionInsert(26, 3);
        sll.printList();
    }
}
