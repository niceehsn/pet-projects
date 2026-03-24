import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        
        WordLoader world = new WordLoader();
        world.loadWords();

        HangmanGame game = new HangmanGame();
        game.start();
    }
}

