package com.infoshareacademy.emememsy;

import com.opencsv.CSVReader;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;


public class InputOutput {

    public static void checkReader() throws IOException {
        CSVReader reader = new CSVReader(new FileReader(PropertiesReader.read("config.properties").get(PropertiesReader.PATH_KEY)));
        String[] nextLine;
        while ((nextLine = reader.readNext()) != null) {
            System.out.println(nextLine[0] + " " + nextLine[1] + " " + nextLine[2]);
        }
    }


    public static List<SingleWord> createListOfWords() throws IOException {
        List<SingleWord> listOfWords = new ArrayList<>();
        CSVReader reader = new CSVReader(new FileReader(PropertiesReader.read("config.properties").get(PropertiesReader.PATH_KEY)));
        String[] nextLine;
        nextLine = reader.readNext();
        while ((nextLine = reader.readNext()) != null) {
            SingleWord singleWord = new SingleWord((nextLine[2]), (nextLine[1]), Integer.parseInt(nextLine[0]));
            listOfWords.add(singleWord);
        }
        return listOfWords;
    }


    public static void writeToCSV(List<SingleWord> listOfWords) throws IOException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException {
        Writer writer = new FileWriter(PropertiesReader.read("config.properties").get(PropertiesReader.PATH_KEY));
        StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer).build();
        beanToCsv.write(listOfWords);
        writer.close();
    }
}
