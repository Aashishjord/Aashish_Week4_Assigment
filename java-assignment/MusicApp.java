class Song {
    private String title;
    private String artist;


    Song(String title,String artist){
        this.title=title;
        this.artist=artist;

    }

    public String getTitle(){
        return title;
    }

    public String getArtist(){
        return artist;
    }

    public void play(){
        System.out.println("Playing "+getTitle()+" by "+getArtist()+" is playing.");
    }


}

class PopSong extends Song {

    PopSong(String title,String artist){
        super(title,artist);

    }

    @Override
    public void play(){
        System.out.println("Pop Song! "+getTitle()+" by "+getArtist()+" is playing.");
    }
}

class RockSong extends Song {

    RockSong(String title, String artist){
        super(title,artist);

    }

    @Override
    public void play(){
        System.out.println("Rock Song! "+getTitle()+" by "+getArtist()+" is playing.");
    }
}

class JazzSong extends Song {

    JazzSong(String title, String artist){
        super(title,artist);
    }
    @Override
    public void play(){
        System.out.println("Jazz Song! "+getTitle()+" by "+getArtist()+" is playing.");
    }


}
public class MusicApp {
    public static void main(String[] args) {
        
        Song[] sg= new Song[]{
            new PopSong("Torn Apart","Eredaze"),
            new RockSong("Venom", "Eminem"),
            new JazzSong("Trapped in my Mind", "Adam oh")
        };

        for(int i=0; i<sg.length; i++){  //Using loop to display all the inputs
            sg[i].play();
        }

        
    }
}
