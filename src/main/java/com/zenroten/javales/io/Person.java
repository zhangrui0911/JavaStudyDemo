package com.zenroten.javales.io;

import java.io.Serializable;

/**
 * @author Zr
 * @create 2020-02-17 14:42
 */
public class Person implements Serializable {

    /**
     * 保证数据一致性
     * 版本号
     */
    private static final long serialVersionUID = -1175492763004791467L;

    private Integer id;
    private String name;
    private Integer age;

    public Integer getId() {
        return id;
    }

    public Person setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person setAge(Integer age) {
        this.age = age;
        return this;
    }
}