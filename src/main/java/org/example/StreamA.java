package org.example;

import java.util.List;
import java.util.stream.Stream;

public class StreamA {
    public static void main(String[] args) {
        //example 1
        List<Integer> numbers = List.of(3,4,6,8,56,34,23,22,55);
        //imperative programming
        /*int sum = 0;
        for (int number:numbers) {
            if (number %2 == 1){
                int square = number*number;
                sum += square;
            }
        }
        System.out.println(sum);*/

        //functional programming
/*      int sum =  numbers.stream()
                .filter(number -> number %2 == 1)
                .map(number -> number*number)
              .reduce(0,Integer::sum);
        System.out.println(sum);*/
        //example 2
//parallel functional programming
 /*       int sum =  numbers.parallelStream()
                .filter(number -> number %2 == 1)
                .map(number -> number*number)
                .reduce(0,Integer::sum);
        System.out.println(sum);*/

       //example 3

        Stream<Integer> stream =  numbers.stream()
                .filter(number -> number %2 == 1)
                .map(number -> number*number);
                int sum =  stream.reduce(0,Integer::sum);
        System.out.println(sum);
    }
}
