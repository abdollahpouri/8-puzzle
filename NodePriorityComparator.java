import java.util.Comparator;

/**
 * Created by HABDOLLA on 1/20/2016.
 * This is a comparator used by the priorityQueue to store nodes sorted by the cost value
 */
public class NodePriorityComparator implements Comparator<Node> {

    @Override
    public int compare(Node x, Node y) {
        if (x.getTotalCost() < y.getTotalCost()) {
            return -1;
        }
        if (x.getTotalCost() > y.getTotalCost()) {
            return 1;
        }
        return 0;
    }
}

