public class Playlist extends Collection {

  public Playlist() {

    super();
    
  }

  public Playlist(String title) {

    super(title);
    
  }

  public void addContent(Content content) {

    super.getContentList().add(content);

    
  }

  public void removeContent(Content content) {

    super.getContentList().remove(content);

    
  }

  





  
}