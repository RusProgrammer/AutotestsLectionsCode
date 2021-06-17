package regexps;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

public class Main {
    public static void main(String[] args)
    {
        String input = " aA3 +";
        Pattern pat = Pattern.compile("[a-zA-Z]");
        Matcher matcher = pat.matcher(input);
        long cnt = matcher.results().count();
        List<Integer> d = new ArrayList<Integer>();
        d.add(123);

//        while(matcher.find())
//        {
//            System.out.println(matcher.group());
//        }
    }
}
