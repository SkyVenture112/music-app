public abstract class Content implements Comparable<Content> {

  private String title;
  private String artist;
  private int timesStreamed;

  

  public Content() {

    title = "New Content";
    artist = "New Artist";
    timesStreamed = 0;
    
  }
  

  public Content(String title, String artist, int timesStreamed) {

    this.title = title;
    this.artist = artist;
    this.timesStreamed = timesStreamed;

  }
  

  public String getTitle() {

    return title;
    
  }
  

  public String getArtist() {

    return artist;
    
  }
  

  public int getTimesStreamed() {

    return timesStreamed;
    
  }
  

  public void setTitle(String title) {

    this.title = title;
    
  }
  

  public void setArtist(String artist) {

    this.artist = artist;
    
  }
  

  public void setTimesStreamed(int timesStreamed) {

    this.timesStreamed = timesStreamed;
    
  }

  public abstract void play();


  public int compareTo(Content content) {

    return this.timesStreamed - content.timesStreamed;

  }
  
  
  
}