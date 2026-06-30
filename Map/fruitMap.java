package Collections.Lists.Map;

import java.util.HashMap;
public class fruitMap {
    public static void main (String[] args){
        HashMap<String, Integer> fruitmap = new HashMap<>();
        fruitmap.put("Apple", 50); //bucket index 10
        fruitmap.put("Banana", 30);

        String myKey = "Orange";
        fruitmap.put(myKey, 80);
        String myKey2 = "Grape";
        fruitmap.put(myKey2, 20);

        int hashcode = myKey.hashCode();
        int hashcode2 = myKey2.hashCode();

        int capacity = 16;
        int bucketIndex = hashcode & (capacity - 1);
        int bucketIndex2 = hashcode2 & (capacity - 1);

        System.out.println("Fruit Map: " + fruitmap);
        System.out.println("Hash Code: " + hashcode);
        System.out.println("Bucket Index: " + bucketIndex);

        System.out.println("Hash Code 2: " + hashcode2);
        System.out.println("Bucket Index 2: " + bucketIndex2);

    }
}
