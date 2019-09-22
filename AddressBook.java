/* <Hengpu zhang> <B00754648>
 * Assignment 4
 * This program is a class named AddressBook .
*/
import java.util.ArrayList;
import java.util.Scanner;
public class AddressBook{
   
   //instance variable
   private LinkedList list;
   
   public AddressBook(){
      list = new LinkedList();//initializes the LinkedList
   }
   
   //the addContact method
   public void addContact(Contact d){
      if(list.size()==0){
         list.addToFront(d);
      }
      else{
         int index=0;
         int condition=0;//when two people have the same last name, condition=1
         Node curr=list.getFront();
         //check is there a people have the same last name
         while(curr!=null){
            if(curr.getData().getLastName().equals(d.getLastName())){
               condition=1;
               break;
            }
            curr=curr.getNext();
         }
         curr=list.getFront();
         if(condition==0){
            while(curr!=null && curr.getData().getLastName().compareTo(d.getLastName())<0){
               curr=curr.getNext();
               index++;
            }
         }
         //operate when two people have the same last name 
         if(condition==1){
            while(curr!=null && curr.getData().getFirstName().compareTo(d.getFirstName())<0){
               curr=curr.getNext();
               index++;
            }
         }
         list.add(index,d);
      }
   }
   
   //delete method
   public void delete(String text,int i){
      Scanner keyboard2=new Scanner(System.in);
      ArrayList<Contact> searchResult=new ArrayList<Contact>();//create an arraylist to put in searched results
      System.out.println();
      System.out.println("Name\t\t\t\t\tStreet\t\t\t\tNumber");
      int index=1;
      Node curr=list.getFront();
      //search on name
      if(i==1){
         while(curr!=null){
            if(curr.getData().getLastName().equals(text) || curr.getData().getFirstName().equals(text)){
               System.out.println(index + " ." + curr);
               searchResult.add(curr.getData());
               index++;
            }
            curr=curr.getNext();
         }
      }
      //search on address
      else if(i==2){
         while(curr!=null){
            if(curr.getData().getStreetName().equals(text)){
               System.out.println(index + " ." + curr);
               searchResult.add(curr.getData());
               index++;
            }
            curr=curr.getNext();
         }
      }
      //search on phone number
      else if(i==3){
         while(curr!=null){
            if(curr.getData().getPhone().equals(text)){
               System.out.println(index + " ." + curr);
               searchResult.add(curr.getData());
               index++;
            }
            curr=curr.getNext();
         }
      }
      //display all contacts
      else if(i==4){
         displayAllContacts();
      }
      System.out.println();
      System.out.print("Entry to delete: ");
      int deleteIndex=keyboard2.nextInt();
      System.out.println();
      Contact deleteItem=searchResult.get(deleteIndex-1);
      this.removeContact(deleteItem);
   }
   
   //the removeContact method
   public void removeContact(Contact d){
      int counter=0;
      Node curr=list.getFront();
      while(curr!=null){
         if(curr.getData().getLastName().equals(d.getLastName()) && curr.getData().getFirstName().equals(d.getFirstName()) &&
            curr.getData().getStreetName().equals(d.getStreetName()) && curr.getData().getPhone().equals(d.getPhone()) ){
            if(counter==0){
               list.removeFront();
               break;
            }
            else if(counter==list.size()-1){
               list.removeLast();
               break;
            }
            else{
               curr=list.getFront();
               while(curr.getData()!=d){
                  curr=curr.getNext();
               }
               curr.setNext(curr.getNext().getNext());
               list.countSubtraction();
               break;
            }
         }
         curr=curr.getNext();
         counter++;
      }
   }
   
   //the search method
   public void search(String text,int i){
      System.out.println("Name\t\t\t\t\tStreet\t\t\t\tNumber");
      Node curr=list.getFront();
      //search on name
      if(i==1){
         while(curr!=null){
            if(curr.getData().getLastName().equals(text) || curr.getData().getFirstName().equals(text)){
               System.out.println(curr);
            }
            curr=curr.getNext();
         }
      }
      //search on address
      else if(i==2){
         while(curr!=null){
            if(curr.getData().getStreetName().equals(text)){
               System.out.println(curr);
            }
            curr=curr.getNext();
         }
      }
      //search on phone number
      else if(i==3){
         while(curr!=null){
            if(curr.getData().getPhone().equals(text)){
               System.out.println(curr);
            }
            curr=curr.getNext();
         }
      }
   }
   
   //getList method
   public LinkedList getList(){
      return list;
   } 
   
   //print the addressBook
   public void displayAllContacts(){ 
      Node curr = list.getFront(); 
      System.out.println("Name\t\t\t\t\tStreet\t\t\t\tNumber");
      while (curr!=null) {
         System.out.println(curr); 
         curr = curr.getNext(); 
      } 
   }
   
}