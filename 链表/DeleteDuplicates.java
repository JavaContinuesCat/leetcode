package 链表;
public class DeleteDuplicates {
    public static void main(String[] args) {
        
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode left = new ListNode();
        left=head;
        ListNode right = new ListNode();
        right.next=head.next;
        while(right.next != null ){
            if(left.val == right.next.val){
                right=right.next;
            }else{
                left.next=right.next;
                left=left.next;
                right=right.next;
            }

        }
        if(left.val == right.val){
            left.next = null;
        }
        return head;
    }
}
