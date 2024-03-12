
package ro.ulbs.paradigme.lab2.lists.punctc.api;

/**
 * Interfata pentru liste
 */
public interface IMyList {
    void addValue(int val);
    
    INode getNodeByValue(int val);
    
    void removeNodeByValue(int val);
    
    void listNodes();
    
    boolean isSorted(boolean ascending);
}
