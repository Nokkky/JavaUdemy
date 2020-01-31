package learningJava;

import java.util.ArrayList;
import java.util.List;

public class DirectedGraphNode {

    int label;
    List<DirectedGraphNode> neighbors;

    public void add(){

    }
    public DirectedGraphNode(int x){
        this.label = x;
        neighbors = new ArrayList<DirectedGraphNode>();
    }

}
