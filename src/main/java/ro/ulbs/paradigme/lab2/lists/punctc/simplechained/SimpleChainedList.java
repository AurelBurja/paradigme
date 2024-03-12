package ro.ulbs.paradigme.lab2.lists.punctc.simplechained;

import ro.ulbs.paradigme.lab2.lists.punctc.api.IMyList;
import ro.ulbs.paradigme.lab2.lists.punctc.api.INode;

/**
 * Lista simplu inlantuita
 */
public class SimpleChainedList implements IMyList {

    private SimpleChainedNode firstNode;

    public SimpleChainedList() {
        firstNode = null;
    }

    @Override
    public void addValue(int value) {
        SimpleChainedNode newNode = new SimpleChainedNode();
        newNode.setValue(value);

        if (firstNode == null) {
            firstNode = newNode;
        } else {
            //cautarea ultimului nod;
            SimpleChainedNode lastNode = firstNode;
            while (lastNode.getNextNode() != null) {
                lastNode = lastNode.getNextNode();
            }
            lastNode.setNextNode(newNode);
        }
    }

    @Override
    public void listNodes() {
        SimpleChainedNode node = firstNode;
        System.out.println();
        System.out.print("lista simplu inlantuita: [");
        while (node != null) {
            System.out.print(" " + node.getValue());
            node = node.getNextNode();
        }
        System.out.print("]");
        System.out.println();
    }

    @Override
    public INode getNodeByValue(int value) {
        SimpleChainedNode node = firstNode;
        while (node != null) {
            if (node.getValue() == value) {
                return node;
            }
            node = node.getNextNode();
        }
        return null;
    }

    @Override
    public void removeNodeByValue(int value) {
        if (firstNode == null) {
            return;
        }
        if (firstNode.getValue() == value) {
            //cazul cand primul nod trebuie eliminat
            firstNode = firstNode.getNextNode();
        } else {
            SimpleChainedNode prevNode = firstNode;
            SimpleChainedNode node = firstNode.getNextNode();
            while (node != null) {
                if (node.getValue() == value) {
                    prevNode.setNextNode(node.getNextNode());
                }
                prevNode = node;
                node = node.getNextNode();
            }
        }
    }

    public int sum() {
        int suma = 0;
        SimpleChainedNode node = firstNode;
        while (node != null) {
            suma += node.getValue();
            node = node.getNextNode();
        }
        return suma;
    }
    
    @Override
    public boolean isSorted(boolean ascending) {
        if (firstNode == null) {
            return false;
        }
        boolean isSorted = true;
        SimpleChainedNode node = firstNode;
        int prevValue = firstNode.getValue();
        while (node != null) {
            if (ascending) {
                //ascending check
                if (prevValue > node.getValue()) {
                    isSorted = false;
                    break;
                }
            } else {
                // descending check
                if (prevValue < node.getValue()) {
                    isSorted = false;
                    break;
                }
            }
            node = node.getNextNode();
        }
        return isSorted;
    }
}
