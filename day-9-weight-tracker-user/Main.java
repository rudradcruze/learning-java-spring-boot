package ac.dia; 
 
import java.util.Date; 
 
public class Main { 
 
 public static void main(String[] args) { 
  User user=new User(); 
   
   
  System.out.println("Default....."); 
  System.out.println(" id        :"+user.getId()); 
  System.out.println(" User Name :"+user.getUserName()); 
  System.out.println(" Email     :"+user.getEmail()); 
  System.out.println(" Date      :"+user.getDate()); 
   
   
   
  user.setId(1050); 
  user.setUserName("Dipon"); 
  user.setEmail("dipon@gmail.com"); 
  user.setDate(new Date()); 
  System.out.println("After Change....."); 
  System.out.println(" id        :"+user.getId()); 
  System.out.println(" User Name :"+user.getUserName()); 
  System.out.println(" Email     :"+user.getEmail()); 
  System.out.println(" Date      :"+user.getDate()); 
   
  User u=new User(2, "saha", "jjj", new Date(1, 1, 1900+2023)); 
  System.out.println(" id        :"+u.getId()); 
  System.out.println(" User Name :"+u.getUserName()); 
  System.out.println(" Email     :"+u.getEmail()); 
  System.out.println(" Date      :"+u.getDate()); 
  
 } 
 
}