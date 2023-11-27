package DoublyLL;

public class DoublyLL {
	
	public static class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int data){
			this.data=data;
			this.next=null;
			this.prev=null;
		}
		}
		public static Node head;
		public static Node tail;
		public static int size;
	
		
		public void addFirst(int data) {
			Node newNode=new Node(data);
			size++;
			if(head==null) {				
				head=tail=newNode;				
				return;				
			}			
			newNode.next=head;
			head.prev=newNode;
			head=newNode;	
		}
		
		public void addLast(int data) {
			Node newNode =new Node(data);
			size++;
			if(head==null) {
				head=tail=newNode;
				return;
			}
			tail.next=newNode;
			newNode.prev=tail;
			tail=newNode;			
		}
		public void printLL() {
			Node temp=head;
			
			while(temp!=null) {
				System.out.print(temp.data+"<->");
				temp=temp.next;
			}
			System.out.println("null");
		}
	
		public int removeFirst() {
			
			if(size==0) {
				System.out.println("LL is Empty"); 
				return -1;
			}
			int val=head.data;
			head=head.next;
			head.prev=null;
			size--;
			return val;		
			}

		public int removeLast() {
			
			if(size==0) {
				System.out.println("LL is Empty");
				return -1;
			}
			int val=tail.data;
			tail=tail.prev;
			tail.next=null;
			size--;
			return val;
		}
	
		
	}
	

