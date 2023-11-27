package SingleLinkedList;

public class SingleLLTest {

	public static void main(String[] args) {
			LinkedList ll=new LinkedList();
			ll.addFirst(1);
			ll.addFirst(2);
			ll.addLast(3);
			ll.addLast(4);
			ll.printLL();
			ll.add(2, 9);
			ll.printLL();
			System.out.println("Removed:"+ ll.removeFirst());
			ll.printLL();
			System.out.println("removed from last:"+ll.removeLast());
			ll.printLL();
	}

}
