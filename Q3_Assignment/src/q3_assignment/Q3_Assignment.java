package q3_assignment;

import java.util.Scanner;

/**
 *
 * @author Le Truong Thinh
 */
public class Q3_Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key, fare;
        String route;
        System.out.print("Enter flight route: ");
        route = sc.nextLine();
        System.out.print("Enter flight fare: ");
        fare = sc.nextInt();
        Flight f = new Flight(route, fare);
        System.out.print("Enter TC: ");
        key = sc.nextInt();
        System.out.println("OUTPUT: ");
        switch (key) {
            case 1:
                System.out.println(f);
                break;
            case 2:
                System.out.println(f.getDeparture());
                break;
            default:
                break;
        }
    }
    
}
