package regexp;

public class RegExpImpl {
    public static void main(String[] args) {
        /*
           \\d - one number
           + - one or more numbers
           * - 0 or more numbers
           ? - 0 or 1 symbols before question mark
           () - if we may have plus sign and minus sign and no sign at the same time before the number, we put them in the brackets
           [abc] - (a|b|c) same thing
           [a-zA-Z] - all english characters
           [0-9] - \\d  only one number
           [^abc] - after the sign ^ all characters should not be in the word, excluding these characters
           . - any symbol

           {2} - two symbols before (\\d{2}) we want exactly two symbols
           {2, } - two symbols before (\\d{2, }) we want two or more symbols
           {2, 4} - two symbols before (\\d{2,5}) we want from two to five symbols

           \\w - one letter
         */
        String word = "-123213";
        String word2 = "123213";
        String word3 = "+12342";
        System.out.println(word.matches("-?\\d*"));
        System.out.println(word2.matches("-?\\d*"));
        System.out.println(word3.matches("(- |\\+)?\\d*"));

        String a = "a123";
        String b = "aasdsad123";
        String c = "aasd1111122222sad123";
        System.out.println(a.matches("[a-zA-Z]\\d+"));
        System.out.println(b.matches("[a-zA-Z]+\\d+"));
        System.out.println(c.matches("[a-zA-Z21]+\\d+"));

        String d = "ahello";

        System.out.println(d.matches("[^abc]*"));

        String e = "https://www.website.com";
        String f = "https://www.website.ru";
        String g = "https://ww.website.ru";
        System.out.println(e.matches("https://www\\..+\\.(com|ru)"));
        System.out.println(f.matches("https://www\\..+\\.(com|ru)"));
        System.out.println(g.matches("https://www\\..+\\.(com|ru)"));

        String example = "12312";

        System.out.println(example.matches("\\d{2,5}"));

    }
}
