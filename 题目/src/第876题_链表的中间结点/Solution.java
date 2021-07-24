package 第876题_链表的中间结点;

public class Solution {
    public ListNode middleNode(ListNode head) {
        int i=1;
        int mid =0;
        ListNode curr=head;
        if(head==null||head.next==null)return head;
        while(curr.next!=null){
            i++;
            curr=curr.next;
        }

        if (i%2==1){
            mid=i/2;
            while(mid>0){
                head=head.next;
                mid--;
            }
        }else {
            mid=(i+1)/2;
            while(mid>0){
                head=head.next;
                mid--;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
//        ListNode node3 = new ListNode(3);
        head.next=node1;
        node1.next=node2;
//        node2.next=node3;
        ListNode listNode = solution.middleNode(head);
        System.out.println(listNode.val);
    }
}
