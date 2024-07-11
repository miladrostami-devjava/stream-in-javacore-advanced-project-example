package org.example;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamB {
    public static void main(String[] args) {
        //example 1
        List<Integer> numbers = List.of(3,4,6,8,56,34,23,22,55);
        Iterator<Integer> iterator = numbers.stream().iterator();
     //   iterator.forEachRemaining(number-> System.out.println(number));
     //   numbers.stream().forEach(number-> System.out.println(number));
     /*   numbers.stream().parallel().forEach(number->
                System.out.println( Thread.currentThread().getName() + "->" +  number));*/

        //example 2
    //    numbers.stream().parallel().forEachOrdered(number-> System.out.println( Thread.currentThread().getName() + "->" +  number));
        //example 3
   //numbers.stream().parallel().unordered().skip(2).limit(3).findFirst().ifPresent(number-> System.out.println(number));
        //example 4
       /* Stream.of(new Date()).map(date -> date.getTime()).map(aLong -> Long.valueOf(aLong).toString()).toArray();
        Stream.ofNullable(args[0]);*/
        //example 4
      /*  Stream.Builder<String> builder = Stream.<String>builder().add("milad1").add("milad2").add("milad3");
        builder.add("rostami");
        builder.build().iterator().forEachRemaining(builder);*/
        //example 5
        Stream.<String>builder().add("milad1").add("milad2").add("milad3").build().iterator().forEachRemaining(build->  System.out.println(build));
        //example 6

        IntStream.range(0,10).iterator().forEachRemaining((Consumer<? super Integer>)  value -> System.out.println(value));
        //example 7

        IntStream.rangeClosed(0,10).iterator().forEachRemaining((Consumer<? super Integer>)  value -> System.out.println(value));

        //example 8
        Stream<String> stream = Stream.empty();
        System.out.println(stream);


    }
}
