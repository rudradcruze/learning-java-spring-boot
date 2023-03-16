package ac.dia; 
 
import java.util.Date; 
 
public class User { 
 private int id; 
 private String userName; 
 private String email; 
 private Date date; 
  
 public User() { 
   
  id=100; 
  userName="Kal"; 
  email="hhh"; 
  date=new Date(); 
  System.out.println(".....Default Constructor...."); 
   
 } 
  
  
  
  
 public User(int id, String userName, String email, Date date) { 
  System.out.println("......Argument Constructer......"); 
  this.id = id; 
  this.userName = userName; 
  this.email = email; 
  this.date = date; 
 } 
 
 
 
 
 public int getId() { 
  return id; 
 } 
 public void setId(int id) { 
  this.id = id; 
 } 
 public String getUserName() { 
  return userName; 
 } 
 public void setUserName(String userName) { 
  this.userName = userName; 
 } 
 public String getEmail() { 
  return email; 
 } 
 public void setEmail(String email) { 
  this.email = email; 
 } 
 public Date getDate() { 
  return date; 
 } 
 public void setDate(Date date) { 
  this.date = date; 
 } 
  
  
  
}package ac.dia; 
 
import java.util.Date; 
 
public class User { 
 private int id; 
 private String userName; 
 private String email; 
 private Date date; 
  
 public User() { 
   
  id=100; 
  userName="Kal"; 
  email="hhh"; 
  date=new Date(); 
  System.out.println(".....Default Constructor...."); 
   
 } 
  
  
  
  
 public User(int id, String userName, String email, Date date) { 
  System.out.println("......Argument Constructer......"); 
  this.id = id; 
  this.userName = userName; 
  this.email = email; 
  this.date = date; 
 } 
 
 
 
 
 public int getId() { 
  return id; 
 } 
 public void setId(int id) { 
  this.id = id; 
 } 
 public String getUserName() { 
  return userName; 
 } 
 public void setUserName(String userName) { 
  this.userName = userName; 
 } 
 public String getEmail() { 
  return email; 
 } 
 public void setEmail(String email) { 
  this.email = email; 
 } 
 public Date getDate() { 
  return date; 
 } 
 public void setDate(Date date) { 
  this.date = date; 
 } 
  
  
  
}