package learningJava;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class ChallengeOfLinkedlist {

    public static void main(String[] args) {
        // write your code here
        Album morningSongs = new Album("morning","nameOfAlbum");
        morningSongs.addSong("Hello World",4);
        morningSongs.addSong("Good Morning",3);
        morningSongs.addSong("Good Evening",3);
        morningSongs.printAlbum();

        LinkedList<Song> playList = new LinkedList<>();
        morningSongs.addToPlayList("Hello World", playList);
        morningSongs.addToPlayList("Good Evening", playList);
        printList(playList);

        play(playList);

    }

    private static void printList(LinkedList<Song> playList){
        ListIterator<Song> iterator = playList.listIterator();
        System.out.println("****** PlayList ******");
        while(iterator.hasNext()){
            System.out.println(iterator.next().getTitle());
        }
    }

    private static void play(LinkedList<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean notQuit = false;
        boolean preIsForward = true;
        ListIterator<Song> playListIterator = playList.listIterator();

        if(playList.size() == 0){
            System.out.println("There is no song in the playlist.");
            return;
        }

        System.out.println("First song is " + playListIterator.next().getTitle());
        printMenu();

        while(notQuit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action){
                case 0:
                    notQuit = false;
                    break;
                case 1:
                    if (!preIsForward){
                        if (playListIterator.hasNext()){
                            playListIterator.next();
                        }
                    }
                    if (playListIterator.hasNext()){
                        System.out.println("Current song is " + playListIterator.next().getTitle());
                        preIsForward = true;
                    }else{
                        System.out.println("We are at end of playlist.");
                    }
                    break;
                case 2:
                    if (preIsForward){
                        if (playListIterator.hasPrevious(){
                            playListIterator.previous();
                        }
                    }
                    if (playListIterator.hasPrevious()){
                        System.out.println("Current song is " + playListIterator.previous().getTitle());
                        preIsForward = false;
                    }else {
                        System.out.println("We are at start of playlist.");
                    }
                    break;
                case 3:
                    if (preIsForward){
                        playListIterator.previous();
                        System.out.println("Replay song " + playListIterator.next());
                    }else{
                        playListIterator.next();
                        System.out.println("Replay song " + playListIterator.previous());
                    }
                case 4:
                    ListIterator<Song> playlistIterator2 = playList.listIterator();
                    while(playlistIterator2.hasNext()){
                        System.out.println("Songs at playlist are: ");
                        System.out.println(playlistIterator2.next().getTitle());
                    }
                case 5:
                    if (preIsForward){
                        playListIterator.previous();
                        System.out.println("Replay previous song " + playListIterator.next());
                    }else{
                        playListIterator.next();
                        System.out.println("Replay previous song " + playListIterator.previous());
                    }
            }
        }
    }

    private static void printMenu(){
        System.out.println("Avaliable actions: \npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print available actions.\n" +
                "6 - delete current song from playlist");
    }

}
