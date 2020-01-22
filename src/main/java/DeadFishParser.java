import java.util.ArrayList;
import java.util.List;

public class DeadFishParser {

    public static int[] parser(String commands) {
        int sum = 0;
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < commands.length(); i++) {
            if (commands.charAt(i) == 'i') sum++;
            else if (commands.charAt(i) == 's') sum *= sum;
            else if (commands.charAt(i) == 'd') sum--;
            else if (commands.charAt(i) == 'o')
                list.add(sum);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}