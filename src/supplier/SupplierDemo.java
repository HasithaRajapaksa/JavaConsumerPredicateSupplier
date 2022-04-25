package supplier;

import java.util.Arrays;
import java.util.List;

public class SupplierDemo {

    // Supplier is a type of functional interface and return type is String

    public static void main(String[] args) {

        //List<String> list1 = Arrays.asList("i","b","c","d","e");
        List<String> list1 = Arrays.asList();

        // orElseGet accepts a Supplier Object
        // orElseGet is Optional Feature method
        //if not find anything the print "Not contains" - empty array list

        System.out.println(list1.stream().findAny().orElseGet(() -> "Not contains"));



    }
}
