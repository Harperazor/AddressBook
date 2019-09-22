/* <Hengpu zhang> <B00754648>
 * Assignment 4
 * This program will use linked list to build an address book.
*/
import java.util.Scanner;
public class AddressBookDemo{
   public static void main(String[]args){
      Scanner keyboard=new Scanner(System.in);
      AddressBook book=new AddressBook();
      int command=0;
      while(command!=5){
         System.out.print("Enter 1 to add contact, 2 to display, 3 to search, 4 to delete, 5 to quit: ");
         command=keyboard.nextInt();
         if(command==1){
            //assign a person's informations
            System.out.print("Enter last name: ");
            String lastName=keyboard.next();
            System.out.print("Enter first name: ");
            String firstName=keyboard.next();
            System.out.print("Enter Street name: ");
            String streetName=keyboard.next();
            System.out.print("Enter phone number: ");
            String phone=keyboard.next();
            //add this person into address book
            book.addContact(new Contact(lastName,firstName,streetName,phone));
            System.out.println();
         }
         else if(command==2){
            //print the address book
            System.out.println();
            book.displayAllContacts();
            System.out.println();
         }
         else if(command==3){
            //search for a person
            System.out.print("Enter 1 to search name, 2 to search address, 3 to search phone number: ");
            int searchCommand=keyboard.nextInt();
            System.out.print("Enter what to search: ");
            String searchText=keyboard.next();
            System.out.println();
            book.search(searchText,searchCommand);
            System.out.println();
         }
         else if(command==4){
            //delete a person
            System.out.print("Enter 1 to search name, 2 to search address, 3 to search phone number, 4 to display all contacts: ");
            int searchDelete=keyboard.nextInt();
            System.out.print("Enter what to search: ");
            String searchDeleText=keyboard.next();
            book.delete(searchDeleText,searchDelete);
         }
         else if(command==5){
            //quit
            System.out.println();
            System.out.println("Good-bye!");
         }
      }
   }
}