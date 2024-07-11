package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamE {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("milad","rostami","shiraz"));
        people.add(new Person("reza","zare","shiraz"));
        people.add(new Person("hamed","ahmadzade","shiraz"));
        people.add(new Person("esmaeil","mordaki","shiraz"));
        people.add(new Person("ali","mordaki","shiraz"));

/*        people.stream()
                .filter(person -> !"hamed".equals(person.getFirstName()))
                .peek(person -> System.out.println("The value person: " + person.getFirstName()))
                .forEach(person -> System.out.println(person));*/

     /*   people.stream()
                .takeWhile(person -> !"hamed".equals(person.getFirstName()))
                .peek(person -> System.out.println("The value person: " + person.getFirstName()))
                .forEach(person -> System.out.println(person));*/

       /* people.stream()
                .mapToDouble(person -> person.getFirstName().length())
                .peek(person -> people.isEmpty())
                .forEach(person -> System.out.println(person));*/

        System.out.println(Stream.of("Milad1","Milad2","Milad3","Ali1")
                .map(name -> name.chars())
                .flatMap(intStream -> intStream.mapToObj(value -> (char)value))
                .filter(character -> character == 'i')
                .count());
    }



}
