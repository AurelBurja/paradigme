package ro.ulbs.paradigme.lab2.lists.puncteleab.doublechained;

/**
 * lista dublu inlantuita
 */
public class DoubleChainedList {

    private DoubleChainedNode firstNode;

    public DoubleChainedList() {
        firstNode = null;
    }

    public void addValue(int value) {
        DoubleChainedNode newNode = new DoubleChainedNode();
        newNode.setValue(value);

        if (firstNode == null) {
            firstNode = newNode;
        } else {
            //cautarea ultimului nod;
            DoubleChainedNode lastNode = firstNode;
            while (lastNode.getNextNode() != null) {
                lastNode = lastNode.getNextNode();
            }
            //realizez inlantuirea lastNode -> newNode
            lastNode.setNextNode(newNode);
            newNode.setPrevNode(lastNode);
        }
    }

    public void listNodes() {
        DoubleChainedNode node = firstNode;
        System.out.println();
        System.out.print("lista dublu inlantuita: [");
        while (node != null) {
            System.out.print(" " + node.getValue());
            node = node.getNextNode();
        }
        System.out.print("]");
        System.out.println();
    }

    public void listNodesBackwards() {
        DoubleChainedNode lastNode = firstNode;
        while (lastNode.getNextNode() != null) {
            lastNode = lastNode.getNextNode();
        }

        DoubleChainedNode node = lastNode;
        System.out.println();
        System.out.print("lista dublu inlantuita - inversata: [");
        while (node != null) {
            System.out.println(" " + node.getValue());
            node = node.getPrevNode();
        }
        System.out.print("]");
        System.out.println();
    }

    public DoubleChainedNode getNodeByValue(int value) {
        DoubleChainedNode node = firstNode;
        while (node != null) {
            if (node.getValue() == value) {
                return node;
            }
            node = node.getNextNode();
        }
        return null;
    }

    public void removeNodeByValue(int value) {
        if (firstNode == null) {
            return;
        }
        if (firstNode.getValue() == value) {
            //cazul cand primul nod trebuie eliminat
            firstNode = firstNode.getNextNode();
            firstNode.setPrevNode(null);

        } else {
            DoubleChainedNode node = firstNode.getNextNode();
            while (node != null) {
                if (node.getValue() == value) {
                    DoubleChainedNode prevNode = node.getPrevNode();
                    prevNode.setNextNode(node.getNextNode());
                }
                node = node.getNextNode();
            }
        }
    }

    public int sum() {
        int suma = 0;
        DoubleChainedNode node = firstNode;
        while (node != null) {
            suma += node.getValue();
            node = node.getNextNode();
        }
        return suma;
    }

    public boolean isSorted(boolean ascending) {
        if (firstNode == null) {
            return false;
        }
        boolean isSorted = true;
        DoubleChainedNode node = firstNode;
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
