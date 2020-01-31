package learningJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

// Create a program that implements a playlist for songs
// Create a Song class having Title and Duration for a song.
// The program will have an Album class containing a list of songs.
// The albums will be stored in an ArrayList
// Songs from different albums can be added to the playlist and will appear in the list in the order
// they are added.
// Once the songs have been added to the playlist, create a menu of options to:-
// 1. Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
// 2. List the songs in the playlist
// 3. A song must exist in an album before it can be added to the playlist (so you can only play songs that
// you own).
// Hint:  To replay a song, consider what happened when we went back and forth from a city before we
// started tracking the direction we were going.
// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listiterator.remove()

public class Album {

    private String nameOfAlbum;
    private String singer;
    private ArrayList<Song> songList;

    public Album(String nameOfAlbum, String singer){
        this.nameOfAlbum = nameOfAlbum;
        this.singer = singer;
        songList = new ArrayList<Song>();
    }

    public boolean addSong(String name, double duration){
        // we can only add songs we did not add before.
        if (findSong(name) == null){
            Song newSong = new Song(name, duration);
            songList.add(newSong);
        }
        return false;
    }

    public Song findSong(String title){
        for (Song checkedSong: this.songList){
            if (checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }

    public void printAlbum(){
        Iterator iterator = songList.iterator();
        System.out.println("At " + this.nameOfAlbum + " of " + this.singer + " : ");
        for (Song currentSong: this.songList){
            System.out.println(currentSong.getTitle() + " " + "time is " + currentSong.getDuration());
        }
        System.out.println("==========");
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist){
        int index = trackNumber - 1;
        if ((index > 0) && (index <= this.songList.size())){
            playlist.add(this.songList.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList){
        Song checkedSong = findSong(title);
        if (checkedSong != null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album.");
        return false;
    }


}
