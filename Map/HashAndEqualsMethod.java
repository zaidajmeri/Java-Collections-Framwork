package Collections.Lists.Map;


import Collections.Lists.Stack.Main;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashAndEqualsMethod {
    public static void main(String[] args) {
        HashMap<Person, String> hashMap = new HashMap<>();
        Person p1 = new Person("Alice", 1);
        Person p2 = new Person("Bob", 2);
        Person p3 = new Person("Alice", 1);

        hashMap.put(p1, "Engineer");
        hashMap.put(p2, "Designer");
        hashMap.put(p3, "Manager");

        System.out.println("HashMap size: " + hashMap.size());
        System.out.println("Value for p1 " + hashMap.get(p1));
        System.out.println("Value for p3 " + hashMap.get(p3));

        Map<String, Integer> map = new HashMap<>();
        map.put("Zaid", 50);
        map.put("Kaif", 30);
        map.put("Zaid", 40);

    }
}

class Person{
        private String name;
        private int id;

        public Person(String name, int id){
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Person other = (Person) obj;
        return id == other.id && Objects.equals(name, other.name);
    }
        @Override
        public String toString(){
            return "id " + id + ", name " + name;
        }
}

