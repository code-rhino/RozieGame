import java.util.Scanner;

public class ConsoleDisplay implements Display {

    Scanner scanner = new Scanner(System.in);

    @Override
    public void print(String data) {
        System.out.println(data);
    }

    @Override
    public String printAndReturnString(String data) {
        System.out.println(data);
        return scanner.next();

    }
}
