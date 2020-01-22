import java.util.ArrayList;
import java.util.List;

public class DeadFishParser {

    public static final char INCREMENT = 'i';
    public static final char SQUARE = 's';
    public static final char DECREMENT = 'd';
    public static final char OUTPUT = 'o';
    private int sum;
    private String command;
    private List<Integer> list;

    public DeadFishParser() {
        sum = 0;
        list = new ArrayList<>();
    }

    public int[] parser(String command) {
        resetSum();
        setCommand(command);

        for (int i = 0; i < command.length(); i++) {
            parseCommandAt(i);
        }
        return resultAsArray();
    }

    private int[] resultAsArray() {
        return list.stream().mapToInt(i -> i).toArray();
    }

    private void parseCommandAt(int i) {
        if (isIncrementCommand(getCharacterAt(i))) increment();
        else if (isSquareCommand(getCharacterAt(i))) square();
        else if (isDecrementCommand(getCharacterAt(i))) decrement();
        else if (isOutputCommand(getCharacterAt(i))) add();
    }

    private void add() {
        list.add(sum);
    }

    private void setCommand(String command) {
        this.command = command;
    }

    private char getCharacterAt(int i) {
        return command.charAt(i);
    }

    private boolean isIncrementCommand(char ch) {
        return ch == INCREMENT;
    }

    private boolean isDecrementCommand(char ch) {
        return ch == DECREMENT;
    }

    private boolean isSquareCommand(char ch) {
        return ch == SQUARE;
    }

    private boolean isOutputCommand(char ch) {
        return ch == OUTPUT;
    }

    private void resetSum() {
        sum = 0;
    }

    private void increment() {
        sum++;
    }

    private void decrement() {
        sum--;
    }

    private void square() {
        sum *= sum;
    }
}