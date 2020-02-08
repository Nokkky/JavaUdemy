package learningJava;

import java.util.*;

public class wordLadder_120 {
    /*
     * @param start: a string
     * @param end: a string
     * @param dict: a set of string
     * @return: An integer
     */
    public static void  main(String[] args){
        Set<String> dict = new HashSet<>();
        dict.add("hot");
        dict.add("dot");
        dict.add("dog");
        dict.add("lot");
        dict.add("log");


        System.out.println(ladderLength("hit","cog", dict));
    }
    public static int ladderLength(String start, String end, Set<String> dict) {
        // write your code here
        // From start to end
        // build the graph and traverse

        // start word add to queue
        //  while queue is not empty
        //      pop out first word in queue
        //      if word == end return distance
        //      find the next word
        //          if next word has not enter queue  add to queue
        //          else continue

        if (start.equals(end)) return 1;
        if (dict == null) return 0;

        dict.add(end);
        Queue<String> queue = new LinkedList<>();
        queue.offer(start);
        HashMap<String, Integer> distance = new HashMap<>();
        distance.put(start,1);

        // bfs traverse
        while (!queue.isEmpty()) {

            String word = queue.poll();
            System.out.println(word);
            if (word.equals(end)){
                return distance.get(word);
            }

            // find next words in dictionary
            ArrayList<String> nextWords = getNextWord(word, dict, distance);
            // go from current word to next word
            for (String nextWord: nextWords){
                if (distance.containsKey(nextWord)){
                    continue;
                }
                distance.put(nextWord, distance.get(word) + 1);
                queue.offer(nextWord);
            }
        }

        return 0;
    }

    public static ArrayList<String> getNextWord(String word, Set<String> dict, HashMap<String, Integer> distance ){

        int length = word.length();
        char[] chars = word.toCharArray();
        ArrayList<String> nextWords = new ArrayList<>();

        for (int i = 0; i < length; i++){
            for (char replace = 'a'; replace <= 'z'; replace++){
                // not get the same word
                if ( chars[i] == replace){
                    continue;
                }
                // add nextWord into list
                chars[i] = replace;
                String newWord =  new String(chars);
                if (dict.contains(newWord) && !distance.containsKey(newWord)){
                    nextWords.add(newWord);
                }
                // recover chars[]
                chars = word.toCharArray();
            }
        }

        return nextWords;
    }
}
