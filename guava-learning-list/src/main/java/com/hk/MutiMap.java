package com.hk;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Lists;

import java.util.Collections;

public class MutiMap {
    public static void main(String[] args) {
        ArrayListMultimap<String, Integer> multimap = ArrayListMultimap.create();

        multimap.put("aa", 1);
        multimap.put("aa", 2);
        multimap.put("aa", 3);
        multimap.put("aa", 3);

        multimap.putAll("age", Lists.newArrayList(1,2,3));

        System.out.println(multimap.keys()); // [aa x 4, age x 3]
        System.out.println(multimap.keySet()); // [aa, age]
        System.out.println(multimap.get("aa")); // [1, 2, 3, 3]
        System.out.println(multimap.get("age")); // [1, 2, 3]
        System.out.println(multimap); // {aa=[1, 2, 3, 3], age=[1, 2, 3]}
        System.out.println(multimap.containsEntry("aa", Lists.newArrayList(
                1, 2, 3, 3)));
    }
}
