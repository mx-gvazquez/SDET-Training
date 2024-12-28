package com.sdet.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class _21_Collections {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Carlos", "Ana", "Beatriz");
        Collections.sort(names);
        System.out.println(names);
        Collections.reverse(names);
        System.out.println(names);

        List<Integer> numbers = Arrays.asList(1,3,7,5);
        System.out.println(Collections.max(numbers));
        Collections.shuffle(numbers);
        System.out.println(numbers);

        List<String> emtpyList = Collections.emptyList();
        Set<String> emtpySet = Collections.emptySet();






    }
}
