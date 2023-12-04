public class Podcast extends Content {
  

  private int episodeNumber;

  
  
  public Podcast() {

    super();

    episodeNumber = 1;
    
  }
  

  public Podcast(String title, String artist, int timesStreamed, int episodeNumber) {

    super(title, artist, timesStreamed);
    
    this.episodeNumber = episodeNumber;
    
  }


  public int getEpisodeNumber() {


    return this.episodeNumber;
    
  }
  

  public void setEpisodeNumber(int episodeNumber) {


    this.episodeNumber = episodeNumber;
    
  }


  @Override
  public void play() {
    
    super.setTimesStreamed(super.getTimesStreamed() + 1);
    
    System.out.println("You are listening to " + super.getTitle() + " - Episode " + this.getEpisodeNumber() + ".");
    
    }

  
  public String toString() {


    return this.getTitle() + " - Episode " + this.episodeNumber;

  }
  

  
}