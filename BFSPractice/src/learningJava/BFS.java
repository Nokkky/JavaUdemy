package learningJava;

import java.util.*;

public class BFS {

    /**
     *         Queue<T> queue = new LinkedList<>();
     *         Set<T> set = new HashSet<>();
     *         // head has been visited
     *         set.add(start);
     *         // head node enter queue.
     *         queue.offer(start);
     *         while (!queue.isEmpty()) {
     *              // head of queue leaving
     *             T head = queue.poll();
     *             // visit neighbors of current node.
     *             for (T neighbor : head.neighbors) {
     *                 if (!set.contains(neighbor)) {
     *                     set.add(neighbor);
     *                     queue.offer(neighbor);
     *                 }
     *             }
     *         }
     * */
    public void bfs(){
        Queue<DirectedGraphNode> queue = new LinkedList<DirectedGraphNode>();
        Set<DirectedGraphNode> set = new HashSet<DirectedGraphNode>();
        DirectedGraphNode start = new DirectedGraphNode(0);
        set.add(start);
        queue.offer(start);
        while(!queue.isEmpty()){
            DirectedGraphNode head = queue.poll();
            for (DirectedGraphNode neighbor : head.neighbors) {
                if (!set.contains(neighbor)) {
                    set.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }



    }

}

