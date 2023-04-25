package q2_assignment;


import q2_assignment.IBook;
import q2_assignment.Book;
import java.util.ArrayList;


/**
 *
 * @author Le Truong Thinh
 */
public class MyBook implements IBook{

    @Override
    public String f1(ArrayList<Book> a) {
        if (a.isEmpty()) {
            return null;
        }else return a.get(0).getName();
    }

    @Override
    public int f2(ArrayList<Book> a, int price) {
        int count = 0;
         if (a.isEmpty()) {
            return 0;
        }else {
             for (int i = 0; i < a.size(); i++) {
                 if (a.get(i).getPrice() >= price) {
                     count++;
                 }
             }
         }
         return count;
    }
    
}
