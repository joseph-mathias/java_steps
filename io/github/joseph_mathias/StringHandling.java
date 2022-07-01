import java.lang.reflect.Array;
import java.util.Arrays;

public class StringHandling {
    public static void main(String[] args) {
        String i = "John is Studying";
        String j = "In College";

        System.out.println(i.length());

        String result = i.concat(j);
        System.out.println(result);

        String.format("The name of student is " + "%s, and the age is " + "value is %d, ", "Joseph", 30);
        
        System.out.println(i.charAt(5));

        if(i.equals(j))
            System.out.println("Same");
        else
            System.out.println("Differents");

        System.out.println(j.indexOf(8));
        System.out.println(i.replace('S', 'Z'));

        String[] arr = i.split(" ");
        Arrays.asList(arr).forEach(s -> System.out.println(s));

        String newStr = i.substring(1, 6);
        System.out.println(newStr);
    }
}
