package SingleLinkedList;

public class LinkedList {
	
	public static class Node{
		int data;
		Node next;
	
	
	public Node(int data) {
		this.data=data;
		this.next=null;
	}
}
	public static Node head;
	public static Node tail;
	
	
	//Add At First
	
	public void addFirst(int data) {
		//step1--create new node
		Node newNode=new Node(data);
		if(head==null)//can write like this also(head==tail==null)but we prefer only head 
			{
			head=tail=newNode;
			return;
		}	
		//step2--newNode next=head
		newNode.next=head;// in next, reference/address of head is stored,later even if head variable value changes then no problem because in next we stored current address value in next 
		
		//step3--head=newNode
		head=newNode;
	}
	
	
	//Add At Last
	
	public void addLast(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=tail=newNode;
			return;
		}
		tail.next=newNode;
		tail=newNode;}
	
	
	// Print LL
	
	public void printLL() {
		if(head==null) {
			System.out.println("LL is Empty");
			return;
		}
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
}



