package lect2;
import java.util.regex.*;

public class Main {
    public static void main(String[] args)
    {
        String[] input = {" aA3 +", "bvD"};
        Pattern pat = Pattern.compile("[a-zA-Z]");
        long cnt = 0;
        for(int i = 0; i < input.length; i++) {
            Matcher matcher = pat.matcher(input[i]);
            cnt += matcher.results().count();
        }

        System.out.println(cnt);
    }
}
