package linked_lists;

public class LinkedList {
	Node head=null;
	
	public void insertBegin(int data){
		Node h = new Node(data);
		h.next = head;
		head = h;
	}
	
	public Node removeBegin(){
		Node h = head;
		head = head.next;
		return h;
	}
	
	public boolean empty(){
		if(head==null){
			return true;
		}
		return false;
	}
	
	public void print(){
		Node temp = head;
		while(temp.next!=null){
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	
}
