
public class Album extends Media {

    private String albumArtist;
    private Integer totalSongs;

    public Album(String title, Integer id, String genre, String url, Double length, Integer views, String artist, Integer songs) {
        super(title, id, genre, url, length, views);
        this.albumArtist = artist;
        this.totalSongs = songs;
    }
    public String getArtist(){
            return albumArtist;
    }

    public Integer getTotalSongs(){
        return totalSongs;
    }
}