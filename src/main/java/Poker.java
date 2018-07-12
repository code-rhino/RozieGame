
public class Poker implements Game {
    @Override
    public void play() {
        System.out.println("Currently playing poker");
    }

    @Override
    public String promptUser(String option) {
        return String.format("To play Poker select %s", option);
    }
}
