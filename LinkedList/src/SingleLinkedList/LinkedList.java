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
	public static int size;
	
	
	//Add At First
	
	public void addFirst(int data) {
		//step1--create new node
		Node newNode=new Node(data);
		size++;
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
		size++;
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
	
	// Add at position
	
	public void add(int idx,int data) {
		if(idx==0) {
			addFirst(data);
			return;
		}
		Node newNode=new Node(data);
		size++;
		Node temp=head;
		int i=0;
	
		while(i<idx-1) {
			temp = temp.next;
			i++;
		}
		newNode.next=temp.next;
		temp.next=newNode;
}
	//Removed from First
	
	public int removeFirst() { 
		if(size==0) {
			System.out.println("LL Is Empty");
			return -1;
		}
		if(size==1) {
			int val=head.data;
			head=tail=null;
			size=0;
			return val;
		}		
		int val=head.data;
		head=head.next;
		size--;
		return val;		
	}
	
	//Removed from last
	
	public int removeLast() {
		if(size==0) {
			System.out.println("LL is Empty");
			return -1;
		}
		else if(size==1) {
			int val=head.data;
			head=tail=null;
			size=0;
			return val;
		}
		
		Node prev=head;
		int val=tail.data;
		for(int i=0;i<size-2;i++) {
			prev=prev.next;
		}
		prev.next=null;
		tail=prev;
		size--;
		return val;
	}
	
	
	
}



