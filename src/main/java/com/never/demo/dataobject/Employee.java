/**
 * Project : spring_toturial
 * Package : com.never.demo.dataobject
 * Author  : xzllc2010<xzllc2010@gmail.com>
 * Create  : On 10/16/2014
 */

package com.never.demo.dataobject;

public class Employee {

    private int id;
    private String name;
    private int age;

    public Employee(){

    }

    public Employee(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    @Override
    public String toString(){
        return  "id= "+ id + ", name= "+ name + ", age= "+ age;
    }

}
