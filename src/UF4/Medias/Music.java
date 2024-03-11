package UF4.Medias;

public class Music extends Media {
    private String artist;
    private String genre;

    public Music() {

    }

    public Music(String artist, String genre) {
        this.artist = artist;
        this.genre = genre;
    }

    public Music(String name, int length, String artist, String genre) {
        super(name, length);
        this.artist = artist;
        this.genre = genre;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
