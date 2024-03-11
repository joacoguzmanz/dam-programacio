package UF4.Medias;

public class Main {
    public static void main(String[] args) {
        MP3 song = new MP3("Your love", 3, "The Outfield", "Rock", 2);
        Video video = new Video("Inception", 160, "Christopher Nolan", "English");
        Ogg someFile = new Ogg(5);
        someFile.setName("Idk");
        Music music = new Music("Maroon 5", "Pop");

        System.out.println(song.getName());
        System.out.println(video.getLength());
        System.out.println(music.getArtist());
    }
}
