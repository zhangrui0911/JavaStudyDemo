package com.zenroten.javales.reflect;

/**
 * @author Zr
 * @create 2020-02-27 16:07
 */
public class Person {
    private Integer id;
    private String name;
    private int age;
    public int hight;

    public int a(){
        System.out.println("我是a方法");
        return 1;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
        super();
    }

    public Person(Integer id) {
        this.id = id;
    }

    public Person(Integer id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", hight=" + hight +
                '}';
    }
}