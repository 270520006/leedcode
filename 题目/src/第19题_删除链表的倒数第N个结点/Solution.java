package 第19题_删除链表的倒数第N个结点;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int  index=0,sum=n;
        ListNode left=head,right=head;
        if (head==null){return head;}
        if (head.next==null){return null;}
        while(right.next!=null){
            left=right;
            sum=n+1;
            while(sum>0){
                if (left.next==null){
                    if (sum!=1){
                        //假设{1,2}，我要删除倒数第二个
                        //sum=3,那在第2个循环的时候就要删除
                        //此时sum=2，说明是头部节点
                        return head.next;
                    }
                    right.next=right.next.next;
                    return head;
                }
                left=left.next;
                sum--;
            }
            right=right.next;

        }
        return head;
    }
    //{1,2,3,4}
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
//        ListNode node2 = new ListNode(3);
//        ListNode node3 = new ListNode(4);
        head.next=node1;
//        node1.next=node2;
//        node2.next=node3;
        ListNode listNode = solution.removeNthFromEnd(head, 2);
        System.out.println(listNode);

    }
}
