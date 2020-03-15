package com.zenroten.javales.class07.demo04;

/**
 * @author Zr
 * @create 2020-03-15 11:46
 */
public class Person {
    public Person(){
        System.out.println("出生！");
    }


    private int id;
    private String name;

    public Person(int id){
        this.id = id;
    }

    public Person(int id, String name){
        this(id);
        this.name = name;
    }

    public Person(String name){
        System.out.println("1参name");
    }

    public Person(String name, int id){
        System.out.println("2参name,id");
    }

    public Person(double id, String name){
        System.out.println("2参double id,name");
    }
}