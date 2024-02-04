package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

       // System.out.println("Hello world!");

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);

            Optional<Integer> res =  numbers
                .stream()
                .filter(t->t%2==0)
                .reduce((a,b) ->a*b);

        System.out.println(res);

    }
}