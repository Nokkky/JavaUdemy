package learningJava;

import java.util.*;

public class BFS {

    class DirectedGraphNode {
        int label;
        List<DirectedGraphNode> neighbors;

        public void add(){

        }
    }

    Queue<DirectedGraphNode> queue = new LinkedList<>();
    Set<DirectedGraphNode> set = new HashSet<>();
    DirectedGraphNode start = new DirectedGraphNode();
    set.add(start);
        queue.offer(start);
        while(!queue.isEmpty()){
            int head = queue.poll();
            for (T neighbor : head.neighbors) {
                if (!set.contains(neighbor)) {
                    set.add(neighbor);
                    queue.offer(neighbor);
                }
        }
    }

}

