package linked_lists;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Stacks
		Stack s = new Stack();
		s.push(5);
		s.push(7);
		s.push(10);
		s.push(12);
		System.out.print("Inital Print: ");s.print();
		s.pop();
		s.pop();
		System.out.print("Print after two pops: ");s.print();
		s.pop();
		System.out.print("Print after three pops: ");s.print();
		End Stacks*/
		
	 /* Insert After and Remove*/
		LinkedList li = new LinkedList();
		li.insert(6);
		li.insert(8);
		li.insert(200);
		li.insert(9);
		li.print();
		li.insertAfter(6,7);
		li.print();
		li.remove(200);
		li.print();
		li.mthtolast(5);
		
		
	}

}
