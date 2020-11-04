public class LinkedList { 
  
    node head; // head of list 
     Node head;
  	 Node tail;
	
	public LinkedList() {
		head =  null;
		tail =  null;
	}
  	      // Linked list Node. 
  
        class Node { 
  
          String name; 
          String num ;
          Node next; 
  
          // Constructor 
            node( String name ,String num) 
            { 
              this.name = name;
              this.num = num;
              next = null; 
            } // end Constructor 
        
          public Node getDate() {
	           	return name + "+" + num;
          	} // end get

	
         	
       } // end class node
 


  

	public void add(Node a) {
		Node n = new Node();
		n.setItem(a); 
		if (head == null) {
			head =  n;
			tail = n;
		}
		else {
			n.setNext(head);
			head = n;
		}
	}//end add 
    
    public String search(String name) 
    { 
        Node current = head;    //Initialize current 
        while (current != null) 
        { 
            if (current.name == name) 
                return current.num;    //data found 
          
            current = current.next; 
        } 
        return "";    //data not found 
    }// end search 
	

	
  }
