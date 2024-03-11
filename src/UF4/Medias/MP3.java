package UF4.Medias;

public class MP3 extends Music {
    private int mode;

    public MP3(int mode) {
        this.mode = mode;
    }

    public MP3(String artist, String genre, int mode) {
        super(artist, genre);
        this.mode = mode;
    }

    public MP3(String name, int length, String artist, String genre, int mode) {
        super(name, length, artist, genre);
        this.mode = mode;
    }

    public int getMode() {
        return mode;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }
}
