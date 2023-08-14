package homework.homework_10;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String message = args[0].toLowerCase();

        List<Character> alphabet = Arrays.asList(
                'a', 'b', 'c', 'd', 'e', 'f',
                'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p',
                'q', 'r', 's', 't', 'u',
                'v', 'w', 'x', 'y', 'z');

        int[] count = countCharacters(message, alphabet);

        for (int i = 0; i < alphabet.size(); i++) {
            System.out.println(alphabet.get(i) + " " + count[i]);
        }
    }

    public static int[] countCharacters(String message, List alphabet) {
        char[] chars = message.toCharArray();
        int[] count = new int[alphabet.size()];
        for (char character:chars) {
            int index = alphabet.indexOf(character);
            if (index < 0) {
                continue;
            }
            count[index]++;
        }
        return count;
    }
}
