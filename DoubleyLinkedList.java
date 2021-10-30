package doubleyLinkedList;
class Node{
	Node prev;
	int data;
	Node next;
}

public class DoubleyLinkedList {

	public static void main(String[] args) {
		Node head ,middle,last;
		head=new Node();
		middle=new Node();
		last=new Node();
		// put the value 
		head.data=10;
		middle.data=20;
		last.data=30;
		//linking the nodes
		head.prev=null;
		head.next=middle;
		middle.prev=head;
		middle.next=last;
		last.prev=middle;
		last.next=null;
		
		System.out.println(" Node in forward");
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println("Node in backward");
		Node temp2=last;
		while(temp2!=null){
			System.out.println(temp2.data);
			temp2=temp2.prev;
		}
		
		

	}

}
