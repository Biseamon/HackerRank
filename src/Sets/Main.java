package Sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<String> hash_set = new HashSet <>();

        hash_set.add("English");
        hash_set.add("Russian");
        hash_set.add("English");
        hash_set.add("Greek");
        hash_set.add("German");
        hash_set.add("Greek");

        System.out.println(hash_set);


        //Java programs to demonstrate unions, intersections, and differences.
        Set<Integer> a = new HashSet <>();
        a.addAll(Arrays.asList(new Integer[]{1,3,2,4,8,9,0}));
        Set<Integer> b = new HashSet <>();
        b.addAll(Arrays.asList(new Integer[]{1,3,7,5,4,0,7,5}));

        //Union operation
        Set<Integer> union = new HashSet <>(a);
        union.addAll(b);
        System.out.println("Union of the two sets");
        //it sorts the list. It starts from 0 and ends with 9. Also, there are no duplicates.
        System.out.println(union);

        // intersection
        Set<Integer> intersection = new HashSet <>(a);
        intersection.retainAll(b);
        System.out.println("Intersection of the two sets");
        //it sorts the list and keeps only the ones that have duplicates.
        System.out.println(intersection);

        //difference
        Set<Integer> difference = new HashSet <>(a);
        difference.removeAll(b);
        System.out.println("Difference of the two sets");
        //it sorts the list and removes the values that are present only in one of the sets.
        //Here it takes all the values that are present in A and absent in B.
        System.out.println(difference);


    }

}
