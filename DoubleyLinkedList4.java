package doubleyLinkedList;
class Node4{
	Node prev;
	int data;
	Node next;
}

public class DoubleyLinkedList4 {
	Node head;
	public void addlast(int val)
	{
		Node newNode=new Node();
		newNode.data=val;
	
		if(head==null) {
			newNode.prev=null;
			newNode.next=null;
			head=newNode;
		}
		else {
			Node last=head;
			while(last.next!=null) {
				last=last.next;
			}
			last.next=newNode;
			newNode.prev=last;
			newNode.next=null;
		}
	}
	public boolean search(int key) {
		Node temp=head;
		while(temp!=null) {
			if(temp.data==key)
				return true;
			temp=temp.next;
		}
		return false;
		
		
	}

	public static void main(String[] args) {
		DoubleyLinkedList4 list=new DoubleyLinkedList4();
		list.addlast(10);
		list.addlast(20);
		list.addlast(30);
		list.addlast(40);
		 System.out.println("Doubly Linked List: null<-10<->20<->30<->40->null");
		System.out.println("Searching element "+30);
		if(list.search(30)) {
			System.out.println("Search found");
		}
		else 
			System.out.println("search not found");
 
		System.out.println("Search element "+100);
		if(list.search(100)) {
			System.out.println("search found");
		}
		else
			System.out.println("Search not found");
	}

}
