package com.infoshareacademy.emememsy;

import java.util.ArrayList;
import java.util.List;

public class Test {

    //this is another main fot testing purposes - please don't assess - WILL BE REMOVED after merging all modules

    public static void main(String[] args) {
        new Test().run();
    }

    private void run() {

        List<SingleWord> myList = new ArrayList<>();
        //test wczytania pliku i stworenia tablicy
            myList = InputOutput.createListOfWords();


        //symulacja trybu nauki
        String singleWord = new Actions().pickRandomLearnMode(myList);

         //   InputOutput.writeToCSV(myList);


        //weryfikacja stanu listy
        //myList.stream().forEach(System.out::println);

        NumberFormatValidator numberFormatValidator = new NumberFormatValidator();
        System.out.println( numberFormatValidator.isNumber("1"));


    }


    }



