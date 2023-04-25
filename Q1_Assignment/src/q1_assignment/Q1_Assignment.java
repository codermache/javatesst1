package q1_assignment;

import java.util.Scanner;

/**
 *
 * @author Le Truong Thinh
 */
public class Q1_Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, department;
        int salary, key;
        System.out.print("Enter person name: ");
        name = sc.nextLine();
        while (true) {
            try {
                System.out.print("Enter worker salary: ");
                salary = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Try again.");
            }
        }
        System.out.print("Enter worker department name : ");
        department = sc.nextLine();
        Worker worker = new Worker(salary, department, name);
        System.out.print("Enter TC: ");
        key = sc.nextInt();
        System.out.println("OUTPUT: ");
        switch (key) {
            case 1:
                System.out.println(worker.getName());
                System.out.println(worker.toString());
                break;
            case 2:
                System.out.println(worker.getSalary());
                break;
            default:
                break;
        }
    }
}
