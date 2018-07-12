
public class War implements Game {

    Display display;

    public War(Display display){
        this.display = display;
    }

    @Override
    public void play() {
        display.print("Starting a WAR Muhahhahahaha");
        boolean gameFlag = true;
        while(gameFlag){
            String input = display.printAndReturnString("Do you give up?");
            if (input.equals("Yes")) gameFlag = false;
        }
    }

    @Override
    public String promptUser(String option) {
        return String.format("To Select War type %s", option);
    }
}
