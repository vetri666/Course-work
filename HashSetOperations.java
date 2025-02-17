import java.util.LinkedHashSet;

public class HashSetOperations {
    public static void main(String[] args) {
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        LinkedHashSet<String> set2 = new LinkedHashSet<>();

        // Populate the sets
        String[] elements1 = {"George", "Jim", "John", "Blake", "Kevin", "Michael"};
        String[] elements2 = {"George", "Katie", "Kevin", "Michelle", "Ryan"};

        for (String e : elements1) set1.add(e);
        for (String e : elements2) set2.add(e);

        // Perform set operations
        System.out.println("Union: " + union(set1, set2));
        System.out.println("Difference: " + difference(set1, set2));
        System.out.println("Intersection: " + intersection(set1, set2));
    }

    // Union
    public static LinkedHashSet<String> union(LinkedHashSet<String> set1, LinkedHashSet<String> set2) {
        LinkedHashSet<String> result = (LinkedHashSet<String>) set1.clone();
        result.addAll(set2);
        return result;
    }

    // Difference
    public static LinkedHashSet<String> difference(LinkedHashSet<String> set1, LinkedHashSet<String> set2) {
        LinkedHashSet<String> result = (LinkedHashSet<String>) set1.clone();
        result.removeAll(set2);
        return result;
    }

    // Intersection
    public static LinkedHashSet<String> intersection(LinkedHashSet<String> set1, LinkedHashSet<String> set2) {
        LinkedHashSet<String> result = (LinkedHashSet<String>) set1.clone();
        result.retainAll(set2);
        return result;
    }
}
