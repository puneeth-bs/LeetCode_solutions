import java.util.Scanner;
public class ReverseLinkedList {
        
    public class ListNode{
    	int val;
    	ListNode next;
    	
    	ListNode(int val){
    		this.val = val;
    	}
    	
    	ListNode(int val, ListNode next){
    		this.val = val;
    		this.next = next;
    	}
    	
    }
    
    public static ListNode head = null;
    
    
    
    
   
    //reverse linked list method
    public ListNode reverseLinkedListIterative(){
    	
    	//solution (iterative method)
    	ListNode prev = null;
    	ListNode curr = head;
    	ListNode next = null;
    	
    	while(curr != null){
    		next = curr.next;
    		curr.next = prev;
    		prev = curr;
    		curr = next;
    	}
    	
    	return prev;
    }
    
    
    
    public void appendNode(int val){
    	
    	if(head == null){
    		ListNode new_node = new ListNode(val);
    		new_node.next = null;
    		head = new_node;
    		//printList(head);
    	}else{
    		ListNode temp = head;
    		while(temp.next != null){
    			temp = temp.next;
    		}
    		ListNode new_node = new ListNode(val);
    		new_node.next = null;
    		temp.next = new_node;
    		//printList(head);
    	}    	
    }
    
    public void printList(ListNode head){
    	ListNode temp = head;
    	if(head == null){
    		System.out.println ("head is null");
    	}
    	while(temp!=null){
    		System.out.print(temp.val+"");
    		if(temp.next != null){
    			System.out.print("-->");
    		}
    		temp = temp.next;
    	}
    }
    
    
    
    public static void main(String[] args) {
        
        ReverseLinkedList solution = new ReverseLinkedList();
        Scanner s = new Scanner(System.in);
        
        //ListNode head = null;
        System.out.print("Enter number of nodes: ");
        int nodes = s.nextInt();
        System.out.println ("Enter node values: ");
        for(int i = 0; i < nodes; i++){
        	int val = s.nextInt();
        	solution.appendNode(val);
        }
        solution.printList(solution.reverseLinkedListIterative());
        
    }
}
