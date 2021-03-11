package filialbiliotek.packages.Model;

public class Media {

    private long id;
    private String title;
    private String publisher;
    private String releaseDate;

    public Media(long id, String title, String publisher, String releaseDate) {
        this.id = id;
        this.title = title;
        this.publisher = publisher;
        this.releaseDate = releaseDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
