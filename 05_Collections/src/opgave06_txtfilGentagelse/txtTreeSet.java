package opgave06_txtfilGentagelse;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class txtTreeSet {

    public static void main(String[] args) throws FileNotFoundException {
        // Set<String> dictionaryWords = readWords("words");
        TreeSet<String> documentWords = readWords("Gjøngehøvdingen.txt");
        for (String word : documentWords) {
            System.out.println(word);
        }
    }

    public static TreeSet<String> readWords(String filename) throws FileNotFoundException {
        TreeSet<String> words = new TreeSet<>();
        File file = new File(filename);
        Scanner in = new Scanner(file);
        // Use any characters other than a-z or A-Z as delimiters
        in.useDelimiter("[^a-zA-Z]+");
        while (in.hasNext()) {
            words.add(in.next().toLowerCase());
        }
        in.close();
        return words;
    }
}
