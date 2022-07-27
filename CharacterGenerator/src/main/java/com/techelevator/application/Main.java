package com.techelevator.application;

import com.techelevator.assets.CharacterSheet;
import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserInputClass;
import com.techelevator.ui.UserInputRace;
import com.techelevator.ui.UserOutput;

public class Main extends CharacterSheet {

    public Main() {

    }

    public Main(String race, String class_, String name, String age) {
        super(race, class_, name, age);
    }

    public void run() {
        while (true) {
            UserOutput.displayWelcomeScreen();
            String choice = UserInput.getHomeScreenOption();
                if (choice.equals("make")) {

                    UserOutput.displayChooseRace();
                    String race = UserInputRace.getRaceScreenOption();
                    setRace(race);

                    UserOutput.displayChooseClass();
                    String class_ = UserInputClass.getClassOption();
                    setClass_(class_);

                    UserOutput.displayChooseAge();
                    String age = UserInput.getAgeOption();
                    setAge(age);

                    UserOutput.displayChooseName();
                    String name = UserInput.getNameOption();
                    setName(name);
                }
                else if (choice.equals("display")){
                        CharacterSheet.displayCharacter();
                } else if(choice.equals("exit")){
                    UserOutput.goodByeMessage();
                    break;
                }
            }
        }
    }
