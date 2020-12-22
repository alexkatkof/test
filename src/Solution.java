import java.util.*;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            list.add(i);
        }
        list.forEach(s -> System.out.print(s + " "));

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1 ,2);
        map.put(2 ,4);
        map.put(3 ,6);
        map.put(4 ,7);
        map.put(5 ,8);
        Set<Integer> keySet = map.keySet();
        Collection<Integer> valueSet = map.values();
        if(keySet.contains(1)){
            keySet.remove(2);
        }

        System.out.println("\n" + keySet);
        System.out.println("\n" + valueSet);

        for(Map.Entry<Integer, Integer> item : map.entrySet()){

            System.out.printf("Key: %d  Value: %d \n", item.getKey(), item.getValue());
        }


    }





    }

