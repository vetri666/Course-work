import java.util.Iterator;
import java.util.LinkedList;

abstract class LinkedListTraversal {
    protected LinkedList<Integer> list;

    // Abstract method for traversing the list
    public abstract void traverse();

    // Method to populate the list with numbers
    public void populateList(int size) {
        list = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
    }
}

class IteratorTraversal extends LinkedListTraversal {
    @Override
    public void traverse() {
        long startTime = System.currentTimeMillis();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Iterator traversal time: " + (endTime - startTime) + " ms");
    }
}

class IndexTraversal extends LinkedListTraversal {
    @Override
    public void traverse() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Index traversal time: " + (endTime - startTime) + " ms");
    }
}

public class TestLinkedListTraversal {
    public static void main(String[] args) {
        int listSize = 5_000_000; // 5 million integers
        LinkedListTraversal iteratorMethod = new IteratorTraversal();
        LinkedListTraversal indexMethod = new IndexTraversal();

        iteratorMethod.populateList(listSize);
        System.out.println("Testing Iterator Traversal:");
        iteratorMethod.traverse();

        System.out.println("Testing Index Traversal:");
        indexMethod.traverse();
    }
}
