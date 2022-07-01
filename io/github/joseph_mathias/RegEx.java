import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx{
    public static void main(String[] args) {
        String regStr = ".*[a-z][0-9][a-z].";
        Pattern pattern = Pattern.compile(regStr);

        Matcher matcher = pattern.matcher("1234urhosd9854576");
        boolean matchFound = matcher.find();

        if(matchFound){
            System.out.println("Match found!");
        }else{
            System.out.println("Match not found!");
        }
    }
}