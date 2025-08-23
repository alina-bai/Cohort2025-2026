package DataStructuresAndAlgorithms.Week15;

public class LinkedList142 {
        public LinkedListCycleII141.ListNode detectCycle(LinkedListCycleII141.ListNode head) {
            LinkedListCycleII141.ListNode slow = head, fast = head;             // 1
            while (fast != null && fast.next != null) {    // 2
                slow = slow.next;                          // 3
                fast = fast.next.next;                     // 4
                if (slow == fast) {                        // 5
                    LinkedListCycleII141.ListNode ptr = head;                   // 6
                    while (ptr != slow) {                  // 7
                        ptr = ptr.next;                    // 8
                        slow = slow.next;                  // 9
                    }
                    return ptr;                            // 10
                }
            }
            return null;                                   // 11
        }
    }



