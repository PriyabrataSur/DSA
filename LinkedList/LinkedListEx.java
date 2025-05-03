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

	
	public static LinkedListNode insert(LinkedListNode list,int data){

		Node newNode = new Node(data);
		
		if(list.head == null){
			list.head = newNode;
		}else{
			Node dummy = list.head;
			while(dummy.next != null){
				dummy = dummy.next;
			}
			dummy.next = newNode;
		}

		return list;
	
	}

	public static void traversal(LinkedListNode list){
		Node dummy = list.head;

		while(dummy != null){
			System.out.println(dummy.data);
			dummy = dummy.next;
			
		}	
	}

}

public class LinkedListEx{

	public static void main(String[] args){

		LinkedListNode list = new LinkedListNode();

		list = LinkedListNode.insert(list,10);
		list = LinkedListNode.insert(list,20);
		list = LinkedListNode.insert(list,30);

		LinkedListNode.traversal(list);


	}

}