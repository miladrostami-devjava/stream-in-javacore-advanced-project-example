package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class StreamG {
    public static <Set> void main(String[] args) {
        List<PersonTwo> people = new ArrayList<>();
        people.add(new PersonTwo("milad","rostami","shiraz",455l, PersonTwo.Gender.MALE));
        people.add(new PersonTwo("zahra","zare","shiraz",500l, PersonTwo.Gender.FEMALE));
        people.add(new PersonTwo("hamed","ahmadzade","shiraz",400l, PersonTwo.Gender.MALE));
        people.add(new PersonTwo("esmaeil","mordaki","shiraz",700l, PersonTwo.Gender.MALE));
        people.add(new PersonTwo("ali","mordaki","shiraz",350l, PersonTwo.Gender.MALE));
        people.add(new PersonTwo("ali","mordaki","shiraz",350l, PersonTwo.Gender.MALE));


   /*     Map<String,List<PersonTwo>> stringListMap = people.stream().collect(Collectors.groupingBy(PersonTwo::getFirstName));
        System.out.println(stringListMap);*/



        System.out.println("----------------");



     /*   Map<String,Long> stringLongMap = people.stream().collect(Collectors.groupingBy(PersonTwo::getFirstName,Collectors.counting()));
        System.out.println("string long map :" + " " + stringLongMap);
        Map<String,Long> stringLongMap2 = people.stream()
                .collect(Collectors.groupingBy(PersonTwo::getFirstName,Collectors.summingLong(PersonTwo::getSalary)));
        System.out.println(stringLongMap2);*/


        System.out.println("----------------");



      /*  Map<String,String> stringStringMap = people
                .stream()
                .collect(Collectors.groupingBy(PersonTwo::getFirstName
                        ,Collectors.mapping(o->String.valueOf(o.getSalary())
                     ,   Collectors.joining(",","<names>","</names>"))));*/




        /*Map<String,Long> stringDoubleMap = people.stream().collect(Collectors.groupingBy(PersonTwo::getFirstName,
                Collectors.filtering(personTwo -> personTwo.getSalary()>325,Collectors.summingLong(PersonTwo::getSalary))));


        System.out.println(stringDoubleMap);*/


        System.out.println("----------------");


  /*      Map<PersonTwo.Gender,Map<String,Long>> genderMapMap = people.stream().collect(
                Collectors.groupingBy(PersonTwo::getGender,
                        Collectors.groupingBy(PersonTwo::getFirstName,Collectors.summingLong(PersonTwo::getSalary))));

        System.out.println(genderMapMap);*/

   /*    Map<String, java.util.Set<PersonTwo>>  setMap = people.stream().collect(Collectors.groupingBy(PersonTwo::getFirstName,
                Collectors.collectingAndThen(Collectors.toSet(), Collections::unmodifiableSet)));
        System.out.println(setMap);*/

     /*  Map<Boolean,List<PersonTwo>> booleanListMap = people.stream().collect(Collectors.partitioningBy(o->o.getGender() == PersonTwo.Gender.MALE));
        System.out.println(booleanListMap);*/




/*           Map<Boolean,String> booleanListMap1 = people.stream()
                   .collect(Collectors.partitioningBy(o->o.getGender() == PersonTwo.Gender.MALE,Collectors.mapping(PersonTwo::getFirstName,
                           Collectors.joining(","))));
        System.out.println(booleanListMap1);*/


        System.out.println(people.stream().allMatch(personTwo -> personTwo.getSalary()>780));
        System.out.println(people.stream().anyMatch(personTwo -> personTwo.getSalary()>780));
        System.out.println(people.stream().noneMatch(personTwo -> personTwo.getSalary()>780));


    }



}
