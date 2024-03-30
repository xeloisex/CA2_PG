/*
https://github.com/xeloisex/CA2_PG.git
 */
package ca2_pg;
/**
IntegratedCA2
 */

//import arraylist
//import list
import java.util.ArrayList;
import java.util.List;

class Module {
    private String name;
    private Program program;
    private int numberOfStudentsEnrolled;
    private Lecturer lecturer;
    private Room room;

    public Module(String name, Program program, int numberOfStudentsEnrolled, Lecturer lecturer, Room room) {
        this.name = name;
        this.program = program;
        this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;
        this.lecturer = lecturer;
        this.room = room;
    }

    // Getters
    public String getName() {
        return name;
    }

    public Program getProgram() {
        return program;
    }

    public int getNumberOfStudentsEnrolled() {
        return numberOfStudentsEnrolled;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public Room getRoom() {
        return room;
    }
}
//program class
class Program {
    private final String name;

    public Program(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
//lecturer class
class Lecturer {
    private final String name;

    public Lecturer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
//room class
class Room {
    private final String name;

    public Room(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
//public class course report
public class CourseReport {
    public static void main(String[] args) {
        // Creating modules
        Module module1 = new Module("Introduction to Java", new Program("Java Programming"), 30,
                new Lecturer("Adam Johnson"), new Room("Online"));
        Module module2 = new Module("Database", new Program("Database"), 25,
                new Lecturer("Jake Smiths"), new Room("Room 101"));
        Module module3 = new Module("Introduction to Object Oriented Analysis and Design", new Program("Object Oriented Analysis and Design "), 30,
                new Lecturer("Elise Arnold"), new Room("Online"));
        Module module4 = new Module("Maths", new Program("Maths for Technology"), 25,
                new Lecturer("Sarah Touray"), new Room("Room 105")); 
        // Adding modules to a list
        List<Module> modules = new ArrayList<>();
        modules.add(module1);
        modules.add(module2);
        modules.add(module3);
        modules.add(module4);
        // Printing course report
        System.out.println("Course Report:");
        for (Module module : modules) {
            System.out.println("Module: " + module.getName());
            System.out.println("Program: " + module.getProgram().getName());
            System.out.println("Number of Students Enrolled: " + module.getNumberOfStudentsEnrolled());
            System.out.println("Lecturer: " + module.getLecturer().getName());
            System.out.println("Room: " + module.getRoom().getName());
            System.out.println();
        }
    }
}
