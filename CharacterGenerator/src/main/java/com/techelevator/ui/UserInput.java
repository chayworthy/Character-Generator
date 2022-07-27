package com.techelevator.ui;

import java.util.Scanner;

public class UserInput {

    private static Scanner scanner = new Scanner(System.in);

    public static String getHomeScreenOption(){
        System.out.println("What would you like to do?");
        System.out.println();

        System.out.println("M) Make a Character");
        System.out.println("D) Display Current Character");
        System.out.println("E) Exit");

        System.out.println();
        System.out.println("Please choose an option: ");

        String selectedOption = scanner.nextLine();
        String option = selectedOption.trim().toLowerCase();
        System.out.println("Option = " + option);
        if(option.equals("m")){
            return "make";
        }
        else if(option.equals("d")){
            return "display";
        }
        else if(option.equals("e")){
            return "exit";
        }
        else {
            return "";
        }
    }

    public static String getAgeOption(){
        System.out.println("How old is your character?");
        System.out.println();

        System.out.println("Please enter a number: ");
        String selectedOption = scanner.nextLine();
        String age = selectedOption;
        System.out.println("Age = " + age);
        return age;
    }

    public static String getNameOption(){
        System.out.println("What is your characters name?");
        System.out.println();

        System.out.println("Please enter a name: ");
        String selectedName = scanner.nextLine();
        String name = selectedName;
        System.out.println("Name = " + name);
        return name;
    }

}
