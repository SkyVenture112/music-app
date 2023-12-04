import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.*;

class Driver {
  
  public static void main(String[] args) {

    Listener userAccount = new Listener();

    Artist MysterySkulls = new Artist("Mystery Skulls");

    Artist TheWeeknd = new Artist("The Weeknd");

    Artist The1975 = new Artist("The 1975");

    Artist MrKitty = new Artist("Mr. Kitty");

    Song Ghost = new Song("Ghost", "Mystery Skulls", 0);

    Song TheFuture = new Song("The Future", "Mystery Skulls", 0);

    Song Paralyzed = new Song("Paralyzed", "Mystery Skulls", 0);

    Song Money = new Song("Money", "Mystery Skulls", 0);

    Song AfterDark = new Song("After Dark", "Mr. Kitty", 0);

    Song AfterHours = new Song("After Hours", "The Weeknd", 0);

    Song SomebodyElse = new Song("Somebody Else", "The 1975", 0);

    Podcast CriticalRole = new Podcast("Critical Role", "Matthew Mercer", 0, 1);

    Podcast Distractible = new Podcast("Distractible", "Mark Fischbach", 0, 1);
    
    Playlist defaultPlaylist = new Playlist("Epic Songs");
    
    Album defaultAlbum = new Album("Forever");

    defaultPlaylist.addContent(Ghost);
    
    defaultPlaylist.addContent(CriticalRole);

    defaultPlaylist.addContent(AfterDark);

    defaultPlaylist.addContent(AfterHours);

    defaultPlaylist.addContent(SomebodyElse);

    defaultPlaylist.addContent(Distractible);

    defaultAlbum.getContentList().add(Ghost);

    defaultAlbum.getContentList().add(TheFuture);

    defaultAlbum.getContentList().add(Paralyzed);

    defaultAlbum.getContentList().add(Money);

    Collections.sort(defaultPlaylist.getContentList());

    Collections.sort(defaultAlbum.getContentList());

    boolean quit = false;
    
    Scanner scanner = new Scanner(System.in);



    while (!quit) {

      try {

        System.out.println("1. Create an Account\n2. List all Playlists and Albums\n3. Add Songs to Playlist\n4. Shuffle Playlist or Listen to Album\n5. Add Content to Favorites\n6. Export Favorites\n7. Exit");

    int selection = scanner.nextInt();

      scanner.nextLine();

      switch (selection) {
    
          case 1:
            
            System.out.println("Please enter a username for your account:");
            
            String username = scanner.next();

            userAccount.setUsername(username);

            System.out.println("Your username is " + username + ".");
  
            break;
  
          case 2:
  
            System.out.println(defaultPlaylist);
          
            System.out.println(defaultAlbum);
  
            break;
  
          case 3:
  
            System.out.println("Please input the title of the song you want to add:");

            String songTitle = scanner.nextLine();

            System.out.println("Please enter the artist of the song:");

            String songArtist = scanner.nextLine();

            Song song = new Song(songTitle, songArtist, 0);

            defaultPlaylist.addContent(song);

            break;

        case 4:

          System.out.println("Would you like to listen to a playlist or album?");

          String choice = scanner.next();

          if (choice.equals("playlist") || choice.equals("Playlist")) {

            defaultPlaylist.shuffle();

          }

          else if (choice.equals("album") || choice.equals("Album")) {

            defaultAlbum.playAlbum();
            
          }

          else {

            System.out.println("Invalid input detected. Please input either \"Playlist\" or \"Album\".");


            choice = scanner.next();
            
          }

          break;


         case 5:

          System.out.println("Please input the title of the song or podcast you want to favorite:");


          String contentTitle = scanner.nextLine();

          boolean contentExists = false;

          for (Content content : defaultPlaylist.getContentList()) {

            if (content.getTitle().equals(contentTitle)) {

              userAccount.favorite(content);

              System.out.println(contentTitle + " has been favorited.");

              contentExists = true;

              break;
              
            }

            
          }

          if (contentExists == false) {

             System.out.println("That song or podcast that does not exist.");
              
          }


              


          break;


        case 6:

          try {
            
            
            FileWriter writer = new FileWriter("favorites.txt");
          

          for (int i = 0; i < userAccount.getFavoriteList().size(); ++i) {

            writer.write(userAccount.getFavoriteList().get(i).toString() + " : Streamed " + userAccount.getFavoriteList().get(i).getTimesStreamed() + " times." + "\n");
            
          }
            

          writer.close();

          System.out.println("Favorites.txt has been created.");

            

          }

          catch (IOException e) {

            System.out.println("There was an error exporting the favorites.");
            
          }

          break;
          
  
          case 7:

            System.out.println("Goodbye.");
            
            quit = true;
          
            break;
  
          default:
  
            System.out.println("Unknown input entered.");
          
          }
        
        }

       catch (InputMismatchException e) {

        System.out.println("Unknown input entered.");

        scanner.nextLine();

      
        
      }
      
    }

    
  }
}