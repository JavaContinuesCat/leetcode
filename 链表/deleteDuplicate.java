package 链表;
public class deleteDuplicate {
public static void main(String[] args) {
    
}   

public ListNode deleteDuplicates(ListNode head) {
    if(head == null){
        return head;
    }
    ListNode header = new ListNode();
    header.next = head;
    ListNode g = header;
    

    ListNode left = head;
    ListNode right = head.next;

    while(right != null){
        if(left.val == right.val){
            right = right.next;
        }else{
            if(left.val == left.next.val){
                g.next = right;
                left = right;
                right = right.next;
            }else{
                left = left.next;
                g = g.next;
                right = right.next;
            }
        }
    }

    if(left.next != null && left.val == left.next.val){
        g.next = null;
    }

    return header.next;

}
}
