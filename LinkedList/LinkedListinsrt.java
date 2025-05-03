class LinkedListNode {

    Node head;

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public static LinkedListNode insert(LinkedListNode list, int data) {

        Node newNode = new Node(data);

        if (list.head == null) {
            list.head = newNode;
        } else {
            Node dummy = list.head;
            while (dummy.next != null) {
                dummy = dummy.next;
            }
            dummy.next = newNode;
        }

        return list;

    }

    public static void traversal(LinkedListNode list) {
        Node dummy = list.head;

        while (dummy != null) {
            System.out.println(dummy.data);
            dummy = dummy.next;

        }
    }

    public static LinkedListNode insertK(LinkedListNode list, int data) {

        Node nodeInsrt = new Node(data);
        int pos = 4, count = 0;

        if (list.head == null) {
            list.head = nodeInsrt;

        } else {
            Node dummy = list.head;

            while (dummy != null) {
                count++;
                dummy = dummy.next;

                /*Node temp  ;
                if (count == (pos - 1)) {
                    temp = dummy.next;
                }*/

                if (count == pos) {
                    nodeInsrt.next = dummy;
                    dummy.next = nodeInsrt;
                }
            }


        }
        return list ;
    }

}


    public class LinkedListinsrt {

        public static void main(String[] args) {

            LinkedListNode list = new LinkedListNode();

            list = LinkedListNode.insert(list, 10);
            list = LinkedListNode.insert(list, 20);
            list = LinkedListNode.insert(list, 30);
            list = LinkedListNode.insert(list, 40);
            list = LinkedListNode.insert(list, 50);
            list = LinkedListNode.insert(list, 60);
            list = LinkedListNode.insert(list, 70);

            LinkedListNode.traversal(list);

            list = LinkedListNode.insertK(list, 80);

            LinkedListNode.traversal(list);

        }

    }
