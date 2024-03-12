package ro.ulbs.paradigme.lab2.lists;

import ro.ulbs.paradigme.lab2.lists.punctc.api.IMyList;
import ro.ulbs.paradigme.lab2.lists.puncteleab.doublechained.DoubleChainedList;
import ro.ulbs.paradigme.lab2.lists.puncteleab.simplechained.SimpleChainedList;

public class Application {

    public static void main(String[] args) {
        //2.2 a si 2.2.b
        puncteleAsiB();
        
        //2.2.c cu interfete
        punctC();
    }

    public static void puncteleAsiB() {

        // 2.2.a Lista simplu inlantuita
        SimpleChainedList simpleList = new SimpleChainedList();
        for (int i = 1; i <= 10; i++) {
            simpleList.addValue(i);
        }
        simpleList.removeNodeByValue(4);
        simpleList.removeNodeByValue(6);
        simpleList.removeNodeByValue(8);
        simpleList.removeNodeByValue(10);
        simpleList.listNodes();

        // 2.2.a Lista dublu inlantuita
        DoubleChainedList doubleList = new DoubleChainedList();
        for (int i = 1; i <= 10; i++) {
            doubleList.addValue(i);
        }
        doubleList.removeNodeByValue(1);
        doubleList.removeNodeByValue(2);
        doubleList.removeNodeByValue(3);
        doubleList.listNodes();

        //2.2.b suma elementelor
        System.out.println("\nSuma elementelor listei simplu inlantuite este " + simpleList.sum());
        System.out.println("\nSuma elementelor listei dublu inlantuite este " + doubleList.sum());

        //2.2.c sunt ascendente
        System.out.println("\nLista simplu inlantuite este ordonata crescator: " + simpleList.isSorted(true));
        System.out.println("Lista simplu inlantuite este ordonata descrescator: " + simpleList.isSorted(false));

        System.out.println("\nLista dublu inlantuite este ordonata crescator: " + doubleList.isSorted(true));
        System.out.println("Lista dublu inlantuite este ordonata descrescator: " + doubleList.isSorted(false));
    }

    
     public static void punctC() {
         System.out.println("\n*************************************************");
         System.out.println("2.2.c Cu interfete:");

        // 2.2.c Lista simplu inlantuita
        IMyList listA = new ro.ulbs.paradigme.lab2.lists.punctc.simplechained.SimpleChainedList();
        
        for (int i = 10; i > 0; i--) {
            listA.addValue(i);
        }
        listA.listNodes();
        listA.removeNodeByValue(4);
        listA.removeNodeByValue(6);
        listA.removeNodeByValue(8);
        listA.removeNodeByValue(10);
        listA.listNodes();

        // 2.2.c Lista dublu inlantuita
        IMyList listB = new ro.ulbs.paradigme.lab2.lists.punctc.doublechained.DoubleChainedList();
        for (int i = 10; i > 0; i--) {
            listB.addValue(i);
        }
        listB.removeNodeByValue(1);
        listB.removeNodeByValue(2);
        listB.removeNodeByValue(3);
        listB.listNodes();

        //2.2.c sunt ascendente
        System.out.println("\nLista simplu inlantuita este ordonata crescator: " + listA.isSorted(true));
        System.out.println("Lista simplu inlantuita este ordonata descrescator: " + listA.isSorted(false));

        System.out.println("\nLista dublu inlantuita este ordonata crescator: " + listB.isSorted(true));
        System.out.println("Lista dublu inlantuita este ordonata descrescator: " + listB.isSorted(false));
    }
}
