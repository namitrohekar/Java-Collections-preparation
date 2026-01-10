package collections.set;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SetOverview {

    public static void main(String[] args) {

        // HashSet ->no order, no duplicates
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(7);
        hashSet.add(11);
        hashSet.add(99);
        hashSet.add(88);
        hashSet.add(12);
        hashSet.add(7);
        hashSet.add(1);

        System.out.println("HashSet : " + hashSet);

        // LinkedHashSet -> insertion order, no duplicates
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(7);
        linkedHashSet.add(11);
        linkedHashSet.add(99);
        linkedHashSet.add(88);
        linkedHashSet.add(12);
        linkedHashSet.add(7);
        linkedHashSet.add(1);

        System.out.println("LinkedHashSet : " + linkedHashSet);

        // TreeSet via NavigableSet -> sorted order, no duplicates
        NavigableSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(7);
        treeSet.add(11);
        treeSet.add(99);
        treeSet.add(88);
        treeSet.add(12);
        treeSet.add(7);
        treeSet.add(1);

        System.out.println("TreeSet : " + treeSet);
        
        
        
     // EnumSet -> only enum values, very fast and memory efficient
        EnumSet<Day> enumSet = EnumSet.of(Day.MONDAY, Day.WEDNESDAY, Day.FRIDAY);
        enumSet.add(Day.SUNDAY);

        System.out.println("EnumSet : " + enumSet);
        
    }
    
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    
}
