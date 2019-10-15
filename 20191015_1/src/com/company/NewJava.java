package com.company;

import java.util.Scanner;

public class NewJava {
    private String name;
    private int age;
    private String addr;
    private int height;

    NewJava(String n,int a, String m, int h){
        name = n; age = a; addr = m; height = h;

    }

    String getName() {return name;}
    int getAge(){return age;}
    String getAddr(){return  addr;}
    int getHeight(){return height;}

    void addAge(int a){age += a;}
    void addHeight(int h){height+=h;}

}
class KakaoFriends{
    public static void main(String[] args){
        NewJava apeach = new NewJava("어피치",12,"판교",150);
        NewJava Ryan = new NewJava("라이언",13,"평택",155);

        apeach.addAge(3);
        Ryan.addHeight(20);
        System.out.println("이름: "+apeach.getName());
        System.out.println("주소: "+apeach.getAddr());
        System.out.println("나이: "+apeach.getAge());
        System.out.println("키: "+apeach.getHeight());
        System.out.println();
        System.out.println("이름: "+Ryan.getName());
        System.out.println("나이: "+Ryan.getAge());
        System.out.println("주소: "+Ryan.getAddr());
        System.out.println("키: "+Ryan.getHeight());
    }
}