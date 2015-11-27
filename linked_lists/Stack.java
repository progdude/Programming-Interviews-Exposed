package linked_lists;

public class Stack {
	LinkedList linkedStack = new LinkedList();
	
	public int pop(){
		if(!linkedStack.empty()){
			return linkedStack.removeBegin().data;
		}
		return 0;
	}
	
	public void push(int data){
		linkedStack.insertBegin(data);
	}
	
	public void print(){
		//for testing purposes
		linkedStack.print();
	}
	
}
