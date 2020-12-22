import java.util.*;

public class Alfabet {
    public static void main(String[] args) {
       List<Character> alfabet = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'y', 'v', 'w', 'x', 'y', 'z');
        String str = "hello world";

        for(char letter : alfabet){
            int count = 0;
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == letter){
                    count++;
                }
            }
            System.out.println(letter + " " + count);
        }



    }
    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        return result;
    }
}
