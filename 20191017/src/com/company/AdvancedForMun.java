package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class AdvancedForMun {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("가");
        list.add("나");
        list.add("다");
        list.add("라");
        list.add("마");
        list.add("바");

        String[] arr = new String[6];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0;i<6;i++) arr[i]=scanner.next();



        for(String data: list) System.out.println(data);

        //System.out.println(list);
        int size = list.size();
        for(int i =0;i<size;i++) System.out.println(list.get(i));
        int length = arr.length;
        for(int i = 0;i<length;i++) System.out.println(arr[i]);
    }
}
