package com.Aditya;
import java.util.*;
class Lec1{
    public static void main(String[] args) {
        Student st = new Student(109,960,"Mohit");
        Student st1a = new Student();
        Student2 st2 = new Student2();
        Student2 st1b = new Student2();
        // st.name = "Aditya";
        st2.name = "Gupta";
        System.out.println(st.name);
        System.out.println(st1a.name);
        System.out.println(st);
        System.out.println(st1b);
        System.out.println(st2.name);
        Student[] st3 = new Student[5];
        System.out.println(Arrays.toString(st3));

        // copy const.
        Student copy = new Student(st);
        System.out.println(copy.name);

        // final keyword uses
        final int fin = 3;
        // fin=5; -> ERROR
        System.out.println("Final example variable " + fin);
        final Student stFinal = new Student(109,999,"Aditya");
        System.out.println(stFinal.name);
        stFinal.name = "Oditta";
        System.out.println(stFinal.name);
    }

    static class Student{
        int roll;
        int marks;
        String name;

        // Constructor

        // default constructor
        Student(){
            /*roll = 0;
            marks = 0;
            name = null;*/
            
            // this(110,999,"Himanchu");

            this(110,"Himanchu");
        }
        // parameterized constructor
        Student(int roll , int marks , String nm){
            this.roll = roll;
            this.marks = marks;
            this.name = nm;
        }
        Student(int roll, String nm){
            this.roll = roll;
            this.name = nm;
        }
        // copy constructor
        Student(Student other){
            this.name = other.name;
            this.roll = other.roll;
            this.marks = other.marks;
        }
    }
}
class Student2{
    int marks;
        String name;
}
/***************************************************IMPORTANT********************************************************************/

/*In Java, a non-static inner class (like your Student class) needs an instance of the outer class (Lec1 in this case) to be created. 
To fix this issue, you should either make the inner class Student static or 
create an instance of the outer class before creating an instance of the inner class.

Here's the modified code making the inner class Student static:


class Lec1 {
    public static void main(String[] args) {
        // Create an instance of the static inner class Student
        Student st = new Student();

        // Set the name attribute of the Student object to "Aditya"
        st.name = "Aditya";

        // Print the name attribute of the Student object
        System.out.println(st.name);
    }

    // Static inner class Student
    static class Student {
        int roll;
        int marks;
        String name;
    }
}
Alternatively, you can keep the inner class as non-static and 
create an instance of the outer class before creating an instance of the inner class:

class Lec1 {
    public static void main(String[] args) {
        // Create an instance of the outer class Lec1
        Lec1 lec1Instance = new Lec1();

        // Create an instance of the inner class Student using the outer class instance
        Lec1.Student st = lec1Instance.new Student();

        // Set the name attribute of the Student object to "Aditya"
        st.name = "Aditya";

        // Print the name attribute of the Student object
        System.out.println(st.name);
    }

    // Non-static inner class Student
    class Student {
        int roll;
        int marks;
        String name;
    }
} */