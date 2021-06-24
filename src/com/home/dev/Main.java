package com.home.dev;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
       //Manual dynamic array
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);
        numbers.removeAt(4);
        numbers.print();
        System.out.println(numbers.indexOf(1));

        //Java built-in dynamic arrays handler
        ArrayList<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.remove(1);
        list.indexOf(70);
        list.contains(100);
        System.out.println(list);


    }
}
