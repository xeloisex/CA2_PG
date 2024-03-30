/*
https://github.com/xeloisex/CA2_PG.git
 */
package ca2_pg;
/*
IntegratedCA2
*/
//import arraylist
//import list
//import scanner
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class User {
    private String username;
    private String password;
    private String role;

    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    // Setters
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
//admin class
class Admin {
    private static List<User> users = new ArrayList<>();

    static {
        // Creating the default admin user
        users.add(new User("admin", "java", "Admin"));
    }

    public static void addUser(String username, String password, String role) {
        users.add(new User(username, password, role));
    }

    public static void modifyUser(String oldUsername, String newUsername, String newPassword, String newRole) {
        for (User user : users) {
            if (user.getUsername().equals(oldUsername)) {
                user.setUsername(newUsername);
                user.setPassword(newPassword);
                user.setRole(newRole);
                break;
            }
        }
    }

    public static void deleteUser(String username) {
        users.removeIf(user -> user.getUsername().equals(username));
    }

    public static void changeOwnCredentials(String username, String newPassword) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                user.setPassword(newPassword);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Admin login
        System.out.println("Admin Login");
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        boolean isAdmin = false;
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password) && user.getRole().equals("Admin")) {
                isAdmin = true;
                break;
            }
        }
        //admin choices to create/modify/delete/change own with a choice option
        if (isAdmin) {
            System.out.println("Admin Menu:");
            System.out.println("1. Add User");
            System.out.println("2. Modify User");
            System.out.println("3. Delete User");
            System.out.println("4. Change Own Credentials");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            //adding new admin
            switch (option) {
                case 1:
                    System.out.print("Enter new username: ");
                    String newUsername = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String newPassword = scanner.nextLine();
                    System.out.print("Enter role: ");
                    String newRole = scanner.nextLine();
                    addUser(newUsername, newPassword, newRole);
                    System.out.println("User added successfully.");
                    break;
                case 2:
                    System.out.print("Enter username to modify: ");
                    String modifyUsername = scanner.nextLine();
                    System.out.print("Enter new username: ");
                    String modifiedUsername = scanner.nextLine();
                    System.out.print("Enter new password: ");
                    String modifiedPassword = scanner.nextLine();
                    System.out.print("Enter new role: ");
                    String modifiedRole = scanner.nextLine();
                    modifyUser(modifyUsername, modifiedUsername, modifiedPassword, modifiedRole);
                    System.out.println("User modified successfully.");
                    break;
                case 3:
                    System.out.print("Enter username to delete: ");
                    String deleteUsername = scanner.nextLine();
                    deleteUser(deleteUsername);
                    System.out.println("User deleted successfully.");
                    break;
                case 4:
                    System.out.print("Enter new password: ");
                    String newOwnPassword = scanner.nextLine();
                    changeOwnCredentials(username, newOwnPassword);
                    System.out.println("Own credentials changed successfully.");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } else {
            System.out.println("Unauthorized access. Exiting...");
        }

        scanner.close();
    }
}

