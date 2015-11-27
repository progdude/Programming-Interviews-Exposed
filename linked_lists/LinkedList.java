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
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public boolean remove(int x){
		Node temp = head;
		
		if(head.data == x){
			head = head.next;
			temp.next = null;
			return true;
		}
		
		while(temp!=null){
			if(temp.next.data == x){
				temp.next = temp.next.next;
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	public void insert(int x){
		Node temp = head;
		
		if(head == null){
			head = new Node(x);
			return;
		}
	
		while(temp.next!=null){
			temp=temp.next;
		}
		
		temp.next = new Node(x);
		
	}
	
	public boolean insertAfter(int x, int y){
		Node temp = head;
		
		while(temp!=null){
			if(temp.data == x){
				Node t = temp.next;
				temp.next = new Node(y);
				temp.next.next = t;
				return true;
			}
			temp=  temp.next;
		}
		return false;
		
	}

	
}
