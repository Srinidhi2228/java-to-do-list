import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Task  2. View Tasks  3. Exit");
            System.out.print("Enter your choice: ");

            // Validate input
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number (1, 2, or 3).");
                scanner.next(); // Clear invalid input
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                System.out.print("Enter task: ");
                tasks.add(scanner.nextLine());
                System.out.println("Task added successfully!");
            } else if (choice == 2) {
                if (tasks.isEmpty()) {
                    System.out.println("Your task list is empty.");
                } else {
                    System.out.println("Your Tasks:");
                    for (String task : tasks)
                        System.out.println("- " + task);
                }
            } else if (choice == 3) {
                System.out.println("Exiting... Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }

        scanner.close();
    }
}
