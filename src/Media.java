public class Media {

    private String Title;
    private Integer Id;
    private String Genre;
    private String Url;
    private Double Length;
    private Integer timesViewed;

    public Media(String title, Integer id, String genre, String url, Double length, Integer views){
        this.Title = title;
        this.Id = id;
        this.Genre = genre;
        this.Url = url;
        this.Length = length;
        this.timesViewed = views;

    }

    public String getTitle(){

        return Title;
    }

    public Integer getId(){
        return Id;
    }

    public String getGenre(){
        return Genre;
    }

    public String getUrl(){
        return Url;
    }

    public Double getLength(){
        return Length;
    }

    public Integer getTimesViewed() {
        return timesViewed;
    }

    public void viewed(){
        timesViewed += 1;
    }
}
