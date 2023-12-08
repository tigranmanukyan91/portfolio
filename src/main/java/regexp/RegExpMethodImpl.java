package regexp;

import java.util.Arrays;

public class RegExpMethodImpl {
    public static void main(String[] args) {
        String word = "Hello my friend";
        String[] words = word.split(" ");
        System.out.println(Arrays.toString(words));


        String word1 = "Hello.my.friend";
        String[] split = word1.split("\\.");
        System.out.println(Arrays.toString(split));

        String word2 = "Hello123123my2131232friend";
        String[] split1 = word2.split("\\d+");
        System.out.println(Arrays.toString(split1));

        String word3 = "Jude Bellingham";
        String replace = word3.replace(" ", ".");
        System.out.println(replace);


        String word4 = "Hello21312321312312there";
        String s = word4.replaceAll("\\d+", ".");// replaceAll is used when we need to replace with regular expressions
        System.out.println(s);

        String word5 = "Hello213213there21323good morning";
        String s1 = word5.replaceFirst("\\d+", "-");
        System.out.println(s1);


    }
}
