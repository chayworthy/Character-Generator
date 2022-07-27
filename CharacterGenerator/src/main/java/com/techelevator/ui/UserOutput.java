package com.techelevator.ui;

import com.techelevator.assets.CharacterSheet;

public class UserOutput {

    public static void displayWelcomeScreen(){
        System.out.println();
        System.out.println("***************************************************");
        System.out.println("        Welcome to the Character Generator         ");
        System.out.println("***************************************************");
        System.out.println();
    }

    public static void displayChooseRace(){
        System.out.println();
        System.out.println("***************************************************");
        System.out.println("                   Choose a Race                   ");
        System.out.println("***************************************************");
        System.out.println();
    }

    public static void displayChooseClass(){
        System.out.println();
        System.out.println("***************************************************");
        System.out.println("                   Choose a Class                  ");
        System.out.println("***************************************************");
        System.out.println();
    }

    public static void displayChooseAge(){
        System.out.println();
        System.out.println("***************************************************");
        System.out.println("                    Enter Your Age                 ");
        System.out.println("***************************************************");
        System.out.println();
    }

    public static void displayChooseName(){
        System.out.println();
        System.out.println("***************************************************");
        System.out.println("                  Enter Your Name                  ");
        System.out.println("***************************************************");
        System.out.println();
    }

    public static void displayCharacterSheet(){
        System.out.println();
        System.out.println("***************************************************");
        System.out.println("               Here's Your Character               ");
        System.out.println("***************************************************");
        System.out.println();
    }

    public static void goodByeMessage(){
        System.out.println("Thank you for using the Character Creator!");
        System.out.println("See you next time!");
    }

}
