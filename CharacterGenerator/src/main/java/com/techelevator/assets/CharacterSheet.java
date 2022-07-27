package com.techelevator.assets;

import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserInputClass;
import com.techelevator.ui.UserInputRace;

public class CharacterSheet {

    private static String race;
    private static String class_;
    private static String name;
    private static String age;

    public CharacterSheet() {
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getClass_() {
        return class_;
    }

    public void setClass_(String class_) {
        this.class_ = class_;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public CharacterSheet(String race, String class_, String name, String age) {
        this.race = race;
        this.class_ = class_;
        this.name = name;
        this.age = age;
    }

    public static void displayCharacter(){
        System.out.println();
        System.out.println("Your race is: " + race);
        System.out.println();
        System.out.println("Your class is: "+ class_);
        System.out.println();
        System.out.println("Your age is: " + age);
        System.out.println();
        System.out.println("Your name is: " + name);
    }

}
