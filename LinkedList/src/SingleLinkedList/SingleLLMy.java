package SingleLinkedList;

public class SingleLLMy {

	public class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	public static Node head;
	public static Node tail;
	
	
	public void addFirst(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=tail=newNode;
			return;
		}
		newNode.next=head;
		
		head=newNode;
		
	}
	
	public void addLast(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=tail=newNode;
			return;
		}
		
		tail.next=newNode;
		tail=newNode;
	}
	
	public void printLL() {
		if(head==null) {
			System.out.println("LinkedList is Empty");
			return;
		}
		Node temp=head;
		while(temp!=null) {
		
		System.out.print(temp.data+" ");
		temp=temp.next;
		}
	}
	
	public void add(int idx,int data) {
		Node newNode=new Node(data);
		if(idx==0) {
		  addFirst(data);
		  return;
		}
		Node temp=head;
		int i=0;
		while(i<idx-1) {
			temp=temp.next;
			i++;
		}
		newNode.next=temp.next;
		temp.next=newNode;
	}
	
	
	
	

}

 
