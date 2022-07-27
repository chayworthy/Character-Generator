package com.techelevator.ui;

import java.util.Scanner;

public class UserInputClass {

   private static Scanner scanner = new Scanner(System.in);

    public static String getClassOption(){
        System.out.println("What class would you like to play?");
        System.out.println();

        System.out.println("1) Barbarian");
        System.out.println("2) Bard");
        System.out.println("3) Cleric");
        System.out.println("4) Druid");
        System.out.println("5) Fighter");
        System.out.println("6) Monk");
        System.out.println("7) Paladin");
        System.out.println("8) Ranger");
        System.out.println("9) Rogue");
        System.out.println("10) Sorcerer");
        System.out.println("11) Warlock");
        System.out.println("12) Wizard");

        System.out.println("Please choose a number: ");
        String selectedOption = scanner.nextLine();
        String choice = selectedOption;
        System.out.println("Choice = " + choice);

        if(choice.equals("1")){
            return "Barbarian";
        }
        else if(choice.equals("2")){
            return "Bard";
        }
        else if(choice.equals("3")){
            return "Cleric";
        }
        else if(choice.equals("4")){
            return "Druid";
        }
        else if(choice.equals("5")){
            return "Fighter";
        }
        else if (choice.equals("6")){
            return "Monk";
        }
        else if (choice.equals("7")){
            return "Paladin";
        }
        else if (choice.equals("8")){
            return "Ranger";
        }
        else if (choice.equals("9")){
            return "Rogue";
        }
        else if (choice.equals("10")){
            return "Sorcerer";
        }
        else if (choice.equals("11")){
            return "Warlock";
        }
        else if (choice.equals("12")){
            return "Wizard";
        }
        else {
            return "";
        }
    }
}
