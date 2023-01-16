package 链表;
public class MergeTwoLists {
    public static void main(String[] args) {
        
    }
/**
 * 
 * @param list1
 * @param list2
 * @return
 */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }else if(list2 == null){
            return list1;
        }else{
            if(list1.val <= list2.val){
                list1.next=mergeTwoLists(list1.next,list2);
                return list1;
            }else{
                list2.next=mergeTwoLists(list1,list2.next);
                return list2;
            }
        }

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
