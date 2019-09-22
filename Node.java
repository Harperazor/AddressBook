/* <Hengpu zhang> <B00754648>
 * Assignment 4
 * This program is a class named Node, which  hold Contact as its data.
*/
public class Node{
   
   //instance variables
   private Contact data;
   private Node next;
   
   //constructor
   public Node(Contact d, Node n){ 
      data = d; 
      next = n; 
   } 
   
   //get and set methods
   public Contact getData(){ return data;} 
   public Node getNext(){ return next;}
   public void setData(Contact d){ data = d;}
   public void setNext(Node n){ next = n; } 

   //toString method
   public String toString(){ 
      return data + ""; 
  } 
} 
