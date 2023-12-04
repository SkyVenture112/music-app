public class Song extends Content {

  public Song() {

    super();

  }

  public Song(String title, String artist, int timesStreamed) {

    super(title, artist, timesStreamed);
    
  }

  @Override
  public void play() {
    
    super.setTimesStreamed(super.getTimesStreamed() + 1);
    
    System.out.println("You are listening to " + super.getTitle() + " by " + super.getArtist() + ".");
    
    }

  
  
  public String toString() {
    
    return this.getTitle() + " - " + this.getArtist();
    
  }

  
}