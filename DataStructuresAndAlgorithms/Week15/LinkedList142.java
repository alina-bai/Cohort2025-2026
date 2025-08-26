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

        public static void main(String[] args) {
            // Создаём узлы
            LinkedListCycleII141.ListNode node1 = new LinkedListCycleII141.ListNode(3);
            LinkedListCycleII141.ListNode node2 = new LinkedListCycleII141.ListNode(2);
            LinkedListCycleII141.ListNode node3 = new LinkedListCycleII141.ListNode(0);
            LinkedListCycleII141.ListNode node4 = new LinkedListCycleII141.ListNode(-4);

            // Строим список: 3 -> 2 -> 0 -> -4
            node1.next = node2;
            node2.next = node3;
            node3.next = node4;

            // Создаём цикл: последний узел (-4) указывает на node2
            node4.next = node2;

            // Проверяем
            LinkedList142 solution = new LinkedList142();
            LinkedListCycleII141.ListNode cycleStart = solution.detectCycle(node1);

            if (cycleStart != null) {
                System.out.println("Цикл начинается с узла со значением: " + cycleStart.val);
            } else {
                System.out.println("Цикл отсутствует");
            }
        }
    }




