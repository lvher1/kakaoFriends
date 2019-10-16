package com.company;

import java.util.Calendar;

abstract class Animal {
    private String name;
    public Animal(String name){this.name=name;}
    public abstract void sound();
    public String getName(){return name;}

}
class Dog extends Animal{
    private String type;
    public Dog(String name,String type){
        super(name);
        this.type = type;
    }
    public void sound(){
        System.out.println("멍멍");
    }
}
/*
class Cat extends Animal{
    private int age;
    public Cat(String name,int age){
        super(age);
        this.age = age;
    }
    public void setAge(){
        System.out.println("멍멍");
    }
}*/
class cat extends Animal{
    private String age;
    public cat(String name,String age){
        super(age);
        this.age = age;
    }
    public void sound(){
        System.out.println("냐옹");
    }
}
class AnimalSound{
    public static void main(String[] args) {
        Animal[] a= new Animal[2];
        a[0]= new Dog("뿌꾸","똥개");
        a[1]= new cat("도꼬","2");
        for(Animal s : a){
            System.out.println(s.getName()+"");
            s.sound();
            System.out.println();
        }
    }
}
