package com.home.dev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

       //Manual dynamic array
        /*Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);
        numbers.removeAt(4);
        numbers.print();
        System.out.println(numbers.indexOf(1));

        //Java dynamic arrays built in
        ArrayList<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.remove(1);
        list.indexOf(70);
        System.out.println(list.contains(100));
        System.out.println(list); */

        //Manual linked list

        //Java linked lists built in
        /*list<Integer> linkList = new list<>();
        list.add(10);
        linkList.add(20);
        linkList.add(30);
        linkList.add(40);
        linkList.addFirst(5);
        linkList.removeFirst();
        System.out.println(linkList);
        System.out.println(linkList);
        System.out.println(linkList.contains(20));
        System.out.println(linkList.indexOf(30));*/

        //Manual linked list
        var manualList = new ManualLinkedList();
        manualList.addLast(10);
        manualList.addLast(20);
        manualList.addLast(30);
        manualList.addFirst(5);
        manualList.addLast(40);
        manualList.removeFirst();
        manualList.removeLast();
        System.out.println(manualList.contains(30));
    }
}
