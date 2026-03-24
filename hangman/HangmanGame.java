import java.util.Scanner;
import java.util.Random;

public class HangmanGame {

    public void start() {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int health = 5;

        int num = random.nextInt(WordLoader.allWords.length + 1);
        String wordToGuess = WordLoader.allWords[num];
        int wordLength = wordToGuess.length();

        char[] cypher = new char[wordLength];
        for (int i = 0; i < wordLength; i++) {
            cypher[i] = '*';
        }

        while (health > 0) {

            System.out.println("Слово: " + new String(cypher));
            System.out.println("Введите одну букву: "); 
            String userInput = scanner.nextLine();

            if (userInput.isEmpty()) {
                System.out.println("Вы ничего не ввели, попробуйте снова.");
                continue;
            }

            int k = 0;
            char userSymbol = userInput.charAt(0);

            for (int i = 0; i < wordLength; i++) {
                if (wordToGuess.charAt(i) == userSymbol) {
                    cypher[i] = userSymbol;
                    k++;
                }
            }

            if (k == 0) {
                health--;
                System.out.println("Неправильно. Осталось жизней: " + health);
            }

            HangmanDrawing.draw(health);

            if (wordToGuess.equals(new String(cypher))) { 
                System.out.println("Поздравляю! Вы выиграли! Слово: " + wordToGuess);
                break;
            }
        }

        if (health == 0) {
            System.out.println("Вы проиграли. Загаданное слово было: " + wordToGuess);
        }

        scanner.close();
    }
}