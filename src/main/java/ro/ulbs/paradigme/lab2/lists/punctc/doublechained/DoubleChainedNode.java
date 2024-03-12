package ro.ulbs.paradigme.lab2.lists.punctc.doublechained;

import ro.ulbs.paradigme.lab2.lists.punctc.api.INode;

/**
 * Nod dublu inlantuit: nod anterior, not urmator
 */
public class DoubleChainedNode implements INode {

    private int value;
    private DoubleChainedNode prevNode;
    private DoubleChainedNode nextNode;

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void setValue(int val) {
        this.value = val;
    }

    public DoubleChainedNode getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(DoubleChainedNode prevNode) {
        this.prevNode = prevNode;
    }

    public DoubleChainedNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(DoubleChainedNode nextNode) {
        this.nextNode = nextNode;
    }
}
