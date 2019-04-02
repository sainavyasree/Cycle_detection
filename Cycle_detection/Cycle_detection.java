package Cycle_detection;


public class Cycle_detection {

        // Complete the hasCycle function below.

        /*
         * For your reference:
         *
         * SinglyLinkedListNode {
         *     int data;
         *     SinglyLinkedListNode next;
         * }
         *
         */
       public boolean hasCycle(SinglyLinkedListNode head)
        {
            if (head == null)
            {
            return false;
            }

            SinglyLinkedListNode back = head;
            SinglyLinkedListNode forward = head;

            while (forward != null && forward.next != null)
            {
            back = back.next;
            forward = forward.next.next;
            if (back == forward)
                {
                    return true;
                }
            }

        return false;
        }

       
 }
