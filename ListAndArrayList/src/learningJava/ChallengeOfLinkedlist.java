package learningJava;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class ChallengeOfLinkedlist {

    public static void main(String[] args) {
        // write your code here
        Album morningSongs = new Album("morning","nameOfAlbum");
        morningSongs.addSong("Hello World1",4);
        morningSongs.addSong("Hello World2",4);
        morningSongs.addSong("Hello World3",4);
        morningSongs.addSong("Hello World4",4);
        morningSongs.addSong("Hello World5",4);
        morningSongs.addSong("Good Morning",3);
        morningSongs.addSong("Good Evening",3);
        morningSongs.printAlbum();

        LinkedList<Song> playList = new LinkedList<>();
        morningSongs.addToPlayList("Good Morning", playList);
        morningSongs.addToPlayList("Hello World1", playList);
        morningSongs.addToPlayList("Hello World2", playList);
        morningSongs.addToPlayList("Hello World3", playList);
        morningSongs.addToPlayList("Hello World4", playList);
        morningSongs.addToPlayList("Hello World5", playList);
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
        boolean quit = false;
        boolean preIsForward = true;
        ListIterator<Song> playListIterator = playList.listIterator();

        if(playList.size() == 0){
            System.out.println("There is no song in the playlist.");
            return;
        }

        System.out.println("First song is " + playListIterator.next().getTitle());
        printMenu();

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action){
                case 0:
                    quit = true;
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
                        if (playListIterator.hasPrevious()){
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
                        System.out.println("Replay song " + playListIterator.next().getTitle());
                    }else{
                        playListIterator.next();
                        System.out.println("Replay song " + playListIterator.previous().getTitle());
                    }
                    break;
                case 4:
                    ListIterator<Song> playlistIterator2 = playList.listIterator();
                    System.out.println("Songs at playlist are: ");
                    while(playlistIterator2.hasNext()){
                        System.out.println(playlistIterator2.next().getTitle());
                    }
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playList.size() > 0){
                        playListIterator.remove();
                        if (playListIterator.hasNext()){
                            System.out.println("Now playing " + playListIterator.next().getTitle());
                        }else if (playListIterator.hasPrevious()){
                            System.out.println("Now playing " + playListIterator.previous().getTitle());
                        }
                    }
                    break;
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
                "6 - delete current song from playlist.");
    }

}
