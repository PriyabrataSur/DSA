class LinkedListNode{

	Node head; 
	static class Node{

		int data;
		Node next;
		Node(int data){

			this.data = data;
			this.next = null;
		}
	}

	public static LinkedListNode insert(LinkedListNode list, int data){

		Node newNode = new Node(data);
		if(list.head == null){

			list.head = newNode;
		}else{

			Node dummy = list.head;
			while(dummy.next!= null){				//

				dummy = dummy.next;
			}

			dummy.next = newNode;					//
		}
		return list;
	}

	public static void print(LinkedListNode list){

		Node dummy = list.head;
		while(dummy != null){

			System.out.println(dummy.data);
			dummy = dummy.next;
		}
	}

	public static boolean search(LinkedListNode list, int data){

		Node dummy = list.head; 
		while(dummy != null){
		
			if(dummy.data == data){

				return true ;
			}
			dummy = dummy.next;
		}
	
		return false; 
	}

	public static LinkedListNode insertFirst(LinkedListNode list, int data){

		Node firstNode = new Node(data);
		firstNode.next = list.head;
		list.head = firstNode;
		return list;
	}

	public static LinkedListNode reverse(LinkedListNode list){

		Node prev = null ;
		Node current = list.head;
		Node next = list.head.next;

		while(current.next != null){

			current.next = prev; 
			prev = current ;
			current = next;
			next = current.next;
		}
		current.next = prev;
		list.head = current;
		return list;
	}

}

public class LinkedListNew{
	public static void main(String[] args){

		LinkedListNode list = new LinkedListNode();
		list = LinkedListNode.insert(list, 10);
		list = LinkedListNode.insert(list, 20);
		list = LinkedListNode.insert(list, 30);
		list = LinkedListNode.insert(list, 40);
		list = LinkedListNode.insert(list, 50);

		LinkedListNode.print(list);

		boolean a = LinkedListNode.search(list, 20);
		System.out.println(a);

		boolean b = LinkedListNode.search(list, 15);
		System.out.println(b);

		list = LinkedListNode.insertFirst(list, 60);

		LinkedListNode.print(list);

		LinkedListNode.reverse(list);

		System.out.println(".....................................");

		LinkedListNode.print(list);
		
	}
}