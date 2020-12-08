import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args){

        ArrayList<Media> mediaCollection = new ArrayList<Media>();
        List<String> cast = new ArrayList<String>();
        cast.add("A");
        // Creating Music Album that inherits all properties of Media class
        Album media1 = new Album("Title of Media",1231234, "Genree", "www.wtf.com", 60.0, 0, "artist", 11);
        System.out.println(media1.getArtist());

        //Creating Media Album inherits all Media class
        Movie media2 = new Movie("Title of Media",1231234, "Genree", "www.wtf.com", 60.0, 0, "producer",cast);
        System.out.println(media2.getCastList());

        mediaCollection.add(media2);
        System.out.println(mediaCollection);
    }
}
