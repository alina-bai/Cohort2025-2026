package DataStructuresAndAlgorithms.Week15;

import java.util.List;

public class LinkedListCycleII141 {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }

        return false;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x ) { val = x; next = null;}
    }

    public static void main(String[] args) {
        LinkedListCycleII141 link = new LinkedListCycleII141();

        // 1) Список без цикла: 1 -> 2 -> 3 -> null
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        System.out.println("List 1 has cycle? " + link.hasCycle(head1));

        // 2) Список с циклом: 1 -> 2 -> 3 -> 4 -> (ссылка назад на 2)
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = head2.next; // цикл (4 -> 2)

        System.out.println("List 2 has cycle? " + link.hasCycle(head2));
    }
}


