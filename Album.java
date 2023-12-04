public class Album extends Collection {

  int i;

  

  public Album() {

    super();
    
  }

  

  public Album(String title) {

    super(title);
    
  }


  public void playAlbum() {

    for (i = 0; i < super.getContentList().size(); ++i) {

      super.getContentList().get(i).play();

    }

    
  }





  
}