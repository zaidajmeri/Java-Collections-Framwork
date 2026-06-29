package Collections.Lists.Comparator;

import java.util.*;

 class Student {
     private String name;
     private double gpa;

     public Student(String name, double gpa){
         this.name = name;
         this.gpa = gpa;
     }

     public String getName() {
         return name;
     }

     public double getGpa() {
         return gpa;
     }

     public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Zaid", 8.64));
        list.add(new Student("Kaif", 9.2));
        list.add(new Student("Jack", 8.50));
        list.add(new Student("Robert", 8.75));

         //another way using JAVA 8
         Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student :: getName);
         list.sort(comparator);

//         list.sort((a, b) -> {
//           if(b.getGpa() - a.getGpa() > 0) {
//               return 1;
//           }
//           else if(b.getGpa() - a.getGpa() < 0){
//               return  -1;
//            }
//           else {
//               return a.getName().compareTo(b.getName());
//           }
//        });
        for(Student s : list){
            System.out.println(s.getName() + ": " + s.getGpa());
        }
    }
}
