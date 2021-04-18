import java.util.Scanner;
public class SortList {
        
    
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
    
    
    
    //mergeSort
    public ListNode sortList(ListNode head) {
        
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode midNode = getMidNode(head);
        return mergeLinkedList(sortList(head), sortList(midNode));
        
        
    }
    
    public ListNode getMidNode(ListNode head){
        
        ListNode slowPtr = head;
        ListNode fastPtr = head.next;
        
        while(fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        
        ListNode midNode = slowPtr.next;
        slowPtr.next = null;
        return midNode;
        
    }
    
    public ListNode mergeLinkedList(ListNode l1, ListNode l2){
        
        ListNode dummyHead = new ListNode(-1);
        ListNode currNode = dummyHead;
        
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                currNode.next = l1;
                l1 = l1.next;
            }else{
                currNode.next = l2;
                l2 = l2.next; 
            }
            
            currNode = currNode.next;
        }
        
        if(l1 != null){
            currNode.next = l1;
        }else{
            currNode.next = l2;
        }
        
        return dummyHead.next;
        
    }
    
    public void appendNode(int val){
    	
    	if(head == null){
    		ListNode newNode = new ListNode(val);
    		newNode.next = null;
    		head = newNode;
    	}else{
    		ListNode tempNode = head;
    		while(tempNode.next != null){
    			tempNode = tempNode.next;
    		}
    		
    		ListNode newNode = new ListNode(val);
    		newNode.next = null;
    		tempNode.next = newNode;
    	}
    	
    }
    
    public void printList(ListNode head){
    	
    	ListNode tempNode = head;
    	if(head == null){
    		System.out.println ("Head is null");
    	}
    	while(tempNode != null){
    		System.out.print (tempNode.val+"");
    		if(tempNode.next != null){
    			System.out.print("-->");
    		}
    		
    		tempNode = tempNode.next;
    	}
    	
    }
    
    
    public static void main(String[] args) {
    	
    	SortList solution = new SortList();
    	Scanner s = new Scanner(System.in);
    	System.out.print("Enter number of nodes: ");
    	int nodes = s.nextInt();
    	System.out.println ("Enter Nodes into list: ");
    	for(int i = 0; i < nodes; i++){
    		int val = s.nextInt();
    		solution.appendNode(val);
    	}
    	solution.printList(solution.sortList(head));
    	
    	
    	
        
    }
}
