import java.util.HashMap;
import java.util.Map;

public class Main {

    private Map<String, Game> games;
    private Display display;

    public Main(){
        display = new ConsoleDisplay();
        games = new HashMap<>();
        games.put("War", new War(display));
        games.put("Poker", new Poker());
    }

    private boolean canSelectGame(String option){
        Game game = games.get(option);
        return (game != null)? true : false;
    }

    private void displayOptions(){
        for(Map.Entry<String, Game> entry: games.entrySet()){
            Game game = entry.getValue();
            String option = entry.getKey();
            display.print(game.promptUser(option));
        }
        display.print("Select Q for quit");
    }

    public void gameLoop(){
        boolean flag = true;
        while (flag){
            displayOptions();

            String input = display.printAndReturnString("Select now:");
            boolean canSelect = canSelectGame(input);
            if(canSelect){
                games.get(input).play();
            } else if(input.equals("Q")){
                System.out.println("Good Bye");
                flag = false;
            } else {
                System.out.println("Unknown option");
            }

        }

    }

    public static void main(String[] args){
        Main main = new Main();
        main.gameLoop();
    }
}
