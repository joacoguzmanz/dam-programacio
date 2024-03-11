package UF4.Medias;

public class Ogg extends Music {
    private int version;

    public Ogg(int version) {
        this.version = version;
    }

    public Ogg(String artist, String genre, int version) {
        super(artist, genre);
        this.version = version;
    }

    public Ogg(String name, int length, String artist, String genre, int version) {
        super(name, length, artist, genre);
        this.version = version;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
