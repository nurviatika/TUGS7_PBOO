
import java.util.ArrayList;


/**
 *
 * @author TIKA
 */
public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<> ();
        
        numbers.add(01);
        numbers.add(02);
        numbers.add(03);
        
        System.out.println("Isi ArrayList! :");
        for (int num : numbers) {
            System.out.println(num);
        }
        
        
    }
    
}
