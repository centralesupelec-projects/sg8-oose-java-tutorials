package fr.cs.oose.pr4.ex2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class CountFileWords {
    public static void main(String[] args) {
        String content = readTextFile("./src/fr/cs/oose/pr4/ex2/words.txt");
        Map<String, Integer> map = countWords(content);
        StringBuilder s = new StringBuilder();
        for (String word : map.keySet()) {
            s.append(word);
            s.append(" ");
            s.append(map.get(word));
            s.append("\n");
        }
        try {
            writeWordsCount("./src/fr/cs/oose/pr4/ex2/wordscount.txt", s.toString(), false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readTextFile(String fileName) {
        String returnValue="";
        File file = null;
        FileInputStream fis = null;
        try {
            file = new File(fileName);
            fis = new FileInputStream(file);
            byte[] b = new byte[(int) file.length()];
            fis.read(b); // Reads up to b.length bytes of data from fis input stream into array of bytes.
            returnValue = new String(b, StandardCharsets.UTF_8);

        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            if (fis != null) {
                try {
                    fis.close();
                }
                catch (IOException e) { // do nothing
                }
            }
        }
        return returnValue;
    }

    public static Map<String, Integer> countWords(String content) {
        String[] words = content.split("\\s+");
        Map<String, Integer> words_count = new HashMap<>();
        for (String word : words) {
            if (words_count.containsKey(word)) {
                words_count.put(word, words_count.get(word) + 1);
            } else {
                words_count.put(word, 1);
            }
        }
        return words_count;
    }

    public static void writeWordsCount(String fileName, String content, boolean append) throws IOException {
        File file = new File(fileName);
        file.createNewFile();
        // creates a FileWriter Object
        FileWriter writer = new FileWriter(file, append);
        // Writes the content to the file
        writer.write(content);
        writer.flush();
        writer.close();
    }
}
