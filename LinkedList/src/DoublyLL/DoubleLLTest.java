package DoublyLL;

public class DoubleLLTest {

	public static void main(String[] args) {
		
		DoublyLL dll=new DoublyLL();
		dll.addFirst(1);
		dll.addFirst(2);
		dll.addFirst(3);
		dll.addFirst(4);
		dll.printLL();
		dll.addLast(5);
		dll.printLL();
		System.out.println("Removed Element:"+dll.removeFirst());
		dll.printLL();
		System.out.println("Removed Element:"+dll.removeLast());
		dll.printLL();

	}

}
