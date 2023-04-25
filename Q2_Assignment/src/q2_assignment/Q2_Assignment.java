package q2_assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Le Truong Thinh
 */
public class Q2_Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IBook obj = new MyBook();
        ArrayList<Book> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int key, n, price,cprice;
        String name;
        while (true) {
            try {
                System.out.print("Enter number of Book: ");
                n = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Try again.");
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print("Enter book name: ");
            name = sc.nextLine();
            while (true) {
                try {
                    System.out.print("Enter book price: ");
                    price = Integer.parseInt(sc.nextLine());
                    break;
                } catch (Exception e) {
                    System.out.println("Try again.");
                }
            }
            a.add(new Book(name, price));
            System.out.println();
        }
        System.out.print("Enter counting price: ");
        cprice = sc.nextInt();
        System.out.print("Enter test function (1-f1;2-f2) : ");
        key = sc.nextInt();
        System.out.println("OUTPUT: ");
        switch (key) {
            case 1:
                System.out.println(obj.f1(a));
                break;
            case 2:
                System.out.println(obj.f2(a, cprice));
                break;
            default:
                break;
        }
    }
}
