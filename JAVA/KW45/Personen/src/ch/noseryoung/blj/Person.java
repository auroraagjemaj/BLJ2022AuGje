package ch.noseryoung.blj;

import java.util.Scanner;

public class Person {
private String name;
private Integer age;
private String favouriteColor;
private Person bestFriend;

public Person(String name){
this.name = name;
}
public void presentyourself(){
    System.out.println("Name: " + name + " \nage " + age + " \nfavourite color: " + favouriteColor);

}

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Person getBestFriend() {
        return bestFriend;
    }

    public String getFavouriteColor() {
        return favouriteColor;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBestFriend(Person bestFriend) {
        this.bestFriend = bestFriend;
    }

    public void setFavouriteColor(String favouriteColor) {
        this.favouriteColor = favouriteColor;
    }
}
