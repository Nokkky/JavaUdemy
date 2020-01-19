package learningJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Main {


    public static void main(String[] args) {
	// write your code here

    }

    public ArrayList<DirectedGraphNode> topSort(ArrayList<DirectedGraphNode> graph){
        /** Topological Sort
         *  1. Graph representation
         *  2. in-degree -- inDegree
         *  3. Queue -- q
         *  4. Result -- result **/
        ArrayList<DirectedGraphNode> result = new ArrayList<DirectedGraphNode>();

        HashMap<DirectedGraphNode, Integer> inDegree = new HashMap();

        for (DirectedGraphNode node : graph){
            for(DirectedGraphNode neighbor : node.neighbors){
                if (inDegree.containsKey(neighbor)){
                    inDegree.put(neighbor, inDegree.get(neighbor) + 1);
                    continue;
                }
                inDegree.put(neighbor, 1);

            }
        }

        Queue<DirectedGraphNode> q = new LinkedList<DirectedGraphNode>();
        for (DirectedGraphNode node : graph){
            if(!inDegree.containsKey(node)){
                q.offer(node);
                result.add(node);
            }
        }

        while (!q.isEmpty()){
            DirectedGraphNode node = q.poll();
            for (DirectedGraphNode n : node.neighbors){
                inDegree.put(n,inDegree.get(n) - 1);
                if (inDegree.get(n) == 0){
                    result.add(n);
                    q.offer(n);
                }
            }
        }

        return result;
    }
}

/** Topological Sort
 *  1. Graph representation -- graph, ArrayList
 *  2. in-degree -- inDegree, HashMap
 *      inDegree.put(objectKey, keyValue)
 *      inDegree.get(objectKey)
 *      inDegree.containKey(objectKey)
 *  3. Queue -- q
 *      q.offer(object)
 *      q.poll()
 *
 *  4. Result -- result, ArrayList
 *      result.add()
 *  -------------------------------------
 *  1. Build  inDegree
 *      -- Traversal all nodes.
 *      -- if Map contain node, node degree ++ & continue;
 *      -- if Map does not contain node, node degree = 1 & continue;
 *  2. Insert 0 in-degree nodes into queue
 *      -- For all node in graph, if nodeDegree == 0 insert into q and insert into result.
 *  3. Build result
 *      -- For first node a in q, pop node
 *      -- All a's neighbors' in-degree--
 *      -- Go to first step continue until all q.empty() == true **/
