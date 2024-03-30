/*
https://github.com/xeloisex/CA2_PG.git
 */
package ca2_pg;
/**
IntegratedCA2
 */
//import arraylist
// import list
// import map
//import hashmap
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

class Student {
    private String name;
    private int studentNumber;
    private Program program;
    private List<Module> enrolledModules;
    private Map<Module, String> completedModules; // Mapping of completed modules to grades

    public Student(String name, int studentNumber, Program program) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.program = program;
        this.enrolledModules = new ArrayList<>();
        this.completedModules = new HashMap<>();
    }

    public void enrollModule(Module module) {
        enrolledModules.add(module);
    }

    public void completeModule(Module module, String grade) {
        completedModules.put(module, grade);
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public Program getProgram() {
        return program;
    }

    public List<Module> getEnrolledModules() {
        return enrolledModules;
    }

    public Map<Module, String> getCompletedModules() {
        return completedModules;
    }
}

class Program {
    private String name;

    public Program(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Module {
    private String name;

    public Module(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class StudentReport {
    public static void main(String[] args) {
        // example of a student
        Program program = new Program("Computer Science");
        Student student = new Student("John Downs", 1, program);

        // Enroll the student in modules
        Module module1 = new Module("Introduction to Programming");
        Module module2 = new Module("Database");
        Module module3 = new Module("Maths");
        Module module4 = new Module("Object Oriented Analysis and Design");
        student.enrollModule(module1);
        student.enrollModule(module2);
        student.enrollModule(module3);
        student.enrollModule(module4);

        // Complete some modules with grades
        student.completeModule(module1, "A");
        student.completeModule(module2, "B");
        
        // Print student report
        System.out.println("Student Report:");
        System.out.println("Name: " + student.getName());
        System.out.println("Student Number: " + student.getStudentNumber());
        System.out.println("Program: " + student.getProgram().getName());
        System.out.println("Enrolled Modules:");
        for (Module module : student.getEnrolledModules()) {
            System.out.println("- " + module.getName());
        }
        System.out.println("Completed Modules:");
        for (Map.Entry<Module, String> entry : student.getCompletedModules().entrySet()) {
            System.out.println("- " + entry.getKey().getName() + " (Grade: " + entry.getValue() + ")");
        }
        System.out.println("Modules to Repeat:");
        for (Module module : student.getEnrolledModules()) {
            if (!student.getCompletedModules().containsKey(module)) {
                System.out.println("- " + module.getName());
            }
        }
    }
} 
