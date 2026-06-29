package Collections.Lists.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashmapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Zaid");
        map.put(2, "Kaif");
        map.put(3, "Latif");
        map.put(4, "Hasina");

        System.out.println(map);

        //getting values
        String student = map.get(1);
        System.out.println(student);

        //containsKey() = Check if Key is exists or not, it will return boolean values
        System.out.println(map.containsKey(1));

        //containsValue() = check if value exists or not in map return boolean values
        System.out.println(map.containsValue("Kaif"));
        System.out.println(map.containsValue("king"));

        //looping in HashMap

        for (int i : map.keySet()){
            System.out.println(map.get(i));
        }

        //want to check all entries with keys and values
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        //assume set as list

        for(Map.Entry<Integer, String> entry : entries){

            //upper case
            entry.setValue(entry.getValue().toUpperCase());
            //lower case
            //entry.setValue(entry.getValue().toLowerCase());
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println(map);

        System.out.println(map.remove(1));
        System.out.println(map);


    }


}
