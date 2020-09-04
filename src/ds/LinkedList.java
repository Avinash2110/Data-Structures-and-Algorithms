package ds;

//author- Avinash Shukla

public class LinkedList {
	
	/**
	 * Defining the LinkedList Data structure
	 * It has data variable which contains the integer data
	 * next variable of type LinkedList which will point to node of type itself
	 */
	int data;
	LinkedList next;
	LinkedList head;
	public LinkedList(){
		head = null;
	}
	
	
	public void insertBeginning(int data){
		LinkedList node = new LinkedList();
		node.data = data;
		
		if(head==null){
			head = node;
		}
		else{
			node.next = head;
			head = node;
		}
		
	}
	
	public void insertEnd(int data){
		LinkedList node = new LinkedList();
		node.data = data;
		
		if(head==null){
			head = node;
		}
		else{
			LinkedList temp = head;
			while(temp.next!=null){
				temp = temp.next;
			}
			temp.next = node;
		}
		
	}
	
	public void deleteBeginning(){
		if(head==null){
			System.out.println("LinkedList is already empty");
		}
		else{
			head = head.next;
		}
	}
	
	public void deleteEnd(){
		if(head==null){
			System.out.println("LinkedList is already empty");
		}
		else if(head.next==null){
			head = null;
		}
		else{
			LinkedList temp = head;
			while(temp.next.next!=null){
				temp = temp.next;
			}
			temp.next = null;
		}
	}
	
	public void print(){
		if(head==null){
			System.out.println("LinkedList is empty");
		}
		else{
			LinkedList temp = new LinkedList();
			temp = head;
			while(temp!=null){
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
		}
	}
}
