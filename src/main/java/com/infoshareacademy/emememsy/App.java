package com.infoshareacademy.emememsy;


import com.infoshareacademy.emememsy.modes.ModeLauncher;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        new App().run();

    }

    private void run() {
        System.out.println("Witamy w aplikacji do nauki słówek - myWords.");
        System.out.println(
                "        ___  ___      _    _               _\n" +
                "        |  \\/  |     | |  | |             | |    \n" +
                "        | .  . |_   _| |  | | ___  _ __ __| |___\n" +
                "        | |\\/| | | | | |/\\| |/ _ \\| '__/ _` / __|\n" +
                "        | |  | | |_| \\  /\\  / (_) | | | (_| \\__ \\\n" +
                "        \\_|  |_/\\__, |\\/  \\/ \\___/|_|  \\__,_|___/\n" +
                "                 __/ |                           \n" +
                "                |___/\n");
        List<SingleWord> myList = new ArrayList<>();
        myList = InputOutput.createListOfWords();
        SingleWord singleWord = new SingleWord();
        ModeLauncher.pressEnterKeyToContinue();
        ModeLauncher.launchMainMenu();
    }


}


