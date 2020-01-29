package learningJava;

import java.util.LinkedList;

public class Album {

    public static void main(String[] args){

        Album favorAlbum = new Album();
        favorAlbum.addSongToPlaylist("Today", 4);

        LinkedList<Song> playList = new LinkedList<>();

    }

    private LinkedList<Song> album;
    public class Song {
        private String title;
        private double duration;

        public Song(String title, double duration) {
            this.title = title;
            this.duration = duration;
        }

        public String getTitle() {
            return title;
        }

        public double getDuration() {
            return duration;
        }
    }

    public void addSongToPlaylist(String name, double duration){

        Song newSong = new Song(name, duration);

    }

}
