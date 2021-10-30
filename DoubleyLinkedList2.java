package doubleyLinkedList;
class Node2{
	Node last;
	int data;
	Node next;
}

public class DoubleyLinkedList2 {
	Node head;
	public void addfirst(int val) {
		Node newNode=new Node();
		newNode.data=val;
		if(head==null) {
			newNode.prev=null;
			newNode.next=null;
			head=newNode;
		}
		else {
			newNode.prev=null;
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
		}
			
	}
	public void print() {
		Node temp=head;
		Node last=null;
		System.out.println("forward traversal");
		while(temp!=null) {
			System.out.println(temp.data);
			 System.out.println("Forward Traversal");
		        while(temp != null)
		        {
		            System.out.println(temp.data);
		            if(temp.next == null)
		                last = temp;
		            temp = temp.next;
		        }

		        System.out.println("Backward Traversal");
		        temp = last;
		        while(temp != null)
		        {
		            System.out.println(temp.data);
		            temp = temp.prev;
		        }
		    }}

	public static void main(String[] args) {
		DoubleyLinkedList2 a=new DoubleyLinkedList2();
		System.out.println("Inserting element :"+10);
		a.addfirst(10);
		System.out.println("Inserting element :"+20);
		a.addfirst(20);
		System.out.println("Inserting element :"+30);
		a.addfirst(30);
		System.out.println("Inserting element :"+40);
		a.addfirst(40);
		a.print();

	}

}
