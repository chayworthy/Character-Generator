package com.techelevator.ui;

import com.techelevator.assets.CharacterSheet;

import java.util.Scanner;

public class UserInputRace {

    private static Scanner scanner = new Scanner(System.in);


    public static String getRaceScreenOption() {
            System.out.println("What race would you like to play?");
            System.out.println();

            System.out.println("1) Dragonborn");
            System.out.println("2) Dwarf");
            System.out.println("3) Elf");
            System.out.println("4) Gnome");
            System.out.println("5) Half-Elf");
            System.out.println("6) Halfling");
            System.out.println("7) Half-Orc");
            System.out.println("8) Human");
            System.out.println("9) Tiefling");

            System.out.println("Please choose a number: ");
            String selectedOption = scanner.nextLine();
            String choice = selectedOption;
            System.out.println("Choice = " + choice);

            if (choice.equals("1")) {
                return "Dragonborn";
            } else if (choice.equals("2")) {
                return "Dwarf";
            } else if (choice.equals("3")) {
                return "Elf";
            } else if (choice.equals("4")) {
                return "Gnome";
            } else if (choice.equals("5")) {
                return "Half-Elf";
            } else if (choice.equals("6")) {
                return "Halfling";
            } else if (choice.equals("7")) {
                return "Half-Orc";
            } else if (choice.equals("8")) {
                return "Human";
            } else if (choice.equals("9")) {
                return "Tiefling";
            } else {
                return "";
            }
        }
    }

