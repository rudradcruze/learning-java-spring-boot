package collectionTwo;

public class LinkList<T> {
	
	private Node head;
	
	public void addNode(T data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
		}
		else {
			
			Node  curr = head;
			
			while(curr.getNext() != null)
				curr=curr.getNext();
			
			curr.setNext(node);
		}
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	public void display() {
		Node curr = head;
		while(curr != null) {
			System.out.println(curr.getData());
			curr=curr.getNext();
		}
	}
	
	public void insertIntoMiddle(T data) {
	    Node newNode = new Node(data);

	    if (head == null) {
	        // If the list is empty, make the new node the head
	        head = newNode;
	    } else {
	        // Find the middle position
	        Node slowPtr = head;
	        Node fastPtr = head;
	        Node prev = null;

	        while (fastPtr != null && fastPtr.getNext() != null) {
	            fastPtr = fastPtr.getNext().getNext();
	            prev = slowPtr;
	            slowPtr = slowPtr.getNext();
	        }

	        // Adjust the references to insert the new node
	        prev.setNext(newNode);
	        newNode.setNext(slowPtr);
	    }
	}
	
	
	public static void main(String[] args) {
//		LinkList<Integer> list = new LinkList<Integer>();
		LinkList list = new LinkList();
		
		list.addNode(10);
		list.addNode(20);
		list.addNode(15);
//		list.addNode("Ponero");
		list.addNode(96);
		list.addNode(5);
		list.addNode(25);
		
//		list.insertIntoMiddle(99);
		
		list.display();
		
	}
}
