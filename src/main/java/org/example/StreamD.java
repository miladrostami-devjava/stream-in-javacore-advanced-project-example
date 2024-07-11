package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamD {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("milad","rostami","shiraz"));
        people.add(new Person("reza","zare","shiraz"));
        people.add(new Person("hamed","ahmadzade","shiraz"));
        people.add(new Person("esmaeil","mordaki","shiraz"));
        people.add(new Person("ali","mordaki","shiraz"));


//        Person person = findPersonByFirstname("milad",people);
//
//        Person sara = findPersonByFirstname("sara",people);
//        System.out.println(person.getFirstName());
//        System.out.println(sara.getFirstName());


        Optional<Person> ali =  findPersonByFirstname("ali",people);
if (ali.isPresent()){
    System.out.println(ali.get().getCity());
}
     //   System.out.println(ali.orElse(new Person("ali","zare","tehran")));



    }

    public static Optional<Person> findPersonByFirstname(String firstName,List<Person> people){
        for (Person p:
                people) {
            if (firstName.equals(p.getFirstName())){
                return Optional.of(p);
            }
        }
        return null;
    }

/*    public static Person findPersonByFirstname(String firstName,List<Person> people){
        for (Person p:
             people) {
            if (firstName.equals(p.getFirstName())){
                return p;
            }
        }
        return null;
    }*/
}
