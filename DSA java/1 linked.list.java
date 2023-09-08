import java.util.LinkedList;

class firstclass{
    public  static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data= data;
            this.next= null;
        
        }
        public static Node head;
        public static Node tail;
        public void addFirst(int data){
             

            // creat new node
            Node newNode= new Node(data);
            // if list is empty
              if ( head== null){
                head= tail = newNode;
                return;
            }
    
            //link one node to anthor node
            newNode next= head;
            // head = new node 
            head= newNode;
        }
        public void addLast(int data){

             // creat node 
            Node newNode= new Node(data);
            // if head is null
            if ( head== null){
                head= tail = newNode;
                return;
            }

            // tail= new last
            tail.next = newNode;
            tail= newNode;

        }
        public void pt(){
            if (head== null){
                System.out.println(" null");
                return;
            }
            Node temp= head;
            while (temp !=null){
                System.out.print(temp.data+"  ");
                temp = temp.next;
            }System.out.println();
        }
    
        
    }
   public static void main(String[] args) {
        LinkedList ll= new LinkedList();
        ll.pt();
        ll.addFirst(1);

   
        
    }
}