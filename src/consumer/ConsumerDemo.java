package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo  {

    // Consumer is void
    // public class ConsumerDemo implements Consumer<Integer>

/*   @Override
    public void accept(Integer integer) {
       System.out.println("print"+integer);
    }
*/

    // Consumer Interface has a default method - accept
    // use anonymous functions can easily use Consumer

    public static void main(String[] args) {

        System.out.println("");

        Consumer<Integer> consumer = (t) -> System.out.println("print"+t);
        consumer.accept(10);

        List<Integer> list1 = Arrays.asList(1,2,3,4,5);

        /*
        foreach method accepts a consumer object
         */

       // list1.stream().forEach(consumer); // output - print 1,2,3,4,5 times

        // short way to use consumer using anonymous functions

        list1
                .stream()
                .forEach( t-> System.out.println("print"+t));
    }
}
