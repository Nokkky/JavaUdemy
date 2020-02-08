package learningJava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Definition for Undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) {
 *         label = x;
 *         neighbors = new ArrayList<UndirectedGraphNode>();
 *     }
 * }
 */

public class CloneGraph137 {
    /**
     * @param node: A undirected graph node
     * @return: A undirected graph node
     */
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        // write your code here
        //
        // while queue is not empty
        //      poll first node as startNode in queue
        //          copy startNode as copynode
        //      add startNode's neighbors into queue (if not added)
        //          if neighbor is not created, create and add to copyNode's neighbor
        //          if neighbor is created, directed add to copyNode's neighbor.

        // node enter queue
        if (node == null){
            return null;
        }
        Queue<UndirectedGraphNode> queue = new LinkedList<UndirectedGraphNode>();
        queue.offer(node);

        // creating mapping from old node to new node
        HashMap<UndirectedGraphNode, UndirectedGraphNode> mapping = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();

        while (!queue.isEmpty()){

            // poll first element as startNode
            UndirectedGraphNode startNode = queue.poll();
            // copy startNode
            UndirectedGraphNode copyNode;
            if (!mapping.containsKey(startNode)){
                copyNode = new UndirectedGraphNode(startNode.label);
                mapping.put(startNode, copyNode);
            }else{
                copyNode = mapping.get(startNode);
            }

            // add neighbors into queue
            for(UndirectedGraphNode neighbor: startNode.neighbors){

                // if neighbor not created, create and add neighbor to mapping
                // add neighbor to copyNode neighbor
                // add neighbor to queue
                if (!mapping.containsKey(neighbor)){
                    // add neighbor to queue
                    queue.offer(neighbor);
                    // copy copyNeighbor
                    UndirectedGraphNode copyNeighbor = new UndirectedGraphNode(neighbor.label);
                    copyNode.neighbors.add(copyNeighbor);
                    mapping.put(neighbor, copyNeighbor);
                    continue;
                }
                // else add neighbor to copyNode neighbor
                copyNode.neighbors.add(mapping.get(neighbor));
            }
        }
        return mapping.get(node);
    }
}