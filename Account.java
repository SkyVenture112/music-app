public abstract class Account {

  

  private String username;

  

  public Account() {

    username = null;
    
  }

  

  public Account (String username) {

    this.username = username;
    
  }

  


  public String getUsername() {
    
    return this.username;

    
  }

  

  public void setUsername(String username) {

    this.username = username;
    
  }
  

  
  
  public String toString() {

    return "This account's username is " + this.username;

    
  }

}