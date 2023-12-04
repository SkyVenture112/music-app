import java.util.ArrayList;
import java.util.Random;

public abstract class Collection implements Comparable<Collection> {

  private String title;
  private ArrayList<Content> contentList = new ArrayList<Content>();

  Random randy = new Random();


  public Collection() {

    title = "New Collection";
    
  }

  public Collection(String title) {


    this.title = title;
    
    
  }

  

  public String getTitle() {

    return this.title;
    
  }

  public ArrayList<Content> getContentList() {

    return contentList;

    
  }

  public void setTitle(String title) {

    this.title = title;
    
  }
  

  public String toString() {

    return title + ":\n" + contentList;
    
  }


  public void shuffle() {

    for (Content content : contentList) {

    contentList.get(randy.nextInt(contentList.size())).play();

    }
    
  }

  

  public int compareTo(Collection collection) {

    return this.contentList.size() - collection.contentList.size();

    

  }
  
}