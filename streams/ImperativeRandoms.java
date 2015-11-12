// streams/ImperativeRandoms.java
import java.util.*;

public class ImperativeRandoms {
  public static void main(String[] args) {
    Random rand = new Random(47);
    SortedSet<Integer> rints = new TreeSet<>();
    while(rints.size() < 7) {
      int r = rand.nextInt(20);
      if(r < 5) continue;
      rints.add(r);
    }
    System.out.println(rints);
  }
}
/* Output:
[7, 8, 9, 11, 13, 15, 18]
*/
