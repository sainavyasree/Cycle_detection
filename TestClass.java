import Cycle_detection.*;
import java.util.*;

public class TestClass {
    
    public static void main(String[] args){
        Cycle_detection c=new Cycle_detection();
        
        Scanner ob=new Scanner(System.in);
        int tests = ob.nextInt();
        ob.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int testsItr = 0; testsItr < tests; testsItr++) {
            int index = ob.nextInt();
            ob.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            SinglyLinkedList llist = new SinglyLinkedList();

            int llistCount = ob.nextInt();
            ob.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llistCount; i++) {
                int llistItem = ob.nextInt();
                ob.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                llist.insertNode(llistItem);
            }
          
            SinglyLinkedListNode extra = new SinglyLinkedListNode(-1);
            SinglyLinkedListNode temp = llist.head;

            for (int i = 0; i < llistCount; i++) {
                if (i == index) {
                    extra = temp;
                }

                if (i != llistCount-1) {
                    temp = temp.next;
                }
            }
      
            temp.next = extra;

            boolean result = c.hasCycle(llist.head);
            System.out.println(String.valueOf(result ? 1 : 0));
        }


        ob.close();
    }

}
