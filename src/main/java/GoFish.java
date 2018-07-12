public class GoFish implements Game {
    @Override
    public void play() {
        System.out.println("Go fish");
    }

    @Override
    public String promptUser(String option) {
        return String.format("To play go fish %s", option);
    }
}
