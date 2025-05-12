package fr.cs.oose.pr4.ex2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

import static fr.cs.oose.pr4.ex2.CountFileWords.countWords;
import static fr.cs.oose.pr4.ex2.CountFileWords.writeWordsCount;

public class CountLineFileWords {
    public static void main(String[] args) {
        try (BufferedReader br = ReadWordsByLine("./src/fr/cs/oose/pr4/ex2/words.txt")) {
            String line = "";
            while ((line = br.readLine()) != null) { // read the file line−by−line
                Map<String, Integer> content = countWords(line);
                writeWordsCount("./src/fr/cs/oose/pr4/ex2/wordscount-line.txt", content.toString() + "\n", true);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static BufferedReader ReadWordsByLine(String fileName) {
        String returnValue="";
        FileReader file = null;
        BufferedReader reader = null;
        try {
            file = new FileReader(fileName); // a FileReader for reading byte−by−byte
            reader = new BufferedReader(file); // wrapping a FileReader into a BufferedReader for reading line−by−line
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return reader;
    }
}
