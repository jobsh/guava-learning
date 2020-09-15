package com.hk;

import com.google.common.collect.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ListDemo {
    public static void main(String[] args) {
        // 普通Collection的创建 newArrayList(), 创建一个空的ArrayList
        ArrayList<Object> list = Lists.newArrayList();
        // newArrayList(E... elements)：构造一个可变的包含传入元素elements的ArrayList实例。
        List<Integer> list1 = Lists.newArrayList(1, 2, 3);
        List<Integer> list2 = Lists.newArrayList(4, 5, 6);

        // newArrayList(Iterable<? extends E> elements) , 构造一个可变的包含传入元素elements的ArrayList实例
        Lists.newArrayList(list1);
        List<List> lists = Lists.asList(list1, new List[]{list1, list2});
        List<String> lists2 = Lists.asList("aa", new String[]{"bb"});

        System.out.println("lists" + lists);
        System.out.println(lists2);
        Set<String> set = Sets.newHashSet();
        Map<String, String> map = Maps.newHashMap();

        System.out.println(list1);

// 不变Collection的创建
        ImmutableList<String> iList = ImmutableList.of("aa", "b", "c");
        ImmutableSet<String> iSet = ImmutableSet.of("e1", "e2");
        ImmutableMap<String, String> iMap = ImmutableMap.of("k1", "v1", "k2", "v2");

        ImmutableList<String> immutableList = ImmutableList.of("1","2","3","4");

        System.out.println(iList.stream().filter(e -> e.equals("aa")).map(String::length).collect(Collectors.toList()));


    }
}
