/**
 * The WordLoader class is responsible for reading words from a text file
 * and storing them in an array.
 *
 * Class responsibilities:
 * 1. Count the total number of words in the file
 * 2. Create an array of the required size
 * 3. Load all words from the file into the array
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class WordLoader {

    public static String[] allWords;

    public void loadWords() throws FileNotFoundException {

        int totalWordsCount = 0;
        int currentIndex = 0;

        File vocabularyFile = new File("resources/vocabulary.txt");

        Scanner scanner = new Scanner(vocabularyFile);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] wordsInLine = line.split(" ");
            totalWordsCount += wordsInLine.length;
        }

        allWords = new String[totalWordsCount];

        Scanner scanner2 = new Scanner(vocabularyFile);
        while (scanner2.hasNextLine()) {
            String line = scanner2.nextLine();
            String[] wordsInLine = line.split(" ");
            for (String word : wordsInLine) {
                allWords[currentIndex++] = word;
            }
        }

        scanner.close();
        scanner2.close();
    }
}