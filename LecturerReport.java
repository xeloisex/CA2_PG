/*
https://github.com/xeloisex/CA2_PG.git
 */
package ca2_pg;

/**
IntegratedCA2
 */
import java.util.ArrayList;
import java.util.List;

class Lecturer {
    private String name;
    private String role;
    private List<Module> teachingModules;

    public Lecturer(String name, String role) {
        this.name = name;
        this.role = role;
        this.teachingModules = new ArrayList<>();
    }

    public void addTeachingModule(Module module) {
        teachingModules.add(module);
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public List<Module> getTeachingModules() {
        return teachingModules;
    }
}

class Module {
    private String name;
    private int numberOfStudents;
    private List<String> classesTeachable;

    public Module(String name, int numberOfStudents) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.classesTeachable = new ArrayList<>();
    }

    public void addClassTeachable(String className) {
        classesTeachable.add(className);
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public List<String> getClassesTeachable() {
        return classesTeachable;
    }
}

public class LecturerReport {
    public static void main(String[] args) {
        // Create Lecturers
        Lecturer lecturer1 = new Lecturer("Adam Johnson", "Senior Lecturer");
        Lecturer lecturer2 = new Lecturer("Jake Smiths", "Associate Lecturer");
        Lecturer lecturer3 = new Lecturer("Elise Arnold", "Senior Lecturer");
        Lecturer lecturer4 = new Lecturer("Sarah Touray", "Associate Lecturer");
        // Create Modules
        Module module1 = new Module("Introduction to Programming", 30);
        module1.addClassTeachable("Java");
        module1.addClassTeachable("Programming");

        Module module2 = new Module("Database Systems", 25);
        module2.addClassTeachable("Database Management");
        
        Module module3 = new Module("Object Oriented Analysis and Design", 25);
        module2.addClassTeachable("Object Oriented Analysis and Design");
        
        Module module4 = new Module("Maths for Technology", 25);
        module2.addClassTeachable("Maths for Technology");
        

        // Assign Modules to Lecturers
        lecturer1.addTeachingModule(module1);
        lecturer2.addTeachingModule(module2);
        lecturer3.addTeachingModule(module3);
        lecturer4.addTeachingModule(module4);

        // Generate Report
        System.out.println("Lecturer Report:");
        System.out.println();

        // Lecturer 1
        System.out.println("Name: " + lecturer1.getName());
        System.out.println("Role: " + lecturer1.getRole());
        System.out.println("Modules Teaching:");
        for (Module module : lecturer1.getTeachingModules()) {
            System.out.println("- " + module.getName());
            System.out.println("Number of Students: " + module.getNumberOfStudents());
            System.out.println("Classes Teachable: " + module.getClassesTeachable());
            System.out.println();
        }
        System.out.println();

        // Lecturer 2
        System.out.println("Name: " + lecturer2.getName());
        System.out.println("Role: " + lecturer2.getRole());
        System.out.println("Modules Teaching:");
        for (Module module : lecturer2.getTeachingModules()) {
            System.out.println("- " + module.getName());
            System.out.println("Number of Students: " + module.getNumberOfStudents());
            System.out.println("Classes Teachable: " + module.getClassesTeachable());
            System.out.println();
             }
        System.out.println();
        //Lecturer 3
        System.out.println("Name: " + lecturer3.getName());
        System.out.println("Role: " + lecturer3.getRole());
        System.out.println("Modules Teaching:");
        for (Module module : lecturer3.getTeachingModules()) {
            System.out.println("- " + module.getName());
            System.out.println("Number of Students: " + module.getNumberOfStudents());
            System.out.println("Classes Teachable: " + module.getClassesTeachable());
            System.out.println();
             }
        System.out.println();
        //Lecturer 4
        System.out.println("Name: " + lecturer4.getName());
        System.out.println("Role: " + lecturer4.getRole());
        System.out.println("Modules Teaching:");
        for (Module module : lecturer4.getTeachingModules()) {
            System.out.println("- " + module.getName());
            System.out.println("Number of Students: " + module.getNumberOfStudents());
            System.out.println("Classes Teachable: " + module.getClassesTeachable());
            System.out.println();
             }
        System.out.println();
        }
    }

