package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamF {
    public static void main(String[] args) {
        List<PersonTwo> people = new ArrayList<>();
        people.add(new PersonTwo("milad","rostami","shiraz",455l));
        people.add(new PersonTwo("reza","zare","shiraz",500l));
        people.add(new PersonTwo("hamed","ahmadzade","shiraz",400l));
        people.add(new PersonTwo("esmaeil","mordaki","shiraz",700l));
        people.add(new PersonTwo("ali","mordaki","shiraz",350l));
        people.add(new PersonTwo("ali","mordaki","shiraz",350l));



//        Double sumSalary =  people.stream().mapToDouble(PersonTwo::getSalary).reduce(0.0,
//                (a,b)-> a+b);
//        OptionalDouble sumSalary1 =  people.stream().mapToDouble(PersonTwo::getSalary).reduce(
//                (a,b)-> a+b);
//        Optional<PersonTwo> optionalPersonTwo = people.stream().max((p1,p2)-> Double.compare(p1.getSalary(),p2.getSalary()));
//        Optional<PersonTwo> optionalPersonTwo1 = people.stream().min(Comparator.comparingDouble(PersonTwo::getSalary));
//
//        HashSet<PersonTwo> personTwoHashSet = people.stream().filter(personTwo -> personTwo.getSalary() > 450)
//                        .collect(HashSet::new,(people1,person)-> people1.add(person),(peopleHashSet1,peopleHashSet2)->
//                                peopleHashSet1.addAll(peopleHashSet2));


//        List<PersonTwo> personTwos =  people.stream().collect(Collectors.toList());
//       Long personTwos1 =  people.stream().collect(Collectors.counting());
//        System.out.println("List :" +  personTwos);
//        System.out.println("the counting : " + " " + personTwos1);
//        System.out.println(sumSalary);
//        System.out.println(sumSalary1);
//        System.out.println(optionalPersonTwo);
//        System.out.println(optionalPersonTwo1);
//        System.out.println(personTwoHashSet);


//Map<String,Long> peopleToMap = people.stream().collect(Collectors.toMap(PersonTwo::getFirstName,PersonTwo::getSalary));
//Map<String,Long> peopleToMap2 = people.stream().collect(Collectors
//        .toMap(PersonTwo::getFirstName,PersonTwo::getSalary,(value1,value2)-> value1>value2 ? value1 : value2,TreeMap::new));
//      System.out.println(peopleToMap);
//        System.out.println(peopleToMap2.getClass());
//
//        String peopleToString = people.stream().map(PersonTwo::getFirstName).collect(Collectors.joining(",","<all-names>","</all-names>"));
//
//        System.out.println(peopleToString);

 DoubleSummaryStatistics statistics = new DoubleSummaryStatistics();
 statistics.accept(5);
 statistics.accept(10);
 statistics.accept(15);
 statistics.accept(20);

        System.out.println(statistics);


        DoubleSummaryStatistics summaryStatistics = people.stream().mapToDouble(PersonTwo::getSalary).summaryStatistics();
    summaryStatistics.combine(statistics);
        System.out.println(summaryStatistics);











    }



}
