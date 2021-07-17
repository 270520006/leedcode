package 第2题_两数相加;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(0);
        ListNode curr =pre;
        int carry =0;
        while(l1!=null&&l2!=null)
        {
        int tmp=l1.val+l2.val+carry;
        curr.next=new ListNode(tmp%10);
        carry=tmp/10;

        curr=curr.next;
        l1=l1.next;
        l2=l2.next;
        }
        while(l1!=null)
        {
            int tmp=l1.val+carry;
            curr.next=new ListNode(tmp%10);
            carry=tmp/10;

            curr=curr.next;
            l1=l1.next;
        }

        while(l2!=null)
        {
            int tmp=l2.val+carry;
            curr.next=new ListNode(tmp%10);
            carry=tmp/10;

            curr=curr.next;
            l2=l2.next;
        }
        if (carry!=0){
            curr.next=new ListNode(carry);
        }
        return pre.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next=new ListNode(4);
        l1.next.next=new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(4);
        l2.next.next.next=new ListNode(4);
        Solution solution = new Solution();
        ListNode listNode = solution.addTwoNumbers(l1, l2);
        System.out.println(listNode);
    }

}
