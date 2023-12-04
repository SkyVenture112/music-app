import java.util.ArrayList;


public class Listener extends Account {

  

  private ArrayList<Content> favoriteList = new ArrayList<Content>();

  

  public Listener() {

    super();
    
  }

  

  public Listener(String username) {

    super(username);
    
  }
  

  public ArrayList<Content> getFavoriteList() {

    return this.favoriteList;
    
  }


  public void favorite(Content content) {

    this.favoriteList.add(content);

    
  }

  
}