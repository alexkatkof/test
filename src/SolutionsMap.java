import java.util.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class SolutionsMap {

    public static String FindIntersection(String[] strArr) {
        // code goes here
        String[] arrayA = strArr[0]. split(", ");
        String[] arrayB = strArr[1]. split(", ");

        String res = "";

        for(int i = 0; i < arrayA.length; i++){
            for(int j = 0; j < arrayB.length; j++){
                if(arrayA[i].equals(arrayB[j])){
                    res += arrayA[i] + ",";
                }
            }
        }
        //res = res.substring(0).

        return res;
    }


    public static void main (String[]args){
            // keep this function call here
        String[] test = {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};
        Stream<String> testStrings = Arrays.stream(test);
        testStrings.map(s -> s.split(","))
                .flatMap(Arrays::stream).distinct()
                .collect(Collectors.toList())
                .forEach(System.out::print);
        //FindIntersection(test);
            //System.out.println(LongWord(test));

        }

    }

