/* <Hengpu zhang> <B00754648>
 * Assignment 4
 * This program is a class named Contact.
*/
public class Contact{
   
   //instance variables
   private String lastName;
	private String firstName;
	private String streetName;
	private String phone;
   
   //constructors
   public Contact(){
   }
   public Contact(String l,String f,String s,String p){
      lastName=l;
      firstName=f;
      streetName=s;
      phone=p;
   }
   
   //set and get methods
   public void setLastName(String l){
      lastName=l;
   }
   public void setFirstName(String f){
      firstName=f;
   }
   public void setStreetName(String s){
      streetName=s;
   }
   public void setPhone(String p){
      phone=p;
   }
   
   public String getLastName(){
      return lastName;
   }
   public String getFirstName(){
      return firstName;
   }
   public String getStreetName(){
      return streetName;
   }
   public String getPhone(){
      return phone;
   }
   
   //toString method
   public String toString(){
      return lastName + ", " + firstName + "\t\t\t\t" + streetName + "\t\t\t\t" + phone;
   }
}