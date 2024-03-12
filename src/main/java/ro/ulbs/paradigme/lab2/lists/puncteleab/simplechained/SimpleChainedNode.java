package ro.ulbs.paradigme.lab2.lists.puncteleab.simplechained;

import ro.ulbs.paradigme.lab2.lists.puncteleab.api.INode;

public class SimpleChainedNode implements INode {
    
    private int value;
    private SimpleChainedNode nextNode;

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void setValue(int val) {
        this.value = val;
    }

    public SimpleChainedNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(SimpleChainedNode nextNode) {
        this.nextNode = nextNode;
    }

    
}
