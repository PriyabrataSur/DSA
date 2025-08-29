class LnkdLstNode{

	Node head ;

	static class Node{

		int data;
		Node next ;
		Node(int data){
			this.data = data;
			this.next = next;
		}
	}

	public static LnkdLstNode insert(LnkdLstNode lst, int data){

		Node node1 = new Node(data);
	
		if(lst.head == null){
			lst.head = node1;
		}else{
			Node dummy = lst.head;
			while(dummy.next != null){
				dummy = dummy.next;
			}
			dummy.next = node1;
		}
		return lst;
	}
	
	public static void traversal(LnkdLstNode lst){

		Node dummy = lst.head;

		while(dummy != null){
			System.out.println(dummy.data);
			dummy = dummy.next;
			
		}	
	}

	public static LnkdLstNode insertFirst(LnkdLstNode lst, int data){
	
		Node nodeInsrt = new Node(data);
		
		if(lst.head == null){
			lst.head = nodeInsrt;
		}else{

		nodeInsrt.next = lst.head;
		lst.head=nodeInsrt;
		}

		return lst;

		
	}


}


public class LnkdLst{
	public static void main(String[] args){
		
		LnkdLstNode list1 = new LnkdLstNode();
		list1 = LnkdLstNode.insert(list1, 11);
		list1 = LnkdLstNode.insert(list1, 21);
		list1 = LnkdLstNode.insert(list1, 31);
		
		list1 = LnkdLstNode.insertFirst(list1, 41);

		LnkdLstNode.traversal(list1);
	}	
}