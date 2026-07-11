package MidLevel.Heap;

import java.lang.reflect.Array;
import java.util.Arrays;

class Student implements Comparable<Student> {
    int marks;
    String name;
    int cgpa;

    Student(String name, int marks, int cgpa) {
        this.name = name;
        this.marks = marks;
        this.cgpa = cgpa;
    }

    
    // public int compareTo(Student s){
    //     return (int) this.marks - s.marks;
    // }

    //     public int compareTo(Student s){
    //     return this.name.compareTo(name);
    // }

        public int compareTo(Student s){
        return Integer.compare(this.marks, s.marks);
    }
}

public class CustomComparator {

    public static void main(String[] args) {

        Student s1 = new Student("Rajan Yadav", 90, 7);
        Student s2 = new Student("Shalu", 89, 7);
        Student s3 = new Student("Arjun", 90, 9);
        Student s4 = new Student("Yudhistir", 81, 7);
        Student s5 = new Student("Nakul", 70, 8);
        Student s6 = new Student("Shedev", 85, 7);
        Student s7 = new Student("Krishna", 90, 7);

        Student[] arr = { s1, s2, s3, s4, s5, s6, s7 };

        // Arrays.sort(arr); error

        // Arrays.sort(arr);

        for (Student num : arr) {
            System.out.print(num.name + " " + num.marks + " "+ num.cgpa+ " ");
        }

    }

}
