import java.util.List;

public class Movie extends Media{

    private String Producer;
    private List castList;

    public Movie(String title, Integer id, String genre, String url, Double length, Integer views, String producer, List castlist){
        super(title, id, genre, url, length,views);
        this.Producer = producer;
        this.castList = castlist;
    }
    public String getProducer(){
            return Producer;
    }

    public List getCastList(){
        return castList;
    }


}
