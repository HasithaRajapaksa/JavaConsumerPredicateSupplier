package predicate;

import java.util.Arrays;
import java.util.List;

public class PredicateDemo {

    // Predicate is a type of functional interface and return type is boolean

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1,2,3,4,5);

        //filter accepts a Predicate object (predicate returns boolean) - boolean
        //foreach accepts a Consumer object - void

        list1
                .stream()
                .filter(t -> t % 2 == 0)
                .forEach(t -> System.out.println("even value"+t) );

    }}
