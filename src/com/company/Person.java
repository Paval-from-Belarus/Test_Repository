package com.company;

public class Person {
protected int height = 180, years;
private String name = new String("Anonimus");
public void say(String name){
    System.out.print("Hello" + name);
}
public String GetName(){
 return name;
}
public Person(){}
public Person(int height, int years){
    this.years = years; this.height = height;
}
}
