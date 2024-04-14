
import java.util.ArrayDeque;

/**
 *
 * @author TIKA
 */
public class arrayDeque {
    public static void main(String[] args) {
        ArrayDeque<String> students = new ArrayDeque<> ();
        
        students.offer ("Siti");
        students.offer ("Nurviatika");
        
        System.out.println("Isi ArrayDeque! : ");
        while (!students.isEmpty()) {
            System.out.println(students.poll());
            
        }
        
    }
    
}

    

