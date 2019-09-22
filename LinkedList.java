/* <Hengpu zhang> <B00754648>
 * Assignment 4
 * This program is a class named LinkedList.
*/
public class LinkedList{ 
   
   private Node front; 
   private int count; 
   
   //constructor 
   public LinkedList(){ 
      front = null; count = 0; 
   } 
   
   //add a node to the front of the linked list
   public void addToFront(Contact d){ 
      Node n; 
      n = new Node(d, front);
      front = n;
      count++; 
   } 
   
   //add a node at the given index
   public void add(int index,Contact d){
      if(index==0){
         addToFront(d);
      }
      else{
         Node curr=front;
         for(int i=0;i<index-1;i++){
            curr=curr.getNext();
         }
         Node n=new Node(d,curr.getNext());
         curr.setNext(n);
         count++;
      }
   }
   
   //remove the first node
   public void removeFront(){
      front=front.getNext();
      count--;
   }
   
   //remove the last node
   public void removeLast(){
      Node curr=front;
      while(curr.getNext().getNext()!=null){
         curr=curr.getNext();
      }
      curr.setNext(null);
      count--;
   }
   
   //get the current size of the list
   public int size(){ return count; } 


   //get the first node
   public Node getFront() { 
      return front; 
   }
   
   //the countSubtraction method, will be used in AddressBook class to subtract count by 1
   public void countSubtraction(){
      count--;
   }
   
} 
