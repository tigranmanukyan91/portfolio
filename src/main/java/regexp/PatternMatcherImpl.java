package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherImpl {
    public static void main(String[] args) {
        String text = "Hello dear Hiring Manager, i would like to apply for the posted job of java developer in your company,\n" +
                 "my email \n" +
                "is myemail@gmail.com " + "or you can use also this email which is secondaryemail@hotmail.com";
        Pattern mail = Pattern.compile("(\\w+)@(gmail|hotmail)\\.(com|ru)");
        Matcher matcher = mail.matcher(text);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
